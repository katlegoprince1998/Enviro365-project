package com.enviro.assessment.grad001.katlegomashego.service.withdrawalNotice;

import com.enviro.assessment.grad001.katlegomashego.dto.WithdrawalNoticeDto;

public interface WithdrawalNoticeService {
    WithdrawalNoticeDto createWithdrawalNotice(WithdrawalNoticeDto notice, Long investorId, Long productId);

}
