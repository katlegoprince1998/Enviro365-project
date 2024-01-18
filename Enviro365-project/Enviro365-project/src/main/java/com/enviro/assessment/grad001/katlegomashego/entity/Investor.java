package com.enviro.assessment.grad001.katlegomashego.entity;

import com.enviro.assessment.grad001.katlegomashego.entity.investorAddress.Address;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Builder
@Table(name = "tbl_investor")
@AllArgsConstructor
@NoArgsConstructor

public class Investor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private List<Address> addresses;
    @OneToMany(
            mappedBy = "tbl_product",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Product> products;
    @OneToMany(
            mappedBy = "withdrawalNotice",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<WithdrawalNotice> notices;

}
