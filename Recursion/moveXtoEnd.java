public class moveXtoEnd {
    public static void moveX( StringBuilder sb , int index ){
        if( index == sb.length() ){
            System.out.println(sb);
            return;
        }
        if( sb.charAt(index) == 'x' ){
            sb.delete(index, index+1);
            sb.append('x');
        } 
        moveX(sb, index+1);
    }
    public static void main( String args[] ){
        String str = "avxbxssx";
        StringBuilder sb = new StringBuilder(str); 
        moveX(sb , 0);
    }
}
