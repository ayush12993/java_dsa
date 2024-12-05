public class implementOOps {
    public static void main(String[] args) {
        DebitCard bankAccount = new DebitCard();
        System.out.println("New bank account created as well as Debit card generated for client is- ");
        System.out.println(bankAccount.deposit(1000));
        System.out.println(bankAccount.withdraw(200));

        System.out.println(bankAccount.depositFromATMMachine(1000));
        System.out.println(bankAccount.withdrawlFromATMMachine(200));
    }
}
