class Bank{
    private double Acc_balance;
    private String Acc_name;
    private  String Acc_add;
    private String Acc_number;
    public Bank(double bal)
    {
        if(bal>0)
        Acc_balance=bal;
    }
    public void setName(String name)
    {
        Acc_name=name;
    }
    public void setAddress(String add)
    {
        Acc_add=add;
    }
    public void setNumber(String number)
    {
        Acc_number=number;
    }
    void credit(double bal)
    {

        Acc_balance=Acc_balance+bal;
    }
    void debit(double bal)
    {
        if(bal>Acc_balance)
        System.out.println("Debit amount exceeded account balance");
        else
        Acc_balance=Acc_balance-bal;
    }
     double getBalance()
    {
        return Acc_balance;
    }




    
}