package College;

import java.util.Scanner;

public class MissingNo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        boolean arr[]=new boolean[n];
        for(int i=0;i<n;i++)
        {
            int k=a[i];
            arr[k-1]=true;
        }

        for(int i=0;i<n;i++)
        {
            if(arr[i]==false)
            {
                int p=i+1;
                System.out.println("The missing number is "+i);
            }
        }
    }
}
