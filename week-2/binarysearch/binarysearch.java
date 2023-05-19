import java.util.*;
class BinarySearch{
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
    void search(){
        Arrays.sort(array);
        int start=0;
        int last=n-1;
        int mid=(int)(start+last)/2;
        while(start<=last)
        {
            if(array[mid]==key)
            {
                System.out.println("key found at index="+mid);
                break;
            }
            else if(array[mid]<key)
            start=mid+1;
            else
            last=mid-1;
            mid=(int)(start+last)/2;

        }
        if(start>last)
        System.out.println("not found");
        
    }
}