package Patterns;

public class sn18 {
    public static void main(String[] args) {
        int l=102;
        for(int i=0;i<=5;i++)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print((char)(l-j));
            }
            System.out.println();
        }

    }
    
}
