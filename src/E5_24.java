import java.util.Scanner;

public class E5_24 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Input Temperature Celsius or Fahrenheit ");
        double tem = scanner.nextDouble();
        char type = scanner.next().charAt(0);
        if(type=='F' || type=='f')
        {
            tem = ((tem-32)*5)/9;
        }
        if(tem<=0)
        {
            System.out.println("whether water is solid");
        } else if (tem>0 && tem<100) {
            System.out.println("whether water is liquid");
        }
        else {
            System.out.println("whether water is gaseous");
        }
    }
}
