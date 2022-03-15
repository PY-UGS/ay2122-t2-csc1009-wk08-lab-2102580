import java.util.Scanner;
public class BankDemoTest {
    
    public static void main(String[] args){

        CheckingAccount a1 = new CheckingAccount();
        Scanner in = new Scanner(System.in);

        try(in){
            System.out.print("Enter the amount to deposit: ");
            double depositamount = in.nextDouble();
            a1.deposit(depositamount);

            System.out.print("Enter the amount to withdraw: ");
            double withdrawamount = in.nextDouble();
            a1.withdraw(withdrawamount);

            System.out.printf("Remaining balance in your account is $%.2f\n",a1.getBalance());
        }catch(InsufficientFundsException i){
            System.out.printf("Sorry, but your account is short by: $%.2f\n",(i.getAmount()-a1.getBalance()));
        }

    }
}
