package com.company;

public class Main {

    public static void main(String[] args) {
	Account account =new Account();
	account.setId(10000);
	account.setCode("9789798888");
	account.setBalance(100_000_100);
	account.setEnable(true);
        System.out.println(account.getBalance());
        System.out.println(account.getId());
        System.out.println(account.getCode());
        System.out.println(account.isEnable());
    }
}
