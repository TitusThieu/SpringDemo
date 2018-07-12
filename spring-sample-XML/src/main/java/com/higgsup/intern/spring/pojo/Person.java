package com.higgsup.intern.spring.pojo;

public class Person {
    private String name;
    private int age;
    private Address address;
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
