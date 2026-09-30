public class SavingsAccount extends Account
{
    private float minimumBalance;

    SavingsAccount(int accountNumber,float balance,float minimumBalance )
    {
        super(accountNumber,balance);
        this.minimumBalance= minimumBalance;
    }

    @Override
    public boolean withdraw(float amount)
    {
        if(getBalance()- amount>=minimumBalance)
        {
           return super.withdraw(amount);
        }
        else{
            return false;
        }
        
    }
}
