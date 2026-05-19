import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {

        Account account1 = new Account(50.00);
        Account account2 = new Account(7.53);

        System.out.printf("account1 balance: $%.2f%n", account1.getBalance());
        System.out.printf("account2 balance: $%.2f%n%n", account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();

        account1.credit(depositAmount);

        System.out.printf("account1 balance: $%.2f%n", account1.getBalance());

        input.close();
    }
}
