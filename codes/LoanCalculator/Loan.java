package LoanCalculator;

public class Loan {
    private double loanAmount;
    private double interestRate;
    private double loanPeriod;

    public Loan(){
        loanAmount = 0.0;
        loanPeriod = 0;
        interestRate = 0.0;
    }

    public double getLoanAmount(){
        return loanAmount;
    }
    
    public void setLoanAmount(double amount){
        this.loanAmount = amount;
    }

    public double getInterestRate(){
        return interestRate;
    }

    public void setInterestRate(double rate){
        this.interestRate = rate;
    }

    public double getYears(){
        return loanPeriod;
    }

    public void setYears(double period){
        this.loanPeriod = period;

    }
    public double calculateMonthlyPayment(){
        double monthlyPaymentRates = (interestRate/100)/12; 
        double numberOfPayments = loanPeriod * 12;
        return( loanAmount * monthlyPaymentRates)/ (1 - Math.pow(1+monthlyPaymentRates, -numberOfPayments));


    }
    public double calculateYearlyPayment() {
        return calculateMonthlyPayment() * 12;
    }
    public String getLoanDetails() {
        return "Loan Amount: $" + String.format("%.2f", getLoanAmount()) +
                "\nAnnual Interest Rate: " + String.format("%.2f", getInterestRate()) + "%" +
                "\nLoan Term: " + String.format("%.2f",getYears()) + " years" +
                "\nMonthly Payment: $" + String.format("%.2f", calculateMonthlyPayment()) +
                "\nYearly Payment: $" + String.format("%.2f", calculateYearlyPayment());
    }

}
