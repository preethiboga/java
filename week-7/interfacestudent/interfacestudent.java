interface StudentFee{
    void getAmount(int fee);
    void getFirstName(String fname);
    void getLastName(String lname);
    void getAddress(String Address);
    void getContact(Double contact);
}
class Hostler implements StudentFee{
    public void getAmount(int fee)
    {
        System.out.println("amount paid by hostler="+fee);
    }
    public void getFirstName(String fname)
    {
        System.out.println("hostler firstname="+fname);
    }
    public void getLastName(String lname)
    {
        System.out.println("hostler lastname="+lname);
    }
    public void getAddress(String Address)
    {
        System.out.println("hostler address="+Address);
    }
    public void getContact(Double contact)
    {
        System.out.println("hostler contact="+contact);
    }

}
class NonHostler implements StudentFee{
    public void getAmount(int fee)
    {
        System.out.println("amount paid by nonhostler="+fee);
    }
    public void getFirstName(String fname)
    {
        System.out.println("nonhostler firstname="+fname);
    }
    public void getLastName(String lname)
    {
        System.out.println("nonhostler lastname="+lname);
    }
    public void getAddress(String Address)
    {
        System.out.println("nonhostler address="+Address);
    }
    public void getContact(Double contact)
    {
        System.out.println("nonhostler contact="+contact);
    }

}