import java.util.Scanner;
class ifelse2
{
    public static void main(String[] args) {
        Scanner age=new Scanner(System.in);
        System.out.println("Enter your age");
        int a = age.nextInt();
        if(a>=18)
        {
            System.out.println("Eligible to vote");
        }
        else
        {
            System.out.println("Not eligible to vote");
        }

    }
}