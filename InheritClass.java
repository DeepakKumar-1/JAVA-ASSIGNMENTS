package ObjectOrientedProg.Inheritance;

public class InheritClass {
    public static void main(String [] args){
        A obj = new A();
        obj.greeting();

        B obj1 = new B();
        obj1.greeting();
        obj1.greet();
    }
}

class A{
    void greeting(){
        System.out.println("I am in Base Class");
    }
}

class B extends A{
    void greet(){
        System.out.println("I am in Child Class");
    }
}
