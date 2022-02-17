package ObjectOrientedProg.Polymorphism;

public class MethodOverriding {
    /*
    Method Overriding --> Situation when Parent and Child Class both have Same Methods with
    Same Name, Same Parameters as well Same Return type
     */
    public static void main(String [] args){
        CE2 obj = new CE2();
        obj.students();

        CE1 obj1 = new CE2();
        obj1.students();
    }
}

class CE1 {
    void students(){
        System.out.println(" Hey ! I am from 2CE1 ");
    }
}
class CE2 extends CE1{
    // Method is Overridden
    @Override  // This is Annotation
    void students(){
        System.out.println(" Hey ! I am from 2CE2 ");
    }
}
