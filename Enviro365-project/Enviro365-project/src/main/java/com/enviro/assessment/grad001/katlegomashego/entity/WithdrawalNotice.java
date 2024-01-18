package com.enviro.assessment.grad001.katlegomashego.entity;

import com.enviro.assessment.grad001.katlegomashego.entity.bankingDetails.BankingDetails;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tbl_withdrawal_notice")
public class WithdrawalNotice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private BankingDetails bankingDetails;
    private double amount;
    private Date date;

    private Product product;
    @ManyToOne
    @JoinColumn(name = "withdrawalNotice")
    private Investor investor;
}
