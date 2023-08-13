import java.util.Scanner;

public class E5_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double roundnum1 = Math.round(num1*100)/100.0;
        double roundnum2 = Math.round(num2*100)/100.0;
        if(roundnum1 == roundnum2)
        {
            System.out.println("They are the same up to two decimal places.");
        }
        else {
            System.out.println("They are different.");
        }
    }
}
