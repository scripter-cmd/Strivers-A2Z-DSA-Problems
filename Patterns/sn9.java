package Patterns;

import java.util.Scanner;

public class sn9 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();

        //upper part
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num-i-1;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //down part 
        for(int i=num-1;i>=0;i--)
        {
            for(int j=num-i-1;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int j=2*i+1;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        
    }
}