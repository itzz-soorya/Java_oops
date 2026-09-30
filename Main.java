public class Main {
    public static void main(String[] args) {
        
        Account account ;
        account = new SavingsAccount(1001, 1000, 300);
        System.out.println(account.withdraw(800));

        System.out.print(account.getBalance());
    }
}
