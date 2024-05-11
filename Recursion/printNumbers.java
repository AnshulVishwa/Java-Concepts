public class printNumbers {
    
    public static void printNumber( int num ){
        if( num >= 6 ) {
            return;
        };
        System.out.println(num);
        printNumber(num+1);
    }
    static public void main( String args[] ){
        printNumber(1);
    }
}
