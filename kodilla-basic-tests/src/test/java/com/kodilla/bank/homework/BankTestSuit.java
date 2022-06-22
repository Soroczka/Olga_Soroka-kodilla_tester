package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuit {
    ArrayList<CashMachine> cashMachines = new ArrayList<>();
    Bank bank = new Bank(cashMachines);

    @Test
    public void shouldGetBalanceFromAllMachinesWhenTransfersProceed(){
        //Given
        ArrayList<Integer> realizedTransfers = new ArrayList<>();
        CashMachine cashMachine = new CashMachine(realizedTransfers, 1000);
        ArrayList<Integer> realizedTransfers2 = new ArrayList<>();
        CashMachine cashMachine2 = new CashMachine(realizedTransfers2, 2000);
        cashMachines.add(cashMachine);
        cashMachines.add(cashMachine2);
        cashMachine.payIn(1000);
        cashMachine.payIn(500);
        cashMachine.payOut(200); //1000+1000+500-200 = 2300
        cashMachine2.payIn(200);
        cashMachine2.payIn(500);
        cashMachine2.payOut(200);
        cashMachine2.payOut(100);
        cashMachine2.payOut(100); //2000+200+500-200-100-100 = 2300
        //2300+2300 = 4600

        //When
        double balance = bank.getBalanceFromAllMachines();
        //Then
        assertEquals(4600, balance);
    }

    @Test
    public void shouldGetBalanceZero(){
        //Given
        ArrayList<Integer> realizedTransfers = new ArrayList<>();
        CashMachine cashMachine = new CashMachine(realizedTransfers, 1000);
        ArrayList<Integer> realizedTransfers2 = new ArrayList<>();
        CashMachine cashMachine2 = new CashMachine(realizedTransfers2, 1000);
        cashMachines.add(cashMachine);
        cashMachines.add(cashMachine2);
        cashMachine.payIn(1000);
        while(cashMachine.getCashMachineBalance()>0){
            cashMachine.payOut(20);
        }
        cashMachine2.payOut(1000);

        //When
        double balance = bank.getBalanceFromAllMachines();

        //Then
        assertEquals(0, balance);
    }

    @Test
    public void shouldGetBalanceWhenAnyTransferProceed(){
        //Given
        ArrayList<Integer> realizedTransfers = new ArrayList<>();
        CashMachine cashMachine = new CashMachine(realizedTransfers, 50000);
        ArrayList<Integer> realizedTransfers2 = new ArrayList<>();
        CashMachine cashMachine2 = new CashMachine(realizedTransfers2, 50000);
        cashMachines.add(cashMachine);
        cashMachines.add(cashMachine2);

        //When
        double balance = bank.getBalanceFromAllMachines();

        //Then
        assertEquals(100000, balance);
    }

    @Test
    public void shouldReturnCountZeroWhenAnyDebitTransferProceed(){
        //Given
        ArrayList<Integer> realizedTransfers = new ArrayList<>();
        CashMachine cashMachine = new CashMachine(realizedTransfers, 5000);
        ArrayList<Integer> realizedTransfers2 = new ArrayList<>();
        CashMachine cashMachine2 = new CashMachine(realizedTransfers2, 5000);
        cashMachines.add(cashMachine);
        cashMachines.add(cashMachine2);

        //When
        cashMachine.payIn(1000);
        cashMachine2.payIn(1000);
        int count = bank.getCountOfAllDebitTransfers();

        //Then
        assertEquals(0, count);
    }

    @Test
    public void shouldReturnCountZeroWhenAnyCreditTransferProceed(){
        //Given
        ArrayList<Integer> realizedTransfers = new ArrayList<>();
        CashMachine cashMachine = new CashMachine(realizedTransfers, 50000);
        ArrayList<Integer> realizedTransfers2 = new ArrayList<>();
        CashMachine cashMachine2 = new CashMachine(realizedTransfers2, 50000);
        cashMachines.add(cashMachine);
        cashMachines.add(cashMachine2);

        //When
        cashMachine.payOut(1000);
        cashMachine2.payOut(200);
        int count = bank.getCountOfAllCreditTransfers();

        //Then
        assertEquals(0, count);
    }

    @Test
    public void shouldReturnCountOfAllCreditTransfers(){
        //Given
        ArrayList<Integer> realizedTransfers = new ArrayList<>();
        CashMachine cashMachine = new CashMachine(realizedTransfers, 5000);
        ArrayList<Integer> realizedTransfers2 = new ArrayList<>();
        CashMachine cashMachine2 = new CashMachine(realizedTransfers2, 5000);
        cashMachines.add(cashMachine);
        cashMachines.add(cashMachine2);

        //When
        cashMachine.payIn(1000);
        cashMachine2.payIn(200);
        int count = bank.getCountOfAllCreditTransfers();

        //Then
        assertEquals(2, count);
    }

    @Test
    public void shouldReturnCountOfAllDebitTransfers(){
        //Given
        ArrayList<Integer> realizedTransfers = new ArrayList<>();
        CashMachine cashMachine = new CashMachine(realizedTransfers, 50000);
        ArrayList<Integer> realizedTransfers2 = new ArrayList<>();
        CashMachine cashMachine2 = new CashMachine(realizedTransfers2, 50000);
        cashMachines.add(cashMachine);
        cashMachines.add(cashMachine2);

        //When
        cashMachine.payOut(1000);
        cashMachine.payOut(1000);
        cashMachine.payOut(1000);
        cashMachine2.payOut(200);
        int count = bank.getCountOfAllDebitTransfers();

        //Then
        assertEquals(4, count);
    }

    @Test
    public void shouldReturnAverageOfAllDebitTransfers(){
        //Given
        ArrayList<Integer> realizedTransfers = new ArrayList<>();
        CashMachine cashMachine = new CashMachine(realizedTransfers, 50000);
        ArrayList<Integer> realizedTransfers2 = new ArrayList<>();
        CashMachine cashMachine2 = new CashMachine(realizedTransfers2, 50000);
        cashMachines.add(cashMachine);
        cashMachines.add(cashMachine2);

        //When
        cashMachine.payOut(1000);
        cashMachine.payOut(1000);
        cashMachine.payOut(1000);
        cashMachine2.payOut(200);
        double average = bank.averageOfAllDebitTransfers();

        //Then
        assertEquals(800, average);
    }

    @Test
    public void shouldReturnZeroWhenAnyDebitTransferProceed(){
        //Given
        ArrayList<Integer> realizedTransfers = new ArrayList<>();
        CashMachine cashMachine = new CashMachine(realizedTransfers, 5000);
        ArrayList<Integer> realizedTransfers2 = new ArrayList<>();
        CashMachine cashMachine2 = new CashMachine(realizedTransfers2, 5000);
        cashMachines.add(cashMachine);
        cashMachines.add(cashMachine2);

        //When
        cashMachine.payIn(1000);
        cashMachine.payIn(1000);
        cashMachine.payIn(1000);
        cashMachine2.payIn(200);
        double average = bank.averageOfAllDebitTransfers();

        //Then
        assertEquals(0, average);
    }

    @Test
    public void shouldReturnAverageOfAllCreditTransfers(){
        //Given
        ArrayList<Integer> realizedTransfers = new ArrayList<>();
        CashMachine cashMachine = new CashMachine(realizedTransfers, 5000);
        ArrayList<Integer> realizedTransfers2 = new ArrayList<>();
        CashMachine cashMachine2 = new CashMachine(realizedTransfers2, 5000);
        cashMachines.add(cashMachine);
        cashMachines.add(cashMachine2);

        //When
        cashMachine.payIn(200);
        cashMachine.payIn(500);
        double average = bank.averageOfAllCreditTransfers();

        //Then
        assertEquals(350, average);
    }

    @Test
    public void shouldReturnZeroWhenAnyCreditTransferProceed(){
        //Given
        ArrayList<Integer> realizedTransfers = new ArrayList<>();
        CashMachine cashMachine = new CashMachine(realizedTransfers, 50000);
        ArrayList<Integer> realizedTransfers2 = new ArrayList<>();
        CashMachine cashMachine2 = new CashMachine(realizedTransfers2, 50000);
        cashMachines.add(cashMachine);
        cashMachines.add(cashMachine2);

        //When
        cashMachine.payOut(1000);
        cashMachine.payOut(1000);
        cashMachine.payOut(1000);
        cashMachine2.payOut(200);
        double average = bank.averageOfAllCreditTransfers();

        //Then
        assertEquals(0, average);
    }
}
