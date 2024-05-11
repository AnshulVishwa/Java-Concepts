package Recursion;

public class printNumbers {
    
    public static void printNumbers( int num ){
        if( num >= 6 ) {
            return;
        };
        System.out.println(num);
        printNumbers(num+1);
    }
    static public void main( String args[] ){
        printNumbers(1);
    }
}
