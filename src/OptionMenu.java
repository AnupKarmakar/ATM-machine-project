//Main class
import java.io.IOException;
import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.*;
public class OptionMenu extends Account{
    Scanner menuInput=new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
    HashMap<Integer, Integer> data=new HashMap<Integer, Integer>();
    private int selection;
    /* Validate Login information customer number and pin number*/

    public void getLogin() throws IOException{
        int x=1;
        int selection;

        do{
            try{
                data.put(11224455,3344);
                data.put(44557788,6699);

                System.out.println("Welcome to ATM Project !!");

                System.out.print("Enter your customer number: ");
                setCustomerNumber(menuInput.nextInt());

                System.out.print("Enter your Pin number: ");
                setPinNumber(menuInput.nextInt());
            }catch(Exception e){
                System.out.println("\n"+"Invalid character(s). Only numbers."+"\n");
                x=2;
            }
            for(Map.Entry<Integer, Integer> entry:data.entrySet()){
               if(entry.getKey()==getCustomerNumber() && entry.getValue()==getPinNumber()){
                   getAccountType();
               }
            }
            System.out.println("\n"+"Wrong Customer Numbet or Pin Number."+"\n");
        }while(x==1);
    }

    public void getAccountType(){

        System.out.println("Select the account you want to access: ");
        System.out.println("Type 1 - Checking Account");
        System.out.println("Type 2 - Saving Account");
        System.out.println("Type 3  - Exit");
        System.out.println("Choice: ");
        selection=menuInput.nextInt();

        switch(selection){
            case 1:
                getChecking();
                break;

            case 2:
                getSaving();
                break;

            case 3:
                System.out.println("Thank you for visiting ATM, bye.");
                break;

            default:
                System.out.println("\n"+"Invalid choice."+"\n");
                getAccountType();

        }
    }
     /* Display Checking Account Menu with selections*/

    public void getChecking(){
        System.out.println("Checking Account: ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice: ");

        selection=menuInput.nextInt();
        switch(selection){
            case 1 :
                System.out.println("Checking Account Balance: "+moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;

            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;

            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;

            case 4:
                System.out.println("Thank you for visiting ATM, bye.");
                break;

            default:
                System.out.println("\n"+"Invalid choice."+"\n");
                getChecking();

        }
    }

    /* Display Saving Account Menu with selection*/
    public void getSaving(){
        System.out.println("Saving Account: ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice: ");

        selection=menuInput.nextInt();
        switch(selection){
            case 1 :
                System.out.println("Checking Account Balance: "+moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;

            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;

            case 3:
                getSavingDepositInput();
                getAccountType();
                break;

            case 4:
                System.out.println("Thank you for visiting ATM, bye.");
                break;

            default:
                System.out.println("\n"+"Invalid choice."+"\n");
                getSaving();

        }
    }

}
