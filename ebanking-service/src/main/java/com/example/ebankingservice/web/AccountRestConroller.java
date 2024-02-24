package com.example.ebankingservice.web;

import com.example.ebankingservice.entities.BanKAccount;
import com.example.ebankingservice.reposotories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountRestConroller {
    @Autowired
    private BankAccountRepository bankAccountRepository;
    @GetMapping("/bankAccounts")
    public List<BanKAccount> banKAccounts(){

        return bankAccountRepository.findAll();
    }
    @GetMapping("/bankAccounts/{id}")
    public BanKAccount banKAccount(@PathVariable String id){

        return bankAccountRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("account %s not found",id)));
    }


}
