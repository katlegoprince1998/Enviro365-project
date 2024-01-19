package com.enviro.assessment.grad001.katlegomashego.service.withdrawalNotice;

import com.enviro.assessment.grad001.katlegomashego.dto.WithdrawalNoticeDto;
import com.enviro.assessment.grad001.katlegomashego.entity.Investor;
import com.enviro.assessment.grad001.katlegomashego.entity.Product;
import com.enviro.assessment.grad001.katlegomashego.entity.WithdrawalNotice;
import com.enviro.assessment.grad001.katlegomashego.entity.productType.ProductType;
import com.enviro.assessment.grad001.katlegomashego.exception.amountExceeded.CustomUserException;
import com.enviro.assessment.grad001.katlegomashego.repository.InvestorRepository;
import com.enviro.assessment.grad001.katlegomashego.repository.ProductRepository;
import com.enviro.assessment.grad001.katlegomashego.repository.WithdrawalNoticeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class WithdrawalNoticeServiceImpl implements WithdrawalNoticeService {
    private final WithdrawalNoticeRepository noticeRepository;
    private final InvestorRepository investorRepository;
    private final ProductRepository productRepository;


    @Override


    public WithdrawalNoticeDto createWithdrawalNotice(
            WithdrawalNoticeDto notice, Long investorId, Long productId) {

        Investor investor = investorRepository.findById(investorId).orElse(null);
        Product product = productRepository.findById(productId).orElse(null);

        if (investor != null && product != null) {
            int yearBorn = investor.getYearBorn();
            LocalDate currentDate = LocalDate.now();


            int currentYear = currentDate.getYear();

            int age = currentYear - yearBorn;

            if (ProductType.RETIREMENT.equals(product.getType()) && age >= 65) {
                if (notice.getAmount() <= product.getCurrentBalance()) {
                    if (notice.getAmount() < product.getCurrentBalance() * 0.9) {
                        WithdrawalNotice withdrawalNotice = new WithdrawalNotice();
                        BeanUtils.copyProperties(notice, withdrawalNotice);

                        withdrawalNotice.setInvestor(investor);
                        withdrawalNotice.setProduct(product);

                        notice.setId(withdrawalNotice.getId());

                        noticeRepository.save(withdrawalNotice);
                    }else {
                        throw new CustomUserException("You are not allowed to withdraw 90 percent of your current balance");
                    }

                }else {
                    throw new CustomUserException("Amount can not exceed the current balance");
                }
            }else{
                throw new CustomUserException("Age or product type not correct");

            }
        }else{
            throw new CustomUserException("Fields not found");
        }

        return notice;
    }

}
