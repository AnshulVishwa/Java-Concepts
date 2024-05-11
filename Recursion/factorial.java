package Recursion;
public class factorial {
    public static void factorial( int n , int init , int sum ){
        if ( n == 0 ){
            System.out.println(sum);
            return;
        }
        sum *= init  ;
        factorial( n-1 , init+1 , sum );
    }
    public static void main( String argd[] ){
        factorial( 5 , 1 , 1 );
    }
}