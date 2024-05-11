public class factorial {
    public static void factoria( int n , int init , int sum ){
        if ( n == 0 ){
            System.out.println(sum);
            return;
        }
        sum *= init  ;
        factoria( n-1 , init+1 , sum );
    }
    public static void main( String argd[] ){
        factoria( 5 , 1 , 1 );
    }
}