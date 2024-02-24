package com.example.ebankingservice.entities;

import com.example.ebankingservice.enums.AccountType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class BanKAccount {
    @Id
    private String id;
    private Date createdAt;
    private String currency;
    private double balance;
    private AccountType type;

}
