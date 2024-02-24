package com.example.ebankingservice.reposotories;

import com.example.ebankingservice.entities.BanKAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BanKAccount,String> {

}
