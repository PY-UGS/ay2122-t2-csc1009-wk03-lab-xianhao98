package tutorial3;
import java.text.*;
import java.util.*;
public class tutorial3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years as an integer: ");
        int numberOfYears = input.nextInt();

        System.out.print("Enter loan amount, for example, 120000.95: ");
        double loanAmount = input.nextDouble();
        Loan loan = new Loan(annualInterestRate,numberOfYears,loanAmount);
        //loan.setAnnualInterestRate(annualInterestRate);
        //loan.setNumberOfYears(numberOfYears);
        //loan.setLoanAmount(loanAmount);

        System.out.println("The loan was created on " + loan.getLoanDate());
        System.out.println("The monthly payment is " + df.format(loan.getMonthlyPayment()));
        System.out.println("The total payment is " + df.format(loan.getTotalPayment()));

        input.close();
    }
}

