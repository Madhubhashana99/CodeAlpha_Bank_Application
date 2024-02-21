import java.util.Scanner;

public class BankApplication {

    private static double balance = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do{
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch(choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Thanks for using the banking application!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter number between 1 and 4");
            }
        }while (choice!=4);
        scanner.close();
    }

    //Deposit amount
    private static void deposit(){
        System.out.println("Enter amount to deposit: ");
        double amount = scanner.nextDouble();

        if(amount>0){
            balance+=amount;
            System.out.println("Deposit success. Your new balance is: "+balance);
        }
        else{
            System.out.println("Invalid amount. Please Enter a positive number.");
        }
    }

    private static void withdraw(){

        System.out.println("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdraw successful. Your new balance is: "+balance);
        }else if(amount <= 0){
            System.out.println("Invalid amount. Please enter a positive number. ");
        }else {
            System.out.println("Insufficient funds. Your current balance is: "+balance);
        }
    }

    private static void checkBalance(){
        System.out.println("Your current balance is: " + balance);
    }
}
