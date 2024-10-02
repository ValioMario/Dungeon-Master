package Практические_занятия;

public class BankAccount {
    private int money;
    public BankAccount(int money) {

        this.money = money;
    }
    public int checkMoney(){

        return money;
    }
    public void putMoney(int quantity){

        money += quantity;
    }
    public int withdrawMoney(){
        int withdraw = money;
        money = 0;
        return withdraw;
    }
    public double checkInDollars(){

        return money / ExchangeRate.getDollarRate();
    }
    public double checkInDEuros(){

        return money / ExchangeRate.getEuroRate();
    }
}
