class matrixmultiplication {
    private int a,b,c,d;
    private int [][] mat1;
    private int [][] mat2;
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setD(int d) {
        this.d = d;
    }

    public void setMat1(int[][] mat1) {
        this.mat1 = mat1;
    }

    public void setMat2(int[][] mat2) {
        this.mat2 = mat2;
    }
    void mul()
    {
        int[][] mat3=new int[a][d];
        if(b!=c)
            System.out.println("not possible");
        else
        {
            int i,j,k;
            for(i=0;i<a;i++)
            {
                for(j=0;j<d;j++)
                    mat3[i][j]=0;
            }
            for(i=0;i<a;i++)
            {
                for(j=0;j<d;j++)
                {
                    for(k=0;k<b;k++)
                    {
                    
                        mat3[i][j]=mat3[i][j]+(mat1[i][k]*mat2[k][j]);
                    }   
                }
            }
            for(i=0;i<a;i++)
            {
                for(j=0;j<d;j++)
                {
                    System.out.print(mat3[i][j]+" ");
                }
                System.out.println();
            }


        }
    }

    
}
