package Patterns;

import java.util.Scanner;

public class sn10 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        //uper part
        for(int i=0;i<=num;i++)
        {
            System.out.print("*".repeat(i));
            System.out.println();
        }
        for(int i=num-1;i>0;i--)
        {
            System.out.print("*".repeat(i));
            System.out.println();
        }
    }
}
