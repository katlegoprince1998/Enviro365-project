package com.enviro.assessment.grad001.katlegomashego.entity;

import com.enviro.assessment.grad001.katlegomashego.entity.productType.ProductType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private double currentBalance;
    @Enumerated
    private ProductType type;
    @ManyToOne
    @JoinColumn(name = "investor_id")
    private Investor investor;

    @OneToMany(mappedBy = "product")
    private List<WithdrawalNotice> withdrawalNotices;


}
