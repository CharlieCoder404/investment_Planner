import java.util.Scanner;

public class InterestCalculatorFD {
    double principle;
    double interest;

    int years;
    double monthlySavings;
    double annualSavings;
    double fdInterest;

    InterestCalculatorFD(){
        this.principle=0;
        this.interest=0;

        boolean check = false;
        while(!check) {
            Scanner input = new Scanner(System.in);
            System.out.println("1. Monthly");
            System.out.println("2. Annual");
            System.out.println();
            System.out.print("Choose Saving Type : ");
            int user = input.nextInt();
            System.out.println();
            if (user==1) {
                System.out.print("Enter your monthly savings : ");
                this.monthlySavings = input.nextDouble();

                System.out.print("Enter the no. of years : ");
                this.years = input.nextInt();

                System.out.print("Enter the interest rate of your FD : ");
                this.fdInterest = input.nextDouble();

                for(int i = 1; i<=years;i++){
                    System.out.println("Year No. : "+i);
                    principle = principle + (monthlySavings * 12);
                    interest = principle * (fdInterest/100);
                    principle = principle + interest;
                    System.out.println("Monthly Interest : " +(interest/12));
                }
                System.out.println();
                System.out.println("Invested amount : " + (monthlySavings*12*years) );
                System.out.println("Interest amount : " + (principle-(monthlySavings * 12 * years)));
                System.out.println("Total amount : " +(principle) );

                check=true;

            } else if (user==2) {
                System.out.print("Enter your annual savings : ");
                this.annualSavings = input.nextDouble();

                System.out.print("Enter the no. of years : ");
                this.years = input.nextInt();

                System.out.print("Enter the interest rate of your FD : ");
                this.fdInterest = input.nextDouble();

                for(int i = 1; i<=years;i++){
                    System.out.println("Year No. : "+i);
                    principle = principle + annualSavings;
                    interest = principle * (fdInterest/100);
                    principle = principle + interest;
                    System.out.println("Monthly Interest : " +(interest/12));
                }
                System.out.println();
                System.out.println("Invested amount : " + (annualSavings*years) );
                System.out.println("Interest amount : " + (principle -(annualSavings*years)));
                System.out.println("Total amount : " +(principle));
                check=true;
            } else {
                System.out.println("Wrong Input ! Please Try Again.");
                check=false;
            }
        }

    }
}
