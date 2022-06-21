package com.kodilla.bank.homework;

import java.util.ArrayList;

public class CashMachine {
    private ArrayList<Integer> realizedTransfers;
    private int cashMachineBalance;
    private final int MAXCASHMACHINEBALANCE = 50000;

    public CashMachine(ArrayList<Integer> realizedTransfers, int cashMachineBalance) {
        this.realizedTransfers = realizedTransfers;
        this.cashMachineBalance = cashMachineBalance;
    }

    public void payIn(int transferBalance){
        if (transferBalance >= 20 && transferBalance<= 10000 && (transferBalance % 20 == 0 || transferBalance % 50 == 0)) {
            if(cashMachineBalance + transferBalance <= MAXCASHMACHINEBALANCE){
                realizedTransfers.add(transferBalance);
                this.cashMachineBalance+= transferBalance;
            }
        }
    }

    public void payOut(int transferBalance){
        if (transferBalance >= 20 && transferBalance<= 1000 && (transferBalance % 20 == 0 || transferBalance % 50 == 0)) {
            if(transferBalance <= cashMachineBalance) {
                realizedTransfers.add(-transferBalance);
                this.cashMachineBalance-= transferBalance;
            }
        }
    }



    public ArrayList<Integer> getRealizedTransfers() {
        return realizedTransfers;
    }

    public int getCashMachineBalance() {
        return cashMachineBalance;
    }


}
