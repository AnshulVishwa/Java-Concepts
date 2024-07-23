// Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with the same name 'message' that prints "This is first subclass" and "This is second subclass" respectively. Call the methods 'message' by creating an object for each subclass.



abstract class Parent{
    abstract void message();
} 

class subClass1 extends Parent{
    void message(){
        System.out.println("This is first subclass");
    }
}

class subClass2 extends Parent{
    void message(){
        System.out.println("This is Second Subclass");
    }
}

public class abstract1 {
    public static void main(String[] args) {
        subClass1 s1 = new subClass1();
        subClass2 s2 = new subClass2();
        s1.message();
        s2.message();
    }
}
