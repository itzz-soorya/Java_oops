 public class Customer 
{
    private int customerId;
    private String customerName;
    private String address;
    private String mobileNumber;

   public  Customer(int customerId,
            String customerName,
            String address,
            String mobileNumber)
    {
        this.customerId=customerId;
        this.customerName=customerName;
        this.address=address;
        this.mobileNumber= mobileNumber;

    }
    public int getCustomerId()
    {
        return this.customerId;
    }
    // there is no setter for the customerid .Reason : it is unique for each member
    public String getCustomerName()
    {
        return this.customerName;
    }
    public void setCustomerName(String customerName)
    {
        this.customerName=customerName;
    }
    public String getAddress()
    {
        return this.address;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    public String getMobileNumber()
    {
        return this.mobileNumber;
    }
    public void setMobileNumber(String mobileNumber)
    {
        this.mobileNumber=mobileNumber;
    }

}