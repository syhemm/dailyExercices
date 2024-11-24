import java.util.Scanner;

public class BankingApp {
    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);
        double moneyInBank = 0;
        int choice = 0;

        while (choice != 4)
        {
            menu();
            choice = keyboard.nextInt();
            if (choice == 1)
            {
                checkMoneyBalance(moneyInBank);
            }
            else if (choice == 2)
            {
                moneyInBank = withdrawMoney(moneyInBank);
            }
            else if (choice == 3)
            {
                moneyInBank = depositMoney(moneyInBank);
            }
        }
    }

    public static void menu() {
        System.out.println("|| RBC menu ||");
        System.out.println("1. Check balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Log out");
    }

    public static void checkMoneyBalance(double money) {
        System.out.println("Your current balance is: " + money);
    }

    public static double withdrawMoney(double money) {
        Scanner keyboard = new Scanner(System.in);
        double newBalance;
        double withdraw;
        System.out.println("Enter the amount to withdraw:");
        withdraw = keyboard.nextDouble();

        if (withdraw < money)
        {
            newBalance = money - withdraw;
            System.out.println("Your new balance is: " + newBalance);
        }
        else
        {
            System.out.println("Insufficient funds to withdraw.");
            newBalance = money;
        }
        return newBalance;
    }

    public static double depositMoney(double money) {
        Scanner keyboard = new Scanner(System.in);
        double newBalance;
        double deposit;
        System.out.println("Enter the amount to deposit: ");
        deposit = keyboard.nextDouble();
        newBalance = money + deposit;
        System.out.println("Your new balance is: " + newBalance);
        return newBalance;
    }
}
