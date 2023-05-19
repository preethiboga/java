import java.util.Scanner;

 class Main {
     public static void main(String[] args){
    MatrixAddition m=new MatrixAddition();
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();
    m.setA(a);
    m.setB(b);
    m.setC(c);
    m.setD(d);
    int[][] mat1=new int[a][b];
    int i,j;
    for(i=0;i<a;i++)
    {
        for(j=0;j<b;j++)
        {
            mat1[i][j]=sc.nextInt();
        }
    }
    m.setMat1(mat1);
    int[][] mat2=new int[c][d];
    for(i=0;i<c;i++)
    {
        for(j=0;j<d;j++)
        {
            mat2[i][j]=sc.nextInt();
        }
    }
    m.setMat2(mat2);
    m.add();
}
}
