package Patterns;

import java.util.Scanner;

public class sn5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int len=s.nextInt();
        for(int i=len-1;i>=0;i--)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
