import java.util.Scanner;

public class E5_15 {
    public static void main(String[] args) {
        double income ;
        Scanner scanner = new Scanner(System.in);
        income = scanner.nextDouble();
        double fst = 50000*0.01;
        double second = fst+(25000*0.02);
        double thrd =  second + (25000*0.03);
        double forth = thrd + ((250000-100000)*0.04);
        double five =  forth + ((500000-250000)*0.05);
        double tax =0 ;
        if(income<=50000.)
        {
            tax = income*0.01;
        } else if (income>50000 && income<75000) {
            tax = fst+(income-50000)*0.02;
        } else if (income>75000 && income<100000) {
            tax = tax + second + (income-75000)*0.03;
        } else if (income>100000 && income<250000) {
           tax = thrd + (income-100000)*0.04 ;
        } else if (income>250000 && income<500000) {
            tax = forth + (income-250000)*0.05;
        } else if (income>500000) {
            tax = five + (income-500000)*0.06;
        }
        System.out.println("Total tax amount is "+tax);
    }
}
