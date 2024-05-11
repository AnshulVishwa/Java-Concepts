public class fibonacci {
    public static void fibo( int count , int init , int sum , int prev ){
        if( init == count ){
            return;            
        }
        if( init == 0 ){
            prev = 0;
            sum = 0;
        }
        if( init == 1 ){
            prev = 0;
            sum = 1;
        }
        else{
            int a = sum;
            sum = prev + sum;
            prev = a;
        }
        System.out.println(sum);
        fibo( count , init + 1 , sum , prev );

    }
    public static void main( String args[] ){
        fibo( 10 , 0 , 0 , 0);
    };
}