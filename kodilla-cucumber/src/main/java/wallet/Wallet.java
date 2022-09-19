package wallet;

public class Wallet {
    private int balance;
    public Wallet(){

    }

    public void deposit(int money){
        this.balance += money;
    }
    public int getBalance(){
        return balance;
    }
}
