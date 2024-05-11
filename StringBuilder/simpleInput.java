package StringBuilder;

import java.util.*;
public class simpleInput {
    public static void main( String args[] ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of User : ");
        String a = sc.nextLine();
        StringBuilder name = new StringBuilder(a);
        System.out.println("Usre's Name is " + name);
    }
}
