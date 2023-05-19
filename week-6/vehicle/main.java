class Main{
    public static void main(String[] args)
    {
        TwoWheeler t=new TwoWheeler();
        t.setInfo(2,3,"black");
        t.setConsumption(10);
        t.setMaintaince(500.0);
        t.setAvg(300.0);
        System.out.println("Two wheeler info:");
        t.getInfo();
        t.getConsumption();
        t.displayMA();
        FourWheeler f=new FourWheeler();
        f.setInfo(143, 300, "brown");
        f.setConsumption(200);
        f.setMaintaince(2000.0);
        f.setAvg(1500.0);
        System.out.println("Four wheeler info:");
        f.getInfo();
        f.getConsumption();
        f.displayMA();
        Geared g=new Geared();
        System.out.println("geared info:");
        g.setTypeCompany("bullet", "royal");
        g.setInfo(21, 31, "red");
        g.setConsumption(21);
        g.setMaintaince(700.0);
        g.setAvg(100.0);
        g.getInfo();
        g.displayTC();
        g.getConsumption();
        g.displayMA();
        g.setAvg(300.0);
        g.printAvg();
        NonGeared n=new NonGeared();
        System.out.println("nongeared info:");
        n.setTypeCompany("rx", "delux");
        n.setInfo(22, 32, "blue");
        n.setConsumption(22);
        n.setMaintaince(300.0);
        n.setAvg(300.0);
        n.getInfo();
        n.displayTC();
        n.getConsumption();
        n.displayMA();
        n.setAvg(200.0);
        n.printAvg();

    }
}