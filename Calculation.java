/*
1. Taken Salary : 1 Lakh / month
2. Fixed Deposit interest rate : 5.5%
3. Mutual Fund interest rate : 12%
4. General time period in years : 10yrs
5. inputs : savings,
6. variables : years(initially=0) , Principle amount
*/
import java.util.Scanner;

public class Calculation{
    public static void main(String[] args) {
        while(true) {
            boolean check = false;
            System.out.println("Hello Investor ! Select your investment type.");

            while (!check) {
                Scanner input = new Scanner(System.in);
                System.out.println("1. Mutual Fund");
                System.out.println("2. Fixed Deposit");
                System.out.println("3. Hybrid Investment");
                System.out.println();
                System.out.print("Enter your preferred no. : ");
                int function = input.nextInt();
                switch (function) {
                    case 1 -> {
                        InterestCalculatorMutualFund MF = new InterestCalculatorMutualFund();
                        System.out.println();
                        check = true;
                    }
                    case 2 -> {
                        InterestCalculatorFD FD = new InterestCalculatorFD();
                        System.out.println();
                        check = true;
                    }
                    case 3 -> {
                        InvestmentCalculator a1 = new InvestmentCalculator();
                        a1.calc1();
                        a1.calc2();
                        double investment1;
                        investment1 = (a1.MonthlySavings) * (0+a1.fdInvestmentDecimal) * 12 * (a1.years);
                        double investment2;
                        investment2 = (a1.MonthlySavings) * (1 - a1.fdInvestmentDecimal) * 12 * (a1.years);
                        System.out.println();
                        System.out.println("Saving " + (a1.MonthlySavings) + " per month for " + a1.years + "years." +
                                "\nInvesting " + a1.fdInvestmentPercentage + "% of it in FD." +
                                "\nAmount invested in FD per month : " + (a1.MonthlySavings * (a1.fdInvestmentDecimal)) +
                                "\n" + (100 - a1.fdInvestmentPercentage) + "% in Mutual Funds." +
                                "\nAmount invested in Mutual Fund per month : " + a1.MonthlySavings * (1 - a1.fdInvestmentDecimal) +

                                "\n\nAmount invested in FD : " + investment1 +
                                "\nInterest gained from FD : " + (a1.principle1 - investment1) +
                                "\nThe Final Amount in FD is : " + a1.principle1 +

                                "\n\nAmount invested in Mutual Fund : " + investment2 +
                                "\nInterest gained from Mutual Fund : " + (a1.principle2 - investment2) +
                                "\nThe Final Amount in Mutual Fund is : " + a1.principle2 +

                                "\n\nTotal amount invested : " + (a1.MonthlySavings * 12 * a1.years) +
                                "\nTotal Interest gained : " +
                                ((a1.principle1-investment1)+(a1.principle2 - investment2)) +
                                "\nTotal amount after " + a1.years + "years : " + (a1.principle1 + a1.principle2));
                        System.out.println("\n");
                        check = true;
                    }
                    default -> {
                        System.out.println("Wrong Input ! Try again.");
                        check = false;
                    }
                }
            }
        }

    }
}

