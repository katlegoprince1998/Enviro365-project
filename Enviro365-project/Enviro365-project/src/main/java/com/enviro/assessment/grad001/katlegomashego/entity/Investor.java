package com.enviro.assessment.grad001.katlegomashego.entity;


import com.enviro.assessment.grad001.katlegomashego.entity.investorAddress.Address;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Builder

@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Investor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private Date dateOfBirth;
    @Embedded
    private Address address;

    @OneToMany(mappedBy = "investor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Product> products;

    @OneToMany(mappedBy = "investor")
    private List<WithdrawalNotice> withdrawalNotices;

}
