import java.util.Scanner;

public class E5_5 {

    public static void main(String[] args) {
        String str ;
        Scanner scanner = new Scanner(System.in);
        str = scanner.next();
        int length = str.length();
       // System.out.println(str.substring(0,length/2)+" "+str.substring(length/2,length));
        if(str.substring(0,length/2).equals(str.substring(length/2,length)))
        {
            System.out.println("first and second half same");
        }
        else
        {
            System.out.println("first and second half different");
        }
    }
}
