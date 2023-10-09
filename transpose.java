package College;

import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=3,c=3;
        int a[][]={ {1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i<=j)
                {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
                }
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
