// We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. Create an object for eac of the two classes and print the percentage of marks for both the students.

abstract class marks{
    abstract void getPercentage();
}
class A extends marks{ 
    int e;
    int h;
    int m;
    A( int e, int h, int m ){
        this.e = e;
        this.h = h;
        this.m = m;

    }
    void getPercentage(){
        int add = e + h + m;
        double percentage = add/3;
        System.out.println(percentage); 

    }
}
class B extends marks{ 
    int e;
    int h;
    int m;
    int s; 
    B( int e, int h, int m, int s ){
        this.e = e;
        this.h = h;
        this.m = m;
        this.s = s;
    }
    void getPercentage(){
        int add = e + h + m + s;
        double percentage = add/4;
        System.out.println(percentage); 

    }
}

public class abstract3 {
    public static void main(String[] args) {
        A a = new A(60, 75, 87);
        B b = new B(91, 76, 65, 87);
        a.getPercentage();
        b.getPercentage();
    }
}