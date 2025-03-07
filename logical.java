
import java.util.Scanner;

class logical{
   public static void main(String[] args) {
       Scanner Values=new Scanner(System.in);
       System.out.println("Enter a value");
       int a=Values.nextInt();
       if(a%3==0&&a%5==0)
       {
        System.out.println( a+ "is divisible by 3 & 5");
       }
       else{
        System.out.println(a + "is not divisible by 3 & 5");
       }
   } 
}