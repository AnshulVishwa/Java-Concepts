public class Diamond {
    public static void main(String[] args) {
        int rows = 5;
        for( int i = 0 ; i <= rows ; i++ ){
            // Right Half Pyramid 
            for( int j = rows ; j >= i ; j-- ){
                System.out.print(" ");
            }
            for( int k = 1 ; k <= i ; k++ ){
                System.out.print("*");
            }
            // Left Half Pyramid
            for( int k = 0 ; k <= i ; k++ ){
                System.out.print("*");
            }
            // Moving Down
            System.out.println();
        }
        for( int i = 0 ; i <= rows ; i++ ){
            // Right Half Pyramid Inverted
            for( int j = 0 ; j <= i+1 ; j++ ){
                System.out.print(" ");
            }
            for( int k = rows-1 ; k > i ; k-- ){
                System.out.print("*");
            }
            // Left Half Inverted Pyramid
            for( int k = rows-1 ; k >= i ; k-- ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
