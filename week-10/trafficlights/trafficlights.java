class TrafficLights implements Runnable{
    public void run()
    {
        while(true){
        System.out.println("RED");
        t1.sleep(10000ms);
        System.out.println("YELLOW");
        t1.sleep(10000ms);
        System.out.println("GREEN");
        t1.sleep(10000ms);
        }

    }

}
class Main{
    public static void main(String[] args)
    {
        TrafficLights tl=new TrafficLights();
        Thread t1=new Thread(tl,"t1");
        t1.start();
    }
}