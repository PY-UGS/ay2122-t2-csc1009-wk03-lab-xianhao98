package tutorial3;
import java.util.*;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate = new Date();

    public Loan(){

    }
    public Loan(double annualInterestRate,int numberOfYears,double loanAmount){
        setAnnualInterestRate(annualInterestRate);
        setNumberOfYears(numberOfYears);
        setLoanAmount(loanAmount);
    }

    public double getAnnualInterestRate(){
        return (this.annualInterestRate);
    }

    public int getNumberOfYears(){
        return (this.numberOfYears);
    }

    public double getLoanAmount(){
        return (this.loanAmount);
    }

    public Date getLoanDate(){
        return (this.loanDate);
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears; 
    }

    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment(){
        return ( ( getLoanAmount() * ( ( getAnnualInterestRate() / 100 ) / 12 ) ) /
                ( 1 - ( Math.pow( ( 1 + ( ( getAnnualInterestRate() / 100 ) / 12 ) ), getNumberOfYears() * -12) ) ) 
        );
    }

    public double getTotalPayment(){
        return ( getMonthlyPayment() * getNumberOfYears() * 12 );
    }
}
