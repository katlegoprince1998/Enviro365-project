package com.enviro.assessment.grad001.katlegomashego.entity.investorAddress;

import com.enviro.assessment.grad001.katlegomashego.entity.Investor;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
public class Address {

    private String city;
    private String town;
    private String province;
    private String houseNo;
    private String code;

}
