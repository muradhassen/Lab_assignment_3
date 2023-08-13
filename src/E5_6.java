import java.util.Scanner;

public class E5_6 {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        if(num1==num2 && num1==num3)
        {
            System.out.println("all the same");
        }
        else if(num1 != num2 && num1!=num3 && num2!=num3)
        {
            System.out.println("all the different ");
        }
        else
        {
            System.out.println("neither");
        }
    }
}
