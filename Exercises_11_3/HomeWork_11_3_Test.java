package com.linghao.Exercises_11_3;

/**
 * @author zoulinghao
 * @create 2021-04-12-19:52
 */
public class HomeWork_11_3_Test {
    public static void main(String[] args) {
        Account account = new Account(1, 1000);
        CheckAccount checkAccount = new CheckAccount(2, 2000,5000);
        SaveAccount saveAccount = new SaveAccount(3, 3000);

        System.out.println("-----Account------");
        System.out.println(account);
        System.out.println("----CheckAccount---");
        System.out.println(checkAccount);
        System.out.println("----SaveAccount----");
        System.out.println(saveAccount);

    }
}
