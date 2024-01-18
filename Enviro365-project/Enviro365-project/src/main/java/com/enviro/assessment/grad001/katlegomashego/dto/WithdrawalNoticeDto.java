package com.enviro.assessment.grad001.katlegomashego.dto;

import com.enviro.assessment.grad001.katlegomashego.entity.Investor;
import com.enviro.assessment.grad001.katlegomashego.entity.Product;
import com.enviro.assessment.grad001.katlegomashego.entity.bankingDetails.BankingDetails;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WithdrawalNoticeDto {
    private Long id;
    private double amount;
    private Date date;
    private BankingDetails bankingDetails;
    private Investor investor;
    private Product product;
}
