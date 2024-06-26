
import java.util.Scanner;


public class BankInfo {

    private String accountNumber;
    private String name;
    private String accountType;
    private long balance;

    Scanner sc = new Scanner(System.in);

    public void openAccount(){

        System.out.println("Enter account number: ");
        accountNumber = sc.next();
        System.out.println("Enter account type: ");
        accountType = sc.next();
        System.out.println("Enter name: ");
        name = sc.next();
        System.out.println("Enter balance: ");
        balance = sc.nextLong();
    }

    public void showAccount(){
        System.out.println("Account holder name: " +name);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account type: " + accountType);
        System.out.println("Account balance: "+ balance);
    }

    public void deposit(){
        long amount;
        System.out.println("Enter the amount you like to deposit: ");
        amount = sc.nextLong();
        balance = balance+amount;
    }

    public void withdraw(){
        long amount;
        System.out.println("Enter the amount you like to withdraw: ");
        amount = sc.nextLong();
        if(balance>=amount){
            balance = balance-amount;
            System.out.println("Balance after withdraw: " + balance);
        }
        else{
            System.out.println("Your balance is less than " + amount + "\tTransaction failed!!");
        }

    }

    public boolean search(String accNo){
        if(accountNumber.equals(accNo)){
            showAccount();
            return true;
        }
        return false;
    }

}
