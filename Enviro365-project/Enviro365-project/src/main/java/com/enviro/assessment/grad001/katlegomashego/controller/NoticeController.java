package com.enviro.assessment.grad001.katlegomashego.controller;

import com.enviro.assessment.grad001.katlegomashego.dto.WithdrawalNoticeDto;
import com.enviro.assessment.grad001.katlegomashego.service.withdrawalNotice.WithdrawalNoticeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/notice")
@RestController
@RequiredArgsConstructor
public class NoticeController {
    private final WithdrawalNoticeService service;
    @PostMapping("/create/investor/{investorId}/product/{productId}")
    public ResponseEntity<WithdrawalNoticeDto> createNotice(
            @RequestBody WithdrawalNoticeDto withdrawalNoticeDto, @PathVariable("investorId")
             Long investorId,@PathVariable("productId") Long productId
    ) {
         service.createWithdrawalNotice(withdrawalNoticeDto, investorId, productId);
         return ResponseEntity.ok(withdrawalNoticeDto);
    }
}
