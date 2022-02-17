package ObjectOrientedProg.Polymorphism;

import ObjectOrientedProg.AccessControls.A;

public class Main {
    public static void main(String [] args){
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        shape.area();
        circle.area();
        square.area();

        A obj = new A(1, "Deepak Kumar", new int[]{1,2,3});
        System.out.println(obj.getNum());
        // By Default num of Class A is Protected so You can't Access num in different Packages
//        System.out.println(obj.num);


    }
}
