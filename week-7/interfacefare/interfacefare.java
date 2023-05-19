interface Fare{
    int getAmount(int dist,int charge);
}
class Bus implements Fare{
   public  int getAmount(int dist,int charge)
    {
        return(dist*charge);
    }
}
class Train implements Fare{
   public  int getAmount(int dist,int charge)
    {
        return(dist*charge);
    }

}