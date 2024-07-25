import java.util.Scanner;

class orders{
    orders( String which , String a ,String b , String c , String d  ){
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to order Sir , In " + which + " we have " + "\n 1. " + a + "\n 2. " + b + "\n 3. " + c + "\n 4. " + d);
        System.out.print(" Order :  ");
        String ans = sc.nextLine();
        if( ans.compareTo(a) == 0 || ans.compareTo("1") == 0 ) System.out.println("Order is placed for " + a);
        if( ans.compareTo(b) == 0 || ans.compareTo("2") == 0 ) System.out.println("Order is placed for " + b);
        if( ans.compareTo(c) == 0 || ans.compareTo("3") == 0 ) System.out.println("Order is placed for " + c);
        if( ans.compareTo(d) == 0 || ans.compareTo("4") == 0 ) System.out.println("Order is placed for " + d);
    }
}
class functions{
    void Starters(){
        orders o = new orders("Starters", "Chilli paneer", "Chilli Potatoes", "French Fries", "Manchurian");
        System.out.println(" \n ----------------- Next Order ---------------- \n ");
        Start s = new Start();
    };
    void MainCourse(){
        orders o = new orders("Main Course", "Paneer Tikka", "Butter Naan", "Roti" , "Sbji");
        System.out.println(" \n ----------------- Next Order ---------------- \n ");
        Start s = new Start();
    };
    void Drinks(){
        orders o = new orders("Milk Shakes", "Chocolate Shake", "Vanilla Shake", "Strawberry Shake", "Butter Scotch");
        System.out.println(" \n ----------------- Next Order ---------------- \n ");
        Start s = new Start();
    };
    void Dessert(){
        orders o = new orders("Dessert", "Gulabb Jamun" , "Ice Cream" , "Chocolate" , "Shree Khand");
        System.out.println(" \n ----------------- Next Order ---------------- \n ");
        Start s = new Start();
    };
}

class Start{
    Start(){
        System.out.println("hello sir what do you want to have : \n 1. Starters \n 2. Main Course \n 3. Milk Shakes \n 4. Dessert \n 5. End  ");
        System.out.print( " Order : ");
        Scanner sc = new Scanner(System.in);
        functions f = new functions();
        String ans = sc.nextLine();
        if( ans.compareTo("Starters") == 0 || ans.compareTo("1") == 0  ) {
            f.Starters();
        }
        if( ans.compareTo("Main Course") == 0 || ans.compareTo("2") == 0 ) {
            f.MainCourse();
        }
        if( ans.compareTo("Milk Shakes") == 0 || ans.compareTo("3") == 0 ) {
            f.Drinks();
        }
        if( ans.compareTo("Dessert") == 0 || ans.compareTo("4") == 0 ) {
            f.Dessert();
        }
        if( ans.compareTo("End") == 0 || ans.compareTo("5") == 0 ) {
            System.out.println( "Your orders will be Ready SOON ... ! \n Thanks for the Patience" );
        }
    }
}

public class menu {
    public static void main(String[] args) {
        Start s = new Start();
    }
}
