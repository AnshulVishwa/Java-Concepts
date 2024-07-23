// Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'. Now create a class 'Cats' with a method 'cats' which prints "Cats meow" and a class 'Dogs' with a method 'dogs' which prints "Dogs bark", both inheriting the class 'Animals'. Now create an object for each of the subclasses and call their respective methods.

abstract class Animals{
    abstract void cat();
    abstract void dog();
}
class Cats extends Animals{
    void cat(){
        System.out.println("Cats Meow");
    }
    void dog(){};
}
class Dogs extends Animals{
    void dog(){
        System.out.println("Dogs Bark");
    }
    void cat(){};
}
public class abstract5 {
    public static void main(String[] args) {
        Cats cat = new Cats();
        Dogs dog = new Dogs();
        cat.cat();
        dog.dog();
    }    
}
