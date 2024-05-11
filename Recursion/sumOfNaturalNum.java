package Recursion;

public class sumOfNaturalNum {
    public static void sum(int n , int i){
        if(n == 0){
            System.out.println(i + (i+1));
            return;
        }
        sum( n-1 , i+1 );
    }
    public static void main( String args[] ){
        sum(6 , 0);
    }
}
