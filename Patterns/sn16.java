package Patterns;

public class sn16 {
    public static void main(String[] args) {
        char l='@';
        for(int i=1;i<=5;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print((char)((int)l+i));
            }
            System.out.println();
        }
    }
    
}
