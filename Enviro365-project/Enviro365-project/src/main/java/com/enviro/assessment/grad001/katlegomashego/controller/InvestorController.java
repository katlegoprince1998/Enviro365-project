package com.enviro.assessment.grad001.katlegomashego.controller;

import com.enviro.assessment.grad001.katlegomashego.dto.InvestorDto;
import com.enviro.assessment.grad001.katlegomashego.service.investor.InvestorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/v1/investor")
@RequiredArgsConstructor
public class InvestorController {
    private final InvestorService investorService;

    @PostMapping("/create")
    public ResponseEntity<InvestorDto> createInvestor(@RequestBody InvestorDto investorDto){
       investorService.createInvestor(investorDto);
       return ResponseEntity.ok(investorDto);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<InvestorDto> getInvestorById(@PathVariable Long id){
        return ResponseEntity.ok(investorService.getInvestorById(id));
    }
}
