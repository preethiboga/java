interface Payable{
    void getAmount();
}
class Calculation implements Payable
{
    private int sal;
    private int invoice;
    public void setSal(int sal)
    {
        this.sal=sal;
    }
    public void setInvoice(int invoice)
    {
        this.invoice=invoice;
    }
    public void getAmount()
    {
        System.out.println("amount paid to employees:"+sal);
        System.out.println("invoice payment="+invoice);
    }
    
}