
import java.util.Scanner;

class bitwise
{
    public static void main(String[] args)
     {
        Scanner values=new Scanner(System.in);
        int a = values.nextInt();
        int b= values.nextInt();
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(a<<b);
        System.out.println(a>>b);

    }
}