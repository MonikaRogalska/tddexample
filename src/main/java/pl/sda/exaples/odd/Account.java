package pl.sda.exaples.odd;

public class Account {

    private final static int LOAN_FEE = 15;
    private final static int LOAN_LIMIT = - 1000;


    private int amount;

    public Account(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void deposit(int deposit){
        amount += deposit;
    }

    public void withdraw(int amount){

        if (this.amount-LOAN_FEE< LOAN_LIMIT){
            throw new CanNotWithdrawMoreExeption("Account balance can not be less than -1000");
        }

        this.amount -= amount;

        if (this.amount<0){
            this.amount-=LOAN_FEE;
        }
    }
}
