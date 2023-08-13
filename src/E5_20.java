import java.util.Scanner;

public class E5_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char inp = scanner.next().charAt(0);
     char input =    Character.toUpperCase(inp);

         if(input=='A'||input=='I'||input=='O'||input=='E'||input=='U')
         {
             System.out.println("Vowel");
         }
         else if(input>='B' && input<='Z')
         {
             System.out.println("Consonant");
         }
         else {
             System.out.println("error ");
         }

    }
}
