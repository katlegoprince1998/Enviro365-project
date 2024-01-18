package com.enviro.assessment.grad001.katlegomashego.service.investor;

import com.enviro.assessment.grad001.katlegomashego.dto.InvestorDto;
import com.enviro.assessment.grad001.katlegomashego.entity.Investor;

import java.util.List;

public interface InvestorService {
    InvestorDto createInvestor(InvestorDto investorDto);
    InvestorDto getInvestorById(Long id);
}
