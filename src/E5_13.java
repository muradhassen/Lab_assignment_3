import java.util.Locale;
import java.util.Scanner;

public class E5_13 {
    public static void main(String[] args) {
        char first;
        Scanner scanner = new Scanner(System.in);
       //irst = scanner.next().charAt(0);
       String grade ;
       grade = scanner.next().toUpperCase(Locale.ROOT);
       double convert_grate = 0;
       if(grade.substring(0,1).equals("A"))
       {
           convert_grate = 3.7;
       }
       else if(grade.substring(0,1).equals("B"))
       {
           convert_grate = 2.7;
       } else if (grade.substring(0,1).equals("C"))
       {
           convert_grate = 1.7;
       } else if (grade.substring(0,1).equals("D")) {
           convert_grate = 0.7;
       } else if (grade.substring(0,1).equals("F")) {
           convert_grate = 0;
       }
       else {
           System.out.println("Wrong input");
       }
       if(grade.length()>1)
       {
           char second = grade.charAt(1);
           if(second=='+')
           {
               convert_grate = convert_grate + 0.3;
           }
           else {
               convert_grate = convert_grate - 0.3;
           }
       }
        System.out.println("Student result is "+convert_grate);
    }
}
