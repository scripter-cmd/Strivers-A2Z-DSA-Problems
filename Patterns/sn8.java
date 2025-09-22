package Patterns;

import java.util.Scanner;

public class sn8 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
             for(int j=0;j<2*i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();

            // String spaces = " ".repeat(n - i - 1);
            // String stars = "*".repeat(2 * i + 1);
            // System.out.println(spaces + stars);
        }
    }
}
