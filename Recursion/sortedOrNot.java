class sortedOrNot{
    public static void sortArray( int arr[] , int index ){
        if( index == arr.length-1 ){
            System.out.println("This array is sorted and strictly increasing");
            return;
        }
        if( arr[index] >= arr[index+1] ){
            System.out.println(" It is not Sorted.");
            return;
        }
        sortArray(arr, index+1);

    }
    public static void main( String args[] ){
        int Myarr[] = { 1 , 2, 3,4,5 };
        sortArray( Myarr , 0 );
    }
}