import java.util.Scanner;

public class E5_2 {
    public static void main(String[] args) {
        float num ;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextFloat();
        if(num==0)
        {
            System.out.println("Zero");
        }
        else if(num<0)
        {
            System.out.println("Negative");
        }
        else {
            System.out.println("Positive");
        }
        float num1 = Math.abs(num);
        if(num1>1 && num1<1000000.)
        {
            System.out.println("small");
        }
        else if(num1>1000000.)
        {
            System.out.println("Large");
        }

    }
}
