package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class CashMachineTestSuit {
    private ArrayList<Integer> realizedTransfers = new ArrayList<>();
    CashMachine cashMachine = new CashMachine(realizedTransfers);

    @Test
    public void shouldNotPayInIfZero(){
        cashMachine.payIn(0);
        assertFalse(realizedTransfers.contains(0));
    }

    @Test
    public void shouldNotPayInIfNegative(){
        cashMachine.payIn(-1000);
        assertFalse(realizedTransfers.contains(-1000));
    }

    @Test
    public void shouldNotPayInIfAboveTransferLimit(){
        cashMachine.payIn(10100);
        assertFalse(realizedTransfers.contains(10100));
    }

    @Test
    public void shouldPayInIfIs20(){
        cashMachine.payIn(20);
        assertTrue(realizedTransfers.contains(20));
    }

    @Test
    public void shouldPayInIfIs10000(){
        cashMachine.payIn(10000);
        assertTrue(realizedTransfers.contains(10000));
    }

    @Test
    public void shouldPayInIfIsCash(){
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
        cashMachine.payIn(505);
        cashMachine.payIn(10);
        cashMachine.payIn(22);
        assertFalse(realizedTransfers.contains(505));
        assertFalse(realizedTransfers.contains(505));
        assertFalse(realizedTransfers.contains(505));
    }



}
