import java.util.Scanner;

public class E5_1 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        if(number>0)
        {
            System.out.println("Positive");
        }
        else if(number<0)
        {
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }


    }
}
