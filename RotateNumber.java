package Programs;

import java.util.Scanner;

import static java.lang.Math.log10;
import static java.lang.Math.pow;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        System.out.print("Enter  Number  of Rotation: ");
        int r=sc.nextInt();
        int temp=n;
        int sum=0;

            int totaldigit=(int)log10(n)+1;

            System.out.println("hello");
            sum=(int)((n%(Math.pow(10,r)))*Math.pow(10,totaldigit-r));
           n/=Math.pow(10,r);
            sum+=n;
        System.out.println(sum);

    }
}
