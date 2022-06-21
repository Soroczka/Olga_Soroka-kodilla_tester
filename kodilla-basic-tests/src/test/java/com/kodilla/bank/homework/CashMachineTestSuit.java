package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class CashMachineTestSuit {
    private ArrayList<Integer> realizedTransfers = new ArrayList<>();


    @Test
    public void shouldNotPayInIfZero(){
        CashMachine cashMachine = new CashMachine(realizedTransfers, 20000);
        cashMachine.payIn(0);
        assertFalse(realizedTransfers.contains(0));
    }

    @Test
    public void shouldNotPayInIfNegative(){
        CashMachine cashMachine = new CashMachine(realizedTransfers, 20000);
        cashMachine.payIn(-1000);
        assertFalse(realizedTransfers.contains(-1000));
    }

    @Test
    public void shouldNotPayInIfAboveTransferLimit(){
        CashMachine cashMachine = new CashMachine(realizedTransfers, 20000);
        cashMachine.payIn(10100);
        assertFalse(realizedTransfers.contains(10100));
    }

    @Test
    public void shouldPayInIfIs20(){
        CashMachine cashMachine = new CashMachine(realizedTransfers, 20000);
        cashMachine.payIn(20);
        assertTrue(realizedTransfers.contains(20));
    }

    @Test
    public void shouldPayInIfIs10000(){
        CashMachine cashMachine = new CashMachine(realizedTransfers, 20000);
        cashMachine.payIn(10000);
        assertTrue(realizedTransfers.contains(10000));
    }

    @Test
    public void shouldPayInIfIsCash(){
        CashMachine cashMachine = new CashMachine(realizedTransfers, 20000);
        cashMachine.payIn(1000);
        cashMachine.payIn(50);
        cashMachine.payIn(100);
        cashMachine.payIn(200);
        assertTrue(realizedTransfers.contains(1000));
        assertTrue(realizedTransfers.contains(50));
        assertTrue(realizedTransfers.contains(100));
        assertTrue(realizedTransfers.contains(200));
    }

    @Test
    public void shouldNotPayInIfIsNotCash(){
        CashMachine cashMachine = new CashMachine(realizedTransfers, 20000);
        cashMachine.payIn(505);
        cashMachine.payIn(10);
        cashMachine.payIn(22);
        assertFalse(realizedTransfers.contains(505));
        assertFalse(realizedTransfers.contains(10));
        assertFalse(realizedTransfers.contains(22));
    }

    @Test
    public void shouldNotPayInIfCashMachineIsFull(){
        CashMachine cashMachine = new CashMachine(realizedTransfers, 50000);
        cashMachine.payIn(500);
        assertFalse(realizedTransfers.contains(500));
    }

    @Test
    public void shouldNotPayOutIfZero(){
        CashMachine cashMachine = new CashMachine(realizedTransfers, 20000);
        cashMachine.payOut(0);
        assertFalse(realizedTransfers.contains(0));
    }
    @Test
    public void shouldNotPayOutIfNegative(){
        CashMachine cashMachine = new CashMachine(realizedTransfers, 20000);
        cashMachine.payOut(-1000);
        assertFalse(realizedTransfers.contains(-1000));
    }
    @Test
    public void shouldNotPayOutIfAboveTransferLimit(){
        CashMachine cashMachine = new CashMachine(realizedTransfers, 20000);
        cashMachine.payOut(1100);
        assertFalse(realizedTransfers.contains(-1100));
    }

    @Test
    public void shouldPayOutIfIs20(){
        CashMachine cashMachine = new CashMachine(realizedTransfers, 20000);
        cashMachine.payOut(20);
        assertTrue(realizedTransfers.contains(-20));
    }

    @Test
    public void shouldPayOutIfIs1000(){
        CashMachine cashMachine = new CashMachine(realizedTransfers, 20000);
        cashMachine.payOut(1000);
        assertTrue(realizedTransfers.contains(-1000));
    }
    @Test
    public void shouldPayOutIfIsCash() {
        CashMachine cashMachine = new CashMachine(realizedTransfers, 20000);
        cashMachine.payOut(500);
        cashMachine.payOut(50);
        cashMachine.payOut(100);
        cashMachine.payOut(200);
        assertTrue(realizedTransfers.contains(-500));
        assertTrue(realizedTransfers.contains(-50));
        assertTrue(realizedTransfers.contains(-100));
        assertTrue(realizedTransfers.contains(-200));
    }
    @Test
    public void shouldNotPayOutIfIsNotCash(){
        CashMachine cashMachine = new CashMachine(realizedTransfers, 20000);
        cashMachine.payOut(505);
        cashMachine.payOut(10);
        cashMachine.payOut(22);
        assertFalse(realizedTransfers.contains(-505));
        assertFalse(realizedTransfers.contains(-10));
        assertFalse(realizedTransfers.contains(-22));
    }

    @Test
    public void shouldNotPayOutIfCashMachineHasNotEnoughCash(){
        //Given
        CashMachine cashMachine = new CashMachine(realizedTransfers, 1000);
        while (cashMachine.getCashMachineBalance() > 400){
            cashMachine.payOut(200);
        }
        //When
        cashMachine.payOut(500);
        //Then
        assertFalse(realizedTransfers.contains(-500));
    }

    @Test
    public void shouldNotPayOutIfCashMachineHasNoCash(){
        //Given
        CashMachine cashMachine = new CashMachine(realizedTransfers, 0);
        //When
        cashMachine.payOut(500);
        //Then
        assertFalse(realizedTransfers.contains(-500));
    }

    @Test
    public void shouldActualizeCashMachineBalanceAfterPaycheck(){
        //Given
        CashMachine cashMachine = new CashMachine(realizedTransfers, 1000);
        int cashMachineBalance;
        //When
        cashMachine.payOut(500);
        cashMachine.payOut(500);
        cashMachine.payOut(200);
        cashMachineBalance = cashMachine.getCashMachineBalance();
        //Then
        assertEquals(0, cashMachineBalance);
    }

    @Test
    public void shouldActualizeCashMachineBalanceAfterPayment(){
        //Given
        CashMachine cashMachine = new CashMachine(realizedTransfers, 1000);
        int cashMachineBalance;
        //When
        cashMachine.payIn(500);
        cashMachine.payIn(500);
        cashMachine.payIn(200);
        cashMachineBalance = cashMachine.getCashMachineBalance();
        //Then
        assertEquals(2200, cashMachineBalance);
    }

}
