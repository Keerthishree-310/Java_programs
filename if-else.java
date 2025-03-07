
import java.util.Scanner;

class ifelse{
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter a value");
        int a=value.nextInt();
        if(a>0)
        {
            System.out.println(a+"is positive");
        }
        else if(a<0)
        {
            System.out.println(a+"is negative");
        }
        else{
            System.out.println(a+"is equal to zero");
        }
    }
}