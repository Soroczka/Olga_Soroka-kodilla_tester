package wallet;

public class Cashier {
    private CashSlot cashSlot;

    public Cashier(CashSlot cashSlot){
        this.cashSlot = cashSlot;
    }
    public String withdraw(Wallet wallet, int amount){
        int balance = wallet.getBalance();
        if (balance >= amount && amount > 0){
            wallet.debit(amount);
            cashSlot.dispense(amount);
            return "Your money paid out";
        } else {
            wallet.debit(0);
            cashSlot.dispense(amount);
            return "You don't have enough money";
        }

    }

//    public static String saidNotEnoughMoney(){
//        return "You don't have enough money";
//    }
}
