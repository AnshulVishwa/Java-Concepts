package StringBuilder;
import java.util.*;
public class JoinString {
    public static void main( String args[] ){
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your First name : ");
        str1.append(sc.nextLine());
        System.out.printf("Enter your last name : ");
        str2.append(sc.nextLine());
        str1.append(" ");
        str1.append(str2);
        System.out.println("Full name is : " + str1);
    }
}
