// Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'. Call this method by creating an object of each of the three classes.



abstract class Bank{
    abstract void getBalance();
}
class BankA extends Bank{ 
    void getBalance(){
        System.out.println("Bank Balance is $100");
    }    
}
class BankB extends Bank{ 
    void getBalance(){
        System.out.println("Bank Balance is $200");
    }
}
class BankC extends Bank{ 
    void getBalance(){
        System.out.println("Bank Balance is $300");
    }
}

public class abstract2 {
    public static void main(String[] args) {
        BankA b1 = new BankA();
        BankB b2 = new BankB();
        BankC b3 = new BankC();
        b1.getBalance();
        b2.getBalance();
        b3.getBalance();
    }
}
