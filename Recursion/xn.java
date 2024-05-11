// to print x^n where n = stack height

public class xn {
    public static int calcPower( int x , int n ){
        if( x == 0 ){
            return 0;
        }
        if( n == 0 ){
            return 1;
        }
        int xnm1 = calcPower(x, n-1);
        int xn = xnm1 * x;
        return xn;
    }
    public static void main( String args[] ){
        System.out.println(calcPower(2, 3));
    }    
}
