import java.util.Scanner;

public class E5_4 {
    public static void main(String[] args) {
        String str ;
        Scanner scanner = new Scanner(System.in);
        str = scanner.next();
        int length = str.length();
       // System.out.println(str.substring(0,1)+" "+str.substring(length-1));

      // if(str.substring(0,1)==str.substring(length-1))
        if(str.substring(0,1).equals(str.substring(length-1)))
        {
            System.out.println("first and last letter same");
        }
        else
        {
            System.out.println("first and last letter different");
        }
    }
}
