package com.kodilla.bank.homework;

import java.util.ArrayList;

public class Bank {
    private ArrayList<CashMachine> cashMachines;

    public Bank(ArrayList<CashMachine> realizedTransfers) {
        this.cashMachines = realizedTransfers;

    }

    public int getBalanceFromAllMachines(){
        int actualMachinesBalance = 0;
        for (CashMachine cashMachine: cashMachines){
            actualMachinesBalance += cashMachine.getCashMachineBalance();
        }
        return actualMachinesBalance;
    }

    public int getCountOfAllDebitTransfers(){
        int count = 0;
        ArrayList<Integer> realizedTransfers;
        for (CashMachine cashMachine: cashMachines){
            realizedTransfers = cashMachine.getRealizedTransfers();
            for (Integer realizedTransfer : realizedTransfers) {
                if (realizedTransfer < 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public int getCountOfAllCreditTransfers(){
        int count = 0;
        ArrayList<Integer> realizedTransfers;
        for (CashMachine cashMachine: cashMachines){
            realizedTransfers = cashMachine.getRealizedTransfers();
            for (Integer realizedTransfer : realizedTransfers) {
                if (realizedTransfer > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public int averageOfAllDebitTransfers(){
        int sum = 0;
        int countOfTransfers = 0;
        ArrayList<Integer> realizedTransfers;
        for (CashMachine cashMachine: cashMachines){
            realizedTransfers = cashMachine.getRealizedTransfers();
            for (Integer realizedTransfer : realizedTransfers) {
                if (realizedTransfer < 0) {
                    sum += realizedTransfer;
                    countOfTransfers++;
                }
            }
        }
        if (countOfTransfers > 0){
            return -sum/countOfTransfers;
        }
        return 0;
    }

    public int averageOfAllCreditTransfers(){
        int sum = 0;
        int countOfTransfers = 0;
        ArrayList<Integer> realizedTransfers;
        for (CashMachine cashMachine: cashMachines){
            realizedTransfers = cashMachine.getRealizedTransfers();
            for (Integer realizedTransfer : realizedTransfers) {
                if (realizedTransfer > 0) {
                    sum += realizedTransfer;
                    countOfTransfers++;
                }
            }
        }
        if (countOfTransfers > 0){
            return sum/countOfTransfers;
        }
        return 0;
    }

}
