package ObjectOrientedProg.Inheritance;

public class BoxWeight extends Box{
    double weight;

    BoxWeight(){
        weight = -1;
    }

    BoxWeight(int h, int l, int w, int weight){
        super(h, l, w);  // what is this ? It's Saying Call the Parent Class Constructor
        // It is Used When we Want to initialize Values of Constructor of Parent Class
        this.weight = weight;
    }
}
