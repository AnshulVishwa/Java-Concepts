public class HourGlass {
    public static void main(String[] args) {
        int rows = 5;
        // Inverted Diamond
        for( int i = 0 ; i <= rows ; i++ ){
            for( int j = 0 ; j <= i ; j++ ){
                System.out.print(" ");
            }
            for( int k = rows ; k >= i ; k-- ){
                System.out.print("*");
            }
            for( int k = rows ; k > i ; k-- ){
                System.out.print("*");
            }
            System.out.println();
        }
        // Seedha Diamond
        for( int i = 0 ; i <= rows ; i++ ){
            for( int j = rows ; j >= i ; j-- ){
                System.out.print(" ");
            }
            for( int k = 0 ; k <= i ; k++ ){
                System.out.print("*");
            }
            for( int k = 0 ; k < i ; k++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
