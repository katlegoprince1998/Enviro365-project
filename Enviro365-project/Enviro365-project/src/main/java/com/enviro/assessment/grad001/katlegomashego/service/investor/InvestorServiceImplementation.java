package com.enviro.assessment.grad001.katlegomashego.service.investor;

import com.enviro.assessment.grad001.katlegomashego.dto.InvestorDto;
import com.enviro.assessment.grad001.katlegomashego.entity.Investor;
import com.enviro.assessment.grad001.katlegomashego.entity.investorAddress.Address;
import com.enviro.assessment.grad001.katlegomashego.repository.InvestorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class InvestorServiceImplementation implements InvestorService {
    private final InvestorRepository investorRepository;
    @Override
    public InvestorDto createInvestor(InvestorDto investorDto) {
        Investor investor = new Investor(); // create investor object
        BeanUtils.copyProperties(investorDto, investor); // copy properties from investorDto to investor
        investor = investorRepository.save(investor); // save investor and get the updated entity
        // Update the InvestorDto with the new id
        investorDto.setId(investor.getId());

        return investorDto; // return investorDto
    }

    @Override
    public InvestorDto getInvestorById(Long id) {
        if(investorRepository.existsById(id)){ // check if id exists in database using existsById method from InvestorRepository
            Investor investor = investorRepository.findById(id).get(); // get investor using findById method from InvestorRepository
            InvestorDto investorDto = new InvestorDto(); // create investorDto object
            BeanUtils.copyProperties(investor, investorDto); // copy properties from investor to investorDto
            return investorDto; // return investorDto
        }
        return null;
    }
}
