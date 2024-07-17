public class advanceP2 {
    public static void main(String args[]){
        int n = 5;
        int space = n;
        for( int i = n ; i > 0 ; i-- ){
            space--;
            for( int k = space ; k > 0 ; k-- ){
                System.out.print(" ");
            }
            for( int j = 1 ; j <= n; j++ ){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
