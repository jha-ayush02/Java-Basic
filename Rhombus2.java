package Patterns;

import java.util.Scanner;

public class Rhombus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j2 = 0; j2 < i; j2++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {

                System.out.print("* ");

            }

            System.out.println();
        }
    }
}
