public class CheckingAccount {

    private double balance;
    private String accountnum;


    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException{
        if(amount > balance){
            throw new InsufficientFundsException(amount);
        }
        else{
            this.balance -= amount;
        }
    }

    public double getBalance(){
        return balance;
    }

    public String getNumber(){
        return accountnum;
    }


}