import java.util.Scanner;

public class E5_3 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        if(num<0)
        {
            num = num*(-1);
        }
        int count = 0;
        while (num!=0)
        {
            int raf = num%10;
            count = count+1;
            num = num/10;
        }
        System.out.println("Total Digit is "+count);

    }
}
