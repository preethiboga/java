import java.util.*;
class LinearSearch{
    private int n;
    private int key;
    private int[] array;
    public void setN(int n)
    {
        this.n=n;
    }
    public void setKey(int key)
    {
        this.key=key;
    }
    public void setArray(int[] array)
    {
        this.array=Arrays.copyOf(array,array.length);
    }
    int search(){
        int i,x=-1;
        for(i=0;i<n;i++)
        {
            if(array[i]==key)
            {
                x=i;
                break;

            }
        }
        return x;
    }
}