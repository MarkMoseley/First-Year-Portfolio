import java.util.*;

/** Description:
      
      This program creates an Account class with several different fields and methods 
      relating to a bank account. It is then run in main. 
      
      */
      
class Account {

   //Fields in Account
   private int id = 0;
   private double balance =0;
   private double annualInterestRate = 0;
   private Date dateCreated = new Date();
   
   //Constructors in Account
   Account(){
   }
   
   Account(int ident, double bal, double annualInterest) {
      id = ident;
      balance = bal;
      annualInterestRate = annualInterest;
   }
   
   //Getter methods
   public int getId(){
      return id;
   }
      
   public double getBalance(){
      return balance;
   }
   
   public double getAnnualInterestRate(){
      return annualInterestRate;
   }
   
   public String getDateCreated(){
      String date = dateCreated.toString();
      return date;
   }   
   
   //Setter Methods
   public void setId(int ident){
      id= ident;
   }
      
   public void setBalance(double bal){
      balance = bal;
   }
      
   public void setAnnualInterestRate(double interest){
      annualInterestRate = interest;
   }
   
   //Interest methods
   
   //Returns monthly interest RATE  
   public double getMonthlyInterestRate(){
      double monthlyInterestRate = (annualInterestRate/12);
      return monthlyInterestRate;
   }
   
   //Returns the numeric ammount of interest accrued in one month
   public double getMonthlyInterest(){
      double monthlyRate = getMonthlyInterestRate();
      double monthlyInterest = balance * monthlyRate;
      return monthlyInterest;
   }
   
   //Withdraw and deposit methods
   public void withdraw(double amount){
      balance -= amount;
   }
   
   public void deposit(double amount){
      balance += amount;
   }   


   public static void main (String [] args){
      
      //Creates an account
      Account account1 = new Account(1122, 20000, .045);
      
      //Deposist and Withdraw
      account1.withdraw(2500);
      account1.deposit(3000);
   
      //Output information regarding the account
      System.out.println("The account id is " + account1.id + ".");
      System.out.println("It was created on " + account1.getDateCreated() + ".");
      System.out.println("The balance is " + account1.balance + " and the monthly interest is "
                         + account1.getMonthlyInterest() + "."); 
   
   }
}
