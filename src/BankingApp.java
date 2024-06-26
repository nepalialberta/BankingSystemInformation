import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of customers you would like to enter: ");
        int n = sc.nextInt();
        BankInfo Customer[] = new BankInfo[n];

        for(int i = 0;i<Customer.length;i++){
            Customer[i] = new BankInfo();
            Customer[i].openAccount();
        }

        int choice;
        do{
            System.out.println("Choose from the following option below: ");
            System.out.println("1: Displaying account details ");
            System.out.println("2: Search the acount by its account number: ");
            System.out.println("3: Deposit amount ");
            System.out.println("4: Amount withdraw: ");
            System.out.println("Exit  the program");

            choice = sc.nextInt();
            switch(choice){
                case 1:
                    for(int i = 0;i<Customer.length;i++){
                        Customer[i].showAccount();
                    }
                    break;
                case 2:
                    System.out.println("Enter account number to search");
                    String accNo = sc.next();
                    boolean found = false;
                    for(int i = 0;i< Customer.length;i++){
                        found = Customer[i].search(accNo);
                        if(found){
                            break;
                        }

                    }
                    if(!found){
                        System.out.println("Account does nto exist, try again!");
                    }
                    break;
                case 3:
                    System.out.println("Enter your account number: ");
                    accNo = sc.next();
                    found = false;
                    for(int i = 0;i< Customer.length;i++){
                        found = Customer[i].search(accNo);
                        if(found){
                            Customer[i].deposit();
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("You might enter the wrong account number, try again!");
                    }
                    break;
                case 4:
                    System.out.println("Enter account number: ");
                    accNo=sc.next();
                    found = false;
                    for(int i = 0;i< Customer.length;i++){
                        found = Customer[i].search(accNo);
                        if(found){
                            Customer[i].withdraw();
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Try again with right account number!");
                    }
                    break;
                case 5:
                    System.out.println("See you again soon, thank you for using our service");
            }

        }
        while(choice!=5);

    }
}
