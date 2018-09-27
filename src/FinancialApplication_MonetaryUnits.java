import java.util.Scanner;

public class FinancialApplication_MonetaryUnits {
    public static void main(String[] args)   {
        // Create a scanner
        Scanner input = new Scanner(
                System.in
        );

        // Recive the amount
        System.out.print(
                "Enter an amount in double, for example 11.56: "
        );
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);

        // Find the number of one dollers

        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Find the number of Quarters in the remaining amount
        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of quarters in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the nymber of enies in the remaining amount
        int numberOfPennies = remainingAmount;

        // Display results
        System.out.println(
                "Your amount " + amount + " consists of"
        );

        if (numberOfOneDollars == 1)
            System.out.println(
                " " + numberOfOneDollars + " dollar"
        );
        else
            System.out.println(
                    " " + numberOfOneDollars + " dollars"
            );

        if (numberOfQuarters == 1)

        System.out.println(
                " " + numberOfQuarters + " Quarter "
        );
        else
            System.out.println(
                    " " + numberOfQuarters + " Quarters"
            );

        if (numberOfDimes == 1 )
        System.out.println(
                " " + numberOfDimes + " dime"
        );
        else
            System.out.println(
                    " " + numberOfDimes + " dimes"
            );

        if (numberOfNickels == 1)
        System.out.println(
                " " + numberOfNickels + " nickel"
        );
        else
            System.out.println(
                    " " + numberOfNickels + " Nickels"
            );

        if (numberOfPennies == 1)
        System.out.println(
                " " + numberOfPennies + " Penny"
        );
        else
            System.out.println(
                    " " + numberOfPennies + " Pennies"
            );

    }
}