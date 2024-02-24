package com.example.ebankingservice;

import com.example.ebankingservice.entities.BanKAccount;
import com.example.ebankingservice.enums.AccountType;
import com.example.ebankingservice.reposotories.BankAccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class EbankingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbankingServiceApplication.class, args);
	}
@Bean
	CommandLineRunner start(BankAccountRepository bankAccountRepository){
		return args -> {
			for (int i = 0; i <10 ; i++) {
				BanKAccount banKAccount=BanKAccount.builder()
						.id(UUID.randomUUID().toString())
						.type(Math.random()>0.5 ? AccountType.CURRENT_ACCOUNT:AccountType.SAVING_ACCOUNT)
						.balance(10000+Math.random()*90000)
						.createdAt(new Date())
						.currency("MAD")
						.build();
				bankAccountRepository.save(banKAccount);


			}};
}
}
