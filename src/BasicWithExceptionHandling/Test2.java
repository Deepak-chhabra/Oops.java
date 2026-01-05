package BasicWithExceptionHandling;


/*
     2. Getters and Setters
       Create a BankAccount class with private attributes: accountNumber, balance.
       Implement getters and setters with validation (balance cannot be negative).
 */

class BankAccount{
     private   long  accountNumber ;
     private double balance ;
     private final double  MINIMUM_BAlANCE = 999.00 ;

     BankAccount(){
         this(0,0.0);
     }
     BankAccount(long accountNumber , double balance){

         if(accountNumber <= 0  )
         {
             throw new IllegalArgumentException("Account Number can not be zero");
         }
         if(balance <= MINIMUM_BAlANCE ){
             throw new IllegalArgumentException("Balance should be 1000");
         }

         this.accountNumber = accountNumber ;
         this.balance = balance ;
     }


     // setters

    public void setBalance(double balance){
         if(balance <= MINIMUM_BAlANCE){
             throw new IllegalArgumentException("balance should be greater than 999");
         }
         this.balance = balance;
    }

    public void setAccountNumber(long accountNumber){
         if(accountNumber <= 0 ){
             throw new IllegalArgumentException("Accound number should not be Zero");
         }
         this.accountNumber = accountNumber ;
    }

    // getters

    public long getAccountNumber(){
         return accountNumber ;
    }
    public double getBalance(){
         return balance ;
    }

    public String toString(){
           return String.format("Account Number :: %d || Balance :: %.2f ", accountNumber , balance );
    }

    // OPERATIONS ::  1) WITHDRAW AND DEPOSIT

    public boolean withdraw(long amount ){
           if(balance < amount ){
               throw new IllegalArgumentException("Not sufficient balance ");
           }
           balance -= amount ;
           return true ;
    }
    public boolean deposit(long amount ){
         if(amount <= 0 ) throw new IllegalArgumentException("amount should be positive ");

         balance += amount ;
         return true ;
    }
}
public class Test2 {

    public static void main(String[] args) {
        try{
            BankAccount account1 = new BankAccount(2021218207L , 5645.2333);
            System.out.println(account1);
            BankAccount account2 = new BankAccount(4562378945L , 6464.56);
            System.out.println(account2);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println(account1.deposit(23560));
        System.out.println(account1);
        System.out.println(account1.withdraw(45));
        System.out.println(account1);
        BankAccount account2 = new BankAccount(0, 635.2356);
        System.out.println(account2);
    }
}
