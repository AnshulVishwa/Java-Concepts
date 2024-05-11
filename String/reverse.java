package String;

import java.util.*;

public class reverse {
    public static void main(String args[]){
        String name = "Anshul";
        String newName = "";
        for( int i = name.length() - 1 ; i >= 0 ; i-- ){
            newName += name.charAt(i);
        }
        System.out.println(newName);
    }
    
}