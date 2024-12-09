public class BankAccount {
   public double balance;
   public BankAccount(){}
   public BankAccount(double initialBalance){
       this.balance= initialBalance;
   }

   public String deposit(double amount){
       if (amount>0){
           balance+=amount;
           return "Current balance after amount deposit from bank is "+balance;
       }
       return "Current balance after amount deposit from bank is "+balance;
   }

   public String withdraw(double amount){
       if (amount>0&& amount<=balance){
           balance-=amount;
           return "Current balance after amount withdrawl from bank is "+balance;
       }
       return "Current balance after amount withdrawl from bank is "+balance;
   }

   public double getBalance(){
       return balance;
   }
}

class DebitCard extends BankAccount{
    public String depositFromATMMachine(double amount){
        if (amount>0){
            balance+=amount;
            return "Current balance after amount deposit from ATM machine is "+balance;
        }
        return "Current balance after amount deposit from ATM machine is "+balance;
    }

    public String withdrawlFromATMMachine(double amount){
        if (amount>0&& amount<=balance){
            balance-=amount;
            return "Current balance after amount withdrawl from ATM machine is "+balance;
        }
        return "Current balance after amount withdrawl from ATM machine is "+balance;
    }


}
