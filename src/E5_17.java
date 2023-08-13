import java.util.Scanner;

public class E5_17 {
    public static void main(String[] args) {
        float num1;
        float num2;
        float num3;
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextFloat();
        num2 = scanner.nextFloat();
        num3 = scanner.nextFloat();
        if (num1 > num2 && num1 > num3) {
            System.out.println("Large number is " + num1);
        } else if (num2 > num3 && num2 > num1) {
            System.out.println("Large number is " + num2);
        } else {
            System.out.println("Large number is " + num3);
        }
    }
}
