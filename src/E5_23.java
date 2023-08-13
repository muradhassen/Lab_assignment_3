import java.util.Scanner;

public class E5_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the cost of your groceries: ");
        double buyProduct = scanner.nextDouble();
        double discount = 0 ;
        if(buyProduct<10)
        {
           discount = 0 ;
        } else if (buyProduct>=10 && buyProduct<60) {
            discount=buyProduct*0.08;
        } else if (buyProduct>=60 && buyProduct<150) {
            discount = buyProduct*0.1;
        } else if (buyProduct>=150 && buyProduct<210) {
            discount = buyProduct*0.12;
        }
        else {
            discount = buyProduct*0.14;
        }
        System.out.println("You win a discount coupon of $ "+discount);
    }
}
