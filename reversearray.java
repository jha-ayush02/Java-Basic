package College;

import java.util.Scanner;

public class reversearray
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[]{1,2,3,4,5};
        int n=a.length;
        for(int i=0;i<n/2;i++)
        {
            int temp=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=temp;
        }
        for(int i:a)
        {
            System.out.println(i);
        }
        sc.close();
    }
}
