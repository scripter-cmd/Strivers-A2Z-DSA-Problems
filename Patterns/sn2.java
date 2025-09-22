package Patterns;

import java.util.Scanner;

public class sn2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Length :");
        int len=s.nextInt();
        for(int i=0;i<=len;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
