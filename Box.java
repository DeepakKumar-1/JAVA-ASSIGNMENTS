package ObjectOrientedProg.Inheritance;

public class Box {
    double h, l, w;

    Box(){
        // super();
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }
    // Cube
    Box(double side){
        this.h = side;
        this.l = side;
        this.w = side;
    }
    Box(double h, double l, double w){
        this.h = h;
        this.l = l;
        this.w = w;
    }

    // Copy Constructor
    Box(Box old){
        old.h = h;
        old.l = l;
        old.w = w;
    }
}
