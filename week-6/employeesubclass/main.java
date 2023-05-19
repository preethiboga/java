class Main{
    public static void main(String[] args)
    {
        ContractEmployee ct=new ContractEmployee();
        ct.setFirstName("Preethi");
        ct.setLastName("Boga");
        ct.setDepartment("CSE");
        ct.setDesig("Btech");
        ct.setSalary(700000);
        System.out.println("contract employee details:");
        ct.displayFullName();
        System.out.println("firstname:"+ct.getFirstName());
        System.out.println("lasttname:"+ct.getLastName());
        System.out.println("department:"+ct.getDepartment());
        System.out.println("designation:"+ct.getDesig());
        System.out.println("salary:"+ct.getSalary());
        RegularEmployee rt=new RegularEmployee();
        rt.setFirstName("Haritha");
        rt.setLastName("Apuri");
        rt.setDepartment("ECE");
        rt.setDesig("Btech");
        rt.setSalary(800000);
        System.out.println("Regular employee details:");
        ct.displayFullName();
        System.out.println("firstname:"+rt.getFirstName());
        System.out.println("lasttname:"+rt.getLastName());
        System.out.println("department:"+rt.getDepartment());
        System.out.println("designation:"+rt.getDesig());
        System.out.println("salary:"+rt.getSalary());

    }
}