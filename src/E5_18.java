import java.util.Arrays;
import java.util.Scanner;

public class E5_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str[] = new String[3];
        for(int loop = 0 ; loop<3 ;loop++)
        {
            str[loop] = scanner.next();
        }
        Arrays.sort(str);
        for(int loop = 0 ; loop<3 ; loop++)
        {
            System.out.print(str[loop]+" ");
        }
        
    }
}
