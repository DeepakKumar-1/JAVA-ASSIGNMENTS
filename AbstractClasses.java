package ObjectOrientedProg.AbstractClasses;

public class AbstractClasses {
    public static void main(String [] args){
        B obj = new B();
        obj.greeting();
        obj.name();
        // We Can't Create Object of Abstract Class
//        A obj1 = new A();
        A obj2 = new B();
        obj2.name();
        obj2.greeting();
//        obj2.greeting();  // --> Not Possible
        A.greet("Deepak");
    }
}
// If a Class Contains Abstract Methods then Class Should be Abstract
// We Cant Create Abstract Class Constructors
// We can Create Static methods inside the Abstract Classes Because they are Independent of Objects
// So we can Call them Using Class Name
// final Abstract Classes doesn't Exist because final Prevents the Classes from being inherited but for Abstract Classes we want these to be inherited


abstract class A{
    abstract void name();
    void greeting(){
        System.out.println("Hello world!");
    }

    static void greet(String name){
        System.out.println("Hey! How are You " + name);
    }
}

class B extends A{
    @Override
    void name(){
        String name = "Deepak";
        System.out.println("Hello " + name);
    }
    void greeting(){
        System.out.println("Hello world!");
    }
}
