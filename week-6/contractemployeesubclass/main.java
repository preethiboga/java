class Main{
    public static void main(String[] args)
    {
        HourlyEmployee ct=new HourlyEmployee();
        ct.setFirstName("Preethi");
        ct.setLastName("Boga");
        ct.setHrs(5);
        ct.setWages(200);
        System.out.println("hourly employee details:");
        System.out.println("firstname:"+ct.getFirstName());
        System.out.println("lastname:"+ct.getLastName());
        System.out.println("no.of hrs:"+ct.getHrs());
        System.out.println("wages:"+ct.getWages());
        System.out.println("salary:"+ct.calcSalary());
        ct.getDesig();
        WeeklyEmployee rt=new WeeklyEmployee();
        rt.setFirstName("Haritha");
        rt.setLastName("Apuri");
        rt.setWeeks(3);
        rt.setWages(600);
        System.out.println("Weekly employee details:");
        System.out.println("firstname:"+rt.getFirstName());
        System.out.println("lastname:"+rt.getLastName());
        System.out.println("no.of weeks:"+rt.getWeeks());
        System.out.println("wages:"+rt.getWages());
        System.out.println("salary:"+rt.calcSalary());
        rt.getDesig();
 

    }
}