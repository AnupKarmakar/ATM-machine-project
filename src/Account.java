import java.text.DecimalFormat;
import java.util.*;

public class Account {
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance=0;
    private double savingBalance=0;
    Scanner input=new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");

    /* Set the customer number*/
    public int setCustomerNumber(int customerNumber){
        this.customerNumber=customerNumber;
        return customerNumber;
    }

    /* Set the pin Number */
    public int setPinNumber(int pinNumber){
        this.pinNumber=pinNumber;
        return pinNumber;
    }

    /* Get the Customer Account Number*/
    public int getCustomerNumber() {
        return customerNumber;
    }

    /* Get the Pin Number*/
    public int getPinNumber() {
        return pinNumber;
    }

    /* Get the Account Balance*/
    public double getCheckingBalance() {
        return checkingBalance;
    }

    /* Get the Saving Balance*/
    public double getSavingBalance() {
        return savingBalance;
    }

    /*Calculate Checking Account Withdrawal*/
    public double calcCheckingWithdraw(double amount){
        checkingBalance=checkingBalance-amount;
        return checkingBalance;
    }

    /* Checking Saving Account Withdrawal*/
    public double calcSavingWithdraw(double amount){
        savingBalance=savingBalance-amount;
        return savingBalance;
    }

    /* Calculate Checking account deposit*/
    public double calcCheckingDeposit(double amount){
        checkingBalance=checkingBalance+amount;
        return checkingBalance;
    }

    /* Calculate Saving account deposit*/
    public double calcSavingDeposit(double amount){
        savingBalance=savingBalance+amount;
        return savingBalance;
    }

    /* Customer checking Amount Withdraw input*/
    public void getCheckingWithdrawInput(){
        System.out.println("Checking Account Balance: "+moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to withdraw from Checking Account: ");
        double amount=input.nextDouble();
        if((checkingBalance-amount)>=0){
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account balance: "+moneyFormat.format(checkingBalance));
        }else{
            System.out.println("Over Limit : Balance can not be negative");
        }
    }

    /* Customer Saving Amount Withdraw input*/
    public void getSavingWithdrawInput(){
        System.out.println("Saving Account Balance: "+moneyFormat.format(savingBalance));
        System.out.print("Amount you want to withdraw from Saving Account: ");
        double amount=input.nextDouble();
        if((savingBalance-amount)>=0){
            calcSavingWithdraw(amount);
            System.out.println("New Saving Account balance: "+moneyFormat.format(savingBalance));
        }else{
            System.out.println("Over Limit : Balance can not be negative");
        }
    }

    /* Customer Checking Account Deposit input*/
    public void getCheckingDepositInput(){
        System.out.println("Checking Account Balance: "+moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to deposit in Checking Account: ");
        double amount=input.nextDouble();
        if(amount>=0){
            calcCheckingDeposit(amount);
            System.out.println("New Checking Account balance: "+moneyFormat.format(checkingBalance));
        }else{
            System.out.println("Please make a valid deposit");
        }
    }

    /* Customer Saving Account Deposit input*/
    public void getSavingDepositInput(){
        System.out.println("Checking Account Balance: "+moneyFormat.format(savingBalance));
        System.out.print("Amount you want to deposit in Saving Account: ");
        double amount=input.nextDouble();
        if(amount>=0){
            calcSavingDeposit(amount);
            System.out.println("New Saving Account balance: "+moneyFormat.format(savingBalance));
        }else{
            System.out.println("Please make a valid deposit");
        }
    }



}
