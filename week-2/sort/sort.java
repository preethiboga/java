import java.util.*;
class Sorted{
    private int n;
    private int[] array;
    public void setN(int n)
    {
        this.n=n;
    }
    public void setArray(int[] array)
    {
        this.array=Arrays.copyOf(array,array.length);
    }
    void sorting()
    {
        Arrays.sort(array);
        int i;
        for(i=0;i<n;i++)
        System.out.println(array[i]);
    }
    
}