package com.linghao.Exercises_11_3;

import java.util.Date;

/**
 * @author zoulinghao
 * @create 2021-04-12-19:40
 */
public class Account {
    private int id=0;
    private double balance=0;
    private static double annualInterestRate=0;
    private Date dateCreated;

    public Account(){
        dateCreated=new Date();
    }
    public Account(int id,double balance){
        this.id=id;
        this.balance= balance;
        this.dateCreated=new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return Account.annualInterestRate / 12 ;
    }
    public double getMonthlyInterest(){
        return balance * (1 + getMonthlyInterestRate());
    }

    public void deposit(double money){
        balance+=money;
    }
    public void withDraw(double money){
        balance-=money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
