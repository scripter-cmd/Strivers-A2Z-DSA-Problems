package Patterns;

public class sn14 {
    public static void main(String[] args) {
        char l='A';
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print((char)((int)l+j));
            }
            System.out.println();
        }
        

    }
}
