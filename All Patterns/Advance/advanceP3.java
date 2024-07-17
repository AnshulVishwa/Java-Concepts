
public class advanceP3 {
    public static void main( String args[] ){
        int n = 5;
        int space = n;
        for( int i = 1 ; i <= n ; i++ ){
            space--;
            for(int  k = 0 ; k < space ; k++ ){
                System.out.print(" ");
            }
            for( int j = 1 ; j <= i ; j++ ){
                System.out.print(" ");
                System.out.print(i);
            }
        System.out.print("\n");
        }
    }
}
