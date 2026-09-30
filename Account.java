
public abstract class Account {
    
    private int accountNumber;
    private float balance;
    private boolean isLocked;


    public Account(int accountNumber,float balance)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.isLocked=false;
    }

    public int getAccountNumber()
    {
        return this.accountNumber;
    }
    public float getBalance()
    {
        return this.balance;
    }
    public void deposit(float amount)
    {
        if (this.isLocked==true)
        {
            return ;
        }
        if(amount<=0)
        {
            return;
        }
        this.balance+=amount;
    }

    

    public boolean withdraw(float amount)
    {
        if(isLocked==true)
        {
            return false;
        }
        if(amount > this.balance)
        {
            return false;
        }
        if(amount<=0)
        {
            return false;
        }
        this.balance-=amount;
        return true;
    }
    public void lockAccount()

    {
        this.isLocked=true;
    }
    public void unlockAccount()
    {
        this.isLocked=false;
    }

    public boolean isLocked()
    {
        return this.isLocked;
    }
}
