package com.kodilla.bank.homework;

import java.util.ArrayList;

public class Bank {
    private ArrayList<CashMachine> cashMachines = new ArrayList<>();
    private int balance;

    public Bank(ArrayList<CashMachine> realizedTransfers) {
        this.cashMachines = realizedTransfers;
    }

    public int getBalanceFromAllMachines(){
        int sum = 0;
        for (CashMachine cashMachine: cashMachines){
            balance = cashMachine.getBalanceFromMachine();
            sum += balance;
            System.out.println(balance);
            System.out.println(sum);
        }
        return sum;
    }

    public int getCountOfAllDebitTransfers(){
        int sum = 0;
        for (CashMachine cashMachine: cashMachines){
            sum+= cashMachine.getCountOfDebitTransfers();
        }
        return sum;
    }

    public int getCountOfAllCreditTransfers(){
        int sum = 0;
        for (CashMachine cashMachine: cashMachines){
            sum+= cashMachine.getCountOfCreditTransfers();
        }
        return sum;
    }

    public int averageOfAllDebitTransfers(){
        int sum = 0;
        int countOfTransfers = 0;
        for (CashMachine cashMachine: cashMachines){
            sum+= cashMachine.getSumOfDebitTransfers();
            countOfTransfers+= cashMachine.getCountOfDebitTransfers();
        }
        return -sum/countOfTransfers;
    }

    public int averageOfAllCreditTransfers(){
        int sum = 0;
        int countOfTransfers = 0;
        for (CashMachine cashMachine: cashMachines){
            sum+= cashMachine.getSumOfCreditTransfers();
            countOfTransfers+= cashMachine.getCountOfCreditTransfers();
        }
        return sum/countOfTransfers;
    }

}
