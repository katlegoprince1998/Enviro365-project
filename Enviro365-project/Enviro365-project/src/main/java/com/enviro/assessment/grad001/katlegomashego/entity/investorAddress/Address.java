package com.enviro.assessment.grad001.katlegomashego.entity.investorAddress;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Address {
    private String city;
    private String town;
    private String province;
    private String houseNo;
    private String code;
}
