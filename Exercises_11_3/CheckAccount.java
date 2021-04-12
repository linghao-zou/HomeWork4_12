package com.linghao.Exercises_11_3;

/**
 * @author zoulinghao
 * @create 2021-04-12-19:44
 */
public class CheckAccount extends Account{
    private double overdraftMoney;
    public CheckAccount(){

    }
    public CheckAccount(int id,double balance){
        super(id,balance);
    }
    public CheckAccount(int id,double balance,double overdraftMoney){
        super(id,balance);
        this.overdraftMoney=overdraftMoney;
    }

    @Override
    public String toString() {
        return "CheckAccount{" +
                "id="+getId() +
                ",overdraftMoney=" + overdraftMoney +
                ",balance="+getBalance()+
                ", dateCreated=" + getDateCreated() +
                '}';
    }
}
