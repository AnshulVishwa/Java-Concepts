public class oneZero_LeftHalfPyramid {
public static void main(String args[]){
    int a = 0;
    for(int i = 1 ; i < 5 ; i++){
        for (int j = 0 ; j < i ; j++){
            if(a==0) a=1;
            else if(a==1) a=0;

            System.out.print(a);
        }
        System.out.println("");
    }
}
}
