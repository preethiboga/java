class Vehicle{
    protected int vehicle_number;
    protected int insurance_number;
    protected String color;
    protected int consumption;
    void setInfo(int no,int insuno,String color)
    {
        vehicle_number=no;
        insurance_number=insuno;
        this.color=color;
    }
    void getInfo()
    {
        System.out.println("vehiclenumber="+vehicle_number);
        System.out.println("insurancenumber="+insurance_number);
        System.out.println("color="+color);
    }
    void setConsumption(int c)
    {
        consumption=c;
    }
    void getConsumption()
    {
        System.out.println("consumption="+consumption);
        
    }
    
}
class TwoWheeler extends Vehicle{
   private Double Maintaince;
   private Double avg;
   protected String type;
   protected String company;
   void setMaintaince(Double m)
   {
       Maintaince=m;
   }
   void setAvg(Double avg)
   {
       this.avg=avg;
   }
   void displayMA()
   {
       System.out.println("two wheeler maintaince="+Maintaince);
       System.out.println("two Wheeler avg="+avg);
   }
   void setTypeCompany(String t,String c)
   {
       type=t;
       company=c;
   }
   void displayTC()
   {
       System.out.println("type="+type);
       System.out.println("company="+company);
   }


}
class FourWheeler extends Vehicle{
    private Double Maintaince;
    private Double avg;
    void setMaintaince(Double m)
    {
        Maintaince=m;
    }
    void setAvg(Double avg)
    {
        this.avg=avg;
    }
    void displayMA()
    {
        System.out.println("four wheeler maintaince="+Maintaince);
        System.out.println("four Wheeler avg="+avg);
    }
 
 }
 class Geared extends TwoWheeler
 {
    private Double avg;
     void setAvg(Double avg)
     {
         this.avg=avg;
     }
     void printAvg()
     {
         System.out.println("Geared avg="+avg);
     }

 }
 class NonGeared extends TwoWheeler
 {
    private Double avg;
    void setAvg(Double avg)
    {
        this.avg=avg;
    }
    void printAvg()
    {
        System.out.println("NonGeared avg="+avg);
    }
 }