package ObjectOrientedProg.Inheritance;

public class ConstructorsInInheritance {
    public static void main(String[] args) {
        // Creating Object of Child Class
        // When Object of Base Class is Created Constructor of Base Class is Called
        Base obj = new Base();
        // When Object of Child Class is Created Constructors will Execute in this Manner:
        // Base Class Constructor
        // then Child Class Constructor
        Child obj1 = new Child();

    }
}

class Base{
    Base(){
        System.out.print("Hello I am in Base Class\n");
    }
}

class Child extends Base{
    Child(){
        System.out.println("Hello I am in Child Class");
    }
}