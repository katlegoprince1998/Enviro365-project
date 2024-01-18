package com.enviro.assessment.grad001.katlegomashego.entity.bankingDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankingDetails {
    private String bankName;
    private String bankType;
    private String cvv;
    private String expiryDate;

}
