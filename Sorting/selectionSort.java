package Sorting;

public class selectionSort {
    public static void main(String[] args) {
        int arr[] = { 1 , 4 , 9 , 3 , 2 };
        for( int i = 0 ; i < arr.length-1 ; i++ ){
            int small = arr[i];
            int index = i;
            for( int j = 0 + i ; j < arr.length ; j++ ){
                if( arr[j] < arr[index] ){
                    index = j;
                }
            }
            int num = arr[i];
            arr[i] = small;
            arr[index] = num;
        }
        for( int j = 0 ; j < arr.length ; j++ ){
            System.out.println(arr[j] + " \t");

        }
    }
}