public class pattern5 {
    public static void main(String args[]){
        
        for ( int i = 1 ; i < 7 ; i++ ){
            // System.out.print(i);
            for( int j = 6 ; j > 0 ; j-- ){
                if( i < j ) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
