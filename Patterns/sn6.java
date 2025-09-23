package Patterns;

import java.util.Scanner;

public class sn6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int len=s.nextInt();
        for(int i=len;i>=0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
