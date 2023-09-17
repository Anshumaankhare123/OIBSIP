import java.util.Scanner;

public class ATM {

    private static final Scanner scanner = new Scanner(System.in);

    private static final String WELCOME_MESSAGE = "Welcome to the ATM!";
    private static final String MENU_MESSAGE = "Please select an option: \n1. Withdraw\n2. Deposit\n3. Check Balance\n4. Exit";

    private static final String WITHDRAW_PROMPT = "Enter the amount to withdraw: ";
    private static final String DEPOSIT_PROMPT = "Enter the amount to deposit: ";

    private static final String THANK_YOU_MESSAGE = "Thank you for using the ATM!";

    public static void main(String[] args) {

        System.out.println(WELCOME_MESSAGE);

        while (true) {

            System.out.println(MENU_MESSAGE);

            int option = scanner.nextInt();

            switch (option) {

                case 1:
                    withdraw();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println(THANK_YOU_MESSAGE);
                    return;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
    }

    private static void withdraw() {

        System.out.println(WITHDRAW_PROMPT);

        int withdrawAmount = scanner.nextInt();

    

        System.out.println("Withdraw successful!");
    }

    private static void deposit() {

        System.out.println(DEPOSIT_PROMPT);

        int depositAmount = scanner.nextInt();



        System.out.println("Deposit successful!");
    }

    private static void checkBalance() {
        
    }
}