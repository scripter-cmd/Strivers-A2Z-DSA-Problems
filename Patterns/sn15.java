package Patterns;

public class sn15 {
    public static void main(String[] args) {
        char l='A';
        for(int i=5;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print((char)((int)l+j));
            }
            System.out.println();
        }
    }
    
}
