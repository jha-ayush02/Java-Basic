package Pattern;

import java.util.Scanner;

public class RectanglePattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
//        int i=1;
//        int j=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
