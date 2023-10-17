package Patterns;

import java.util.Scanner;

public class Priyamid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
