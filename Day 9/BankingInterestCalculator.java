import java.util.Scanner;

public class BankingInterestCalculator {
    interface InterestCalculator {
        void calculate(String value);
    }

    static class SavingsAccount implements InterestCalculator {
        public void calculate(String value) {
            System.out.println("Savings interest for amount " + value);
        }
    }

    static class FixedDeposit implements InterestCalculator {
        public void calculate(String value) {
            System.out.println("Fixed deposit interest for amount " + value);
        }
    }

    static class RecurringDeposit implements InterestCalculator {
        public void calculate(String value) {
            System.out.println("Recurring deposit interest for amount " + value);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amountText: ");
        String amountText = scanner.nextLine();

        // Interface reference stores different implementations for runtime polymorphism.
        InterestCalculator[] services = {new SavingsAccount(), new FixedDeposit(), new RecurringDeposit()};
        services[0].calculate(amountText);
        services[1].calculate(amountText);
        services[2].calculate(amountText);
        scanner.close();
    }
}
