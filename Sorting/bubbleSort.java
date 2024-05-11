package Sorting;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = { 17 , 18 ,12 , 55 , 1 , 25 };
        int len = arr.length;
        for( int i = 0 ; i < arr.length - 1 ; i++ ){
            len = len - 1 ;
            // System.out.println(len);
            for( int j = 0 ; j < len; j++ ){
                int a = arr[j];
                int b = arr[j+1];
                if(arr[j] > arr[j+1]){
                    arr[j] = b;
                    arr[j+1] = a;
                }
            }
        }
        for(int k = 0 ; k < arr.length ; k++){
            System.out.println(arr[k]);
        }
    }
}
