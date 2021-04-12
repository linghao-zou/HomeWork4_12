package com.linghao.Exercises_11_3;

/**
 * @author zoulinghao
 * @create 2021-04-12-19:51
 */
public class SaveAccount extends Account{
    public SaveAccount(){

    }
    public SaveAccount(int id,double balance){
        super(id,balance);
    }

    @Override
    public String toString() {
        return "SaveAccount{" +
                "id=" + getId() +
                ", balance=" + getBalance() +
                ", dateCreated=" + getDateCreated() +
                '}';
    }
}
