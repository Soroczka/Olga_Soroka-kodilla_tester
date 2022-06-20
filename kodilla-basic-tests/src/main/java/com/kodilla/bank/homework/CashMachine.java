package com.kodilla.bank.homework;

import java.util.ArrayList;

public class CashMachine {
    private ArrayList<Integer> realizedTransfers = new ArrayList<>();
    private int machineBalance;

    public CashMachine(ArrayList<Integer> realizedTransfers) {
        this.realizedTransfers = realizedTransfers;
    }

    public void payIn(int transferBalance){
        if (transferBalance >= 20 && transferBalance<= 10000 && (transferBalance % 20 == 0 || transferBalance % 50 == 0)) {
            realizedTransfers.add(transferBalance);
        }
    }

    public void payOut(int transferBalance){
        if (transferBalance >= 20 && transferBalance<= 1000 && (transferBalance % 20 == 0 || transferBalance % 50 == 0)) {
            realizedTransfers.add(-transferBalance);
        }
    }

    public int getBalanceFromMachine(){
        machineBalance = 0;
        for (int i = 0; i < realizedTransfers.size(); i++){
            machineBalance += realizedTransfers.get(i);
        }
        System.out.println(machineBalance);
        return machineBalance;
    }

    public int getCountOfCreditTransfers(){
        int sum = 0;
        for (int i = 0; i < realizedTransfers.size(); i++){
            if (realizedTransfers.get(i) > 0 ){
                sum++;
            }
        }
        return sum;
    }

    public int getCountOfDebitTransfers(){
        int sum = 0;
        for (int i = 0; i < realizedTransfers.size(); i++){
            if (realizedTransfers.get(i) < 0 ){
                sum++;
            }
        }
        return sum;
    }

    public double getSumOfCreditTransfers(){
        double sum = 0;
        for (int i = 0; i < realizedTransfers.size(); i++){
            if (realizedTransfers.get(i) > 0 ){
                sum+= realizedTransfers.get(i);
            }
        }
        return sum;
    }

    public double getSumOfDebitTransfers(){
        double sum = 0;
        for (int i = 0; i < realizedTransfers.size(); i++){
            if (realizedTransfers.get(i) < 0 ){
                sum+= realizedTransfers.get(i);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> realizedTransfers = new ArrayList<>();
        CashMachine cashMachine = new CashMachine(realizedTransfers);
        cashMachine.payIn(1000);
        cashMachine.payIn(500);
        cashMachine.payOut(200);
        cashMachine.getBalanceFromMachine();
        ArrayList<Integer> realizedTransfers2 = new ArrayList<>();
        CashMachine cashMachine2 = new CashMachine(realizedTransfers2);
        cashMachine2.payIn(200);
        cashMachine2.payIn(500);
        cashMachine2.payOut(200);
        cashMachine2.payOut(100);
        cashMachine2.getBalanceFromMachine();
        ArrayList<CashMachine> cashMachines = new ArrayList<>();
        Bank bank = new Bank(cashMachines);
        cashMachines.add(cashMachine);
        cashMachines.add(cashMachine2);
        bank.getBalanceFromAllMachines();

//        System.out.println(cashMachine.getCountOfAllTransfers());
//        System.out.println(cashMachine2.getCountOfAllTransfers());
        System.out.println(bank.getCountOfAllDebitTransfers());
        System.out.println(bank.getCountOfAllCreditTransfers());
        System.out.println(bank.averageOfAllCreditTransfers());
        System.out.println(bank.averageOfAllDebitTransfers());


    }

}
