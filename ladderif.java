
import java.util.Scanner;

class ladderif{
    public static void main(String[] args) {
        Scanner mark = new Scanner(System.in);
        System.out.println("Enter mark");
        int a=mark.nextInt();
        if(a>=90&&a<100)
        {
            System.out.println("A grade");
        }
        else if(a>=80 && a<90)
        {
            System.out.println("B grade");
        }
        else if(a>=70 && a<80)
        {
            System.out.println("C grade");
        }
        else if(a>=60 && a<70)
        {
            System.out.println("D grade");
        }
        else 
        {
          System.out.println("FAILED");  
        }

    }

}