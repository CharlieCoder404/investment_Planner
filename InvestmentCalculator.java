import java.util.Scanner;

public class InvestmentCalculator {
    double MonthlySavings;
    int years;
    double principle1;
    double interest1;
    double principle2;
    double interest2;
    double fdInvestmentPercentage;
    double fdInvestmentDecimal;
    double fdInterest;
    double mfInterest;


    InvestmentCalculator() {
        this.principle1 = 0;
        this.interest1 = 0;
        this.principle2 = 0;
        this.interest2 = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your monthly savings : ");
        this.MonthlySavings = input.nextDouble();

        System.out.print("Enter the no. of years : ");
        this.years = input.nextInt();

        System.out.print("Enter the percentage investment in FD : ");
        this.fdInvestmentPercentage = input.nextDouble();
        this.fdInvestmentDecimal = fdInvestmentPercentage / 100;
    }
    public void calc1() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the interest rate of your FD : ");
        this.fdInterest = input.nextDouble();

        double FSavings = this.MonthlySavings * (fdInvestmentDecimal);
        for (int i = 1; i <= this.years; i++) {
            principle1 = principle1 + (FSavings * 12);
            interest1 = principle1 * (fdInterest/100);
            principle1 = principle1 + interest1;
        }
    }
    public void calc2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the interest rate of your Mutual Fund : ");
        this.mfInterest = input.nextDouble();

        double MSavings = this.MonthlySavings * (1 - fdInvestmentDecimal);
        for (int i = 1; i <= this.years; i++) {
            principle2 = principle2 + (MSavings * 12);
            interest2 = principle2 * (mfInterest/100);
            principle2 = principle2 + interest2;
        }
    }
}
