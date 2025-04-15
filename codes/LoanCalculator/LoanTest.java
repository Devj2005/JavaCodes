package LoanCalculator;
import java.util.* ;
import javax.swing.*;
public class LoanTest {

    public static void main(String args[]){

        JOptionPane.showMessageDialog(null, "----- WELCOME TO THE JAVA LOAN CALCULATOR. -----");
        String loanAmountStr = JOptionPane.showInputDialog("What is the Total Loan Amount");
        String interestRateStr = JOptionPane.showInputDialog("Enter annual interest rate (in %):");
        String loanTermStr = JOptionPane.showInputDialog("Enter loan term (in years):");

        double loanAmountdb = Double.parseDouble(loanTermStr);
        double interestAmountdb = Double.parseDouble(interestRateStr);
        double loanTermdb = Double.parseDouble(loanTermStr);

        Loan Loaner = new Loan();
        Loaner.setInterestRate(loanTermdb);
        Loaner.setLoanAmount(interestAmountdb);
        Loaner.setYears(loanTermdb);

        JOptionPane.showMessageDialog(null, Loaner.getLoanDetails(), "Loan Payment Details", JOptionPane.INFORMATION_MESSAGE);
    } 
        



    }


    

