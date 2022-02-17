package ObjectOrientedProg.StaticExample;

public class StaticMethod {
    public static void main(String [] args){
        // ERROR !!
        // Because Non static Methods can't be Accessed by static methods
        // Hey! Greeting I think you are Dependent on Objects Where is Your Object ?
        // greeting : Ohh! Sorry I don't have Any Object
        // No No Sorry Worry
//        greeting();
        StaticMethod obj = new StaticMethod(); // You can only Access Non - Static Methods(Methods
        // that depends on Objects) by Creating Object of the Class
        obj.greeting();
    }

    void greeting(){
        System.out.println("Hello World!");
    }
}
