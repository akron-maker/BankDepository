package com.akron.BankDepository;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.akron.BankDepository.mapper")
public class BankDepositoryService {
    public static void main(String[] args) {
        SpringApplication.run(BankDepositoryService.class,args);
    }
}
