package StringBuilder;
import java.util.*;
public class StringBuilderMethods {
    public static void main( String args[] ){
        Scanner sc = new Scanner(System.in);
        StringBuilder myName = new StringBuilder("Anshl");
        System.out.println("myName = " + myName);
        System.out.println("//   Oh! , I think i miss the charactre at index '4'. Can i insert any element over there ? ");
        System.out.println("//   The answer is yes!");
        System.out.println("//   myName.insert( 'index' , 'value' )");
        myName.insert(4, "u");
        System.out.println(">> " + myName);
        
        sc.nextLine();
        
        System.out.println("");
        System.out.println("//   I want to check which character is at index 2");
        System.out.println("//   Sure here's the method");
        System.out.println("//   myName.charAt( 'index' )");
        System.out.println(">> " + myName.charAt(2));
        
        sc.nextLine();

        System.out.println("");
        System.out.println("can you replace the character at index 1 with the character 'V'");
        System.out.println("Sure as you wish");        
        System.out.println("myname.setCharAt( 'index' , 'value' )");
        myName.setCharAt(1, 'V');
        System.out.println(">>  " + myName);        

        sc.nextLine();

        System.out.println("");
        System.out.println("//  can i make it a sentence? , I mean can i add something at the end in this string without telling its INDEX? ");
        System.out.println("//  Oh Sure there is a method called 'append', let me show you ");
        System.out.println( "//   myName.append(' value '); " );
        myName.append("//   is a good Boy.");
        System.out.println(">>  "+myName);
        
        sc.nextLine();

        System.out.println("");
        System.out.println("//  now its time to delete the selected part.");
        System.out.println("//  yes we can delete the part.");
        System.out.println("//  myName.delete( 'start' , 'end' ) ");
        myName.delete(6, 25);

    }
}
