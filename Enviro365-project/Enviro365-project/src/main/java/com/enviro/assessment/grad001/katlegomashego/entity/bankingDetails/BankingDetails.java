package com.enviro.assessment.grad001.katlegomashego.entity.bankingDetails;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
public class BankingDetails {

    private String bankName;
    private String bankType;
    private String cvv;
    private LocalDate expiryDate;

}
