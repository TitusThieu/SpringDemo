package com.higgsup.intern.spring.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Value("Tu")
    private String name;
    @Value("24")
    private int age;
    @Autowired
    private Address address;
    @Autowired
    private Account account;


    public Person() {
        System.out.println("Default Constructor!");
    }


    public Person(String name, int age, Address address, Account account) {
        System.out.println("Constructor Injection!");
        this.name = name;
        this.age = age;
        this.address = address;
        this.account = account;
    }
    public Person(String name, int age) {
        System.out.println("Constructor Injection!");
        this.name = name;
        this.age = age;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", account=" + account +
                '}';
    }
}
