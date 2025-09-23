package Patterns;

import java.util.Scanner;

public class sn11 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        // boolean flag=true;
        int st=1;
        for(int i=0;i<num;i++)
        {

            if(i%2==0) st=1;
            else st=0;


            for(int j=0;j<=i;j++)
            {
                System.out.print(st+" ");
                st=1-st;
            }
            
            
            System.out.println();
        }
        
    }
}
