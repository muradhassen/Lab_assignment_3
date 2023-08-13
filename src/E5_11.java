import java.util.Scanner;

public class E5_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] direction = {"N", "NE", "E", "SE", "S", "SW", "W", "NW", "N"};
        double angle ;
        angle = scanner.nextDouble();
        int index = (int)(Math.round(angle/45.0))%8;
        System.out.println("the nearest compass direction "+direction[index]);
    }
}
