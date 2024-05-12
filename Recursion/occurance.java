// Find first nd last occurance of an element

public class occurance {
    public static void ShowMe( int count , StringBuilder name , char find , int first , int last){
        if(count == name.length()){
            System.out.println("The first occurance of " + find + " is " + first + " & The last occurance of " + find + " is " + last);
            return;
        }
        char currElement = name.charAt(count);
        if(currElement == find){
            if( first == -1 ){
                first = count;
            }
            else{
                last = count;
            }
        }
        ShowMe(count+1, name , find , first , last );
    }
    public static void main( String args[] ){
        String name = "aabaa";
        char find = 'a';
        StringBuilder sb = new StringBuilder(name);
        ShowMe( 0 , sb , find , -1 , -1 );
    }
}
