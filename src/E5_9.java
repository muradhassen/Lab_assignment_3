import java.util.Scanner;

public class E5_9 {
    public static void main(String[] args) {
        int num1;
        int num2 ;
        int num3;
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        num2 =  scanner.nextInt();
        num3 = scanner.nextInt();
        if(num1<=num2 && num2<=num3)
        {
            System.out.println("in order");
        }
        else if(num3>=num2 && num2>=num1)
        {
            System.out.println("in order");
        }
        else {
            System.out.println("not in order");
        }

    }

}
