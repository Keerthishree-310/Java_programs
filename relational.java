import java.util.Scanner;
class relational{
    public static void main(String[] args) {
        Scanner values=new Scanner(System.in);
        System.out.println("Enter values for 'a' and 'b'");
        int a = values.nextInt();
        int b = values.nextInt();
       if(a==b)
       {
        System.out.println("a and b are equal");
       }
      else if(a>b)
       {
        System.out.println("a is greater");
       }
      else {
        System.out.println("b is greater");
      }
    }
}
