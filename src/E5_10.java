import java.util.Scanner;

public class E5_10 {
    public static void main(String[] args) {
        int num1 ;
        int num2 ;
        int num3 ;
        int num4 ;
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        num4 = scanner.nextInt();
        int pairsCount = 0;

        if (num1 == num2) {
            pairsCount++;
        }

        if (num1 == num3) {
            pairsCount++;
        }

        if (num1 == num4) {
            pairsCount++;
        }

        if (num2 == num3) {
            pairsCount++;
        }

        if (num2 == num4) {
            pairsCount++;
        }

        if (num3 == num4) {
            pairsCount++;
        }


        if (pairsCount == 2) {
            System.out.println("Two pairs");
        } else {
            System.out.println("Not two pairs");
        }
    }
}
