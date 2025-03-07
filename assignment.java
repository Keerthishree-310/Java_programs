
import java.util.Scanner;

class assignment
{
    public static void main(String[] args)
    {
      Scanner value = new Scanner(System.in);
      int a = value.nextInt();
      int b = value.nextInt();
        System.out.println(a+=b);
        System.out.println(a-=b);
        System.out.println(a*=b);
        System.out.println(a/=b);
        System.out.println(a%=b);
    }
}