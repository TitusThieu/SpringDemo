package com.higgsup.intern.spring.demo;

import com.higgsup.intern.spring.pojo.Account;
import com.higgsup.intern.spring.pojo.Address;
import com.higgsup.intern.spring.pojo.Person;
import org.springframework.context.annotation.Bean;

public class AppConfig {
    private Account account;
    private Address address;
    private String name;
    private int age;

    @Bean
    public Person person(){
        return new Person(name, age, address, account);
    }

    @Bean
    public Account account(){
        return new Account();
    }

    @Bean
    public Address address(){
        return new Address();
    }
}

