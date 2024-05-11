public class pattern2 {
public static void main(String args[]){
    int a = 1 ;
    int b = 10;
    for( int i = a ; i < b ; i++ ){
        System.out.print("*");
        for( int j = a ; j < b ; j++ ){
            if( i>a && i<b-1 ){
                System.out.print(" ");
            } 
            else{
                System.out.print("*");
            }
            if(j==b-1){
                System.out.print("*");
            }
        }
        System.out.print("\n");
    }
}
}
