package com.enviro.assessment.grad001.katlegomashego.dto;

import com.enviro.assessment.grad001.katlegomashego.entity.Product;
import com.enviro.assessment.grad001.katlegomashego.entity.WithdrawalNotice;
import com.enviro.assessment.grad001.katlegomashego.entity.investorAddress.Address;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InvestorDto {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private int yearBorn;
    private Address address;

}
