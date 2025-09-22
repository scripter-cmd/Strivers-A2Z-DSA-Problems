package Patterns;

import java.util.Scanner;

public class sn1 {
   public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter no of size :");
     int num=s.nextInt();
     for(int i=0;i<num;i++)
     {
        for(int j=0;j<num;j++)
        {
            System.out.print("* ");
        }
        System.out.println("");
     }
   }
}
