import java.util.*;
class StringInReverse{

    public static void reverseMyString( String name , String newOne , int length ){
        StringBuilder sb = new StringBuilder(name);
        if( length == 1 ){
            newOne += sb.charAt(length-1);
            System.out.println(newOne);
            return;
        }
        newOne += sb.charAt(length-1);
        reverseMyString(name, newOne, length-1);
    }
    public static void main( String args[] ){
        System.out.print("Enter any String : ");
        Scanner sc = new Scanner( System.in );
        String enter = sc.nextLine();
        reverseMyString( enter , "" , enter.length() );
    }
}