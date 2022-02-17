package ObjectOrientedProg.Polymorphism;

public class FinalKeywordApplications {
    /*
    Using Final Keyword
    --> We can Prevent Method Overriding
    --> We can also Prevent Inheritance
     */
    public static void main(String [] args){

    }
}
// Here this will prevent this Class from Inheritance
// When You Declare a Class as final it Implicitly Declare All it's Methods as final
final class Parent{
    // This will Prevent this Method from Overridden in Child classes
    final void greeting(){
        System.out.println(" Hello I am in Parent Class ");
    }
}
//class Child extends Parent{
////    void greeting(){
////        System.out.println(" Hey! I am in Parent Class ");
////    }
//}
