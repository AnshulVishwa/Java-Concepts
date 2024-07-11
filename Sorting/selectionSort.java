package Sorting;

public class selectionSort {
    public static void main(String[] args) {
        int arr[] = { 2 , 8 , 9 , 1 , 0 , 5 };

        for( int i = 0 ; i < arr.length - 1 ; i++ ){
            int num = arr[i];
            for( int k = i + 1 ; k < arr.length ; k++ ){
                if( num > arr[k] ){
                    arr[i] = arr[k];
                    arr[k] = num;
                }
            }
        }
        for( int i = 0 ; i < arr.length ; i++ ){
            System.out.print(arr[i] + "\t");
        }
    }
}
