// We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius. Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively. Create an object of class 'Area' and call all the three methods.
abstract class Shape{
    abstract void RectangleArea( int l , int b );
    abstract void SquareArea( int s );
    abstract void CircleArea( int r );
}

class Area extends Shape{
    void RectangleArea( int l , int b ){ 
        int area = l*b;
        System.out.println("The area of Rectangle is " + area);
     };
    void SquareArea( int s ){
        double area = Math.pow( s , 2 );
        System.out.println("Area of the Square is " + area);
    };
    void CircleArea( int r ){
        double area = Math.PI * Math.pow( r , 2 );
        System.out.println("Area of the Circle is " + area);
    };
}

public class abstract6 {
    public static void main(String[] args) {
        Area area = new Area();
        area.RectangleArea(10, 20);
        area.SquareArea(10);
        area.CircleArea(5);
    }    
}
