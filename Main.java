package ObjectOrientedProg.Inheritance;

public class Main {
    public static void main(String [] args){
//        Box obj = new Box();
//        obj = new Box(2);
//        obj = new Box(1, 2, 3);
//        Box box = new Box(obj);
//        System.out.println(obj.l + " " + obj.w + " " + obj.h);
//        System.out.println(box.l + " " + box.w + " " + box.h);

        BoxWeight obj = new BoxWeight();
        obj = new BoxWeight(1, 2, 3, 4);
        System.out.println(obj.h + " " + obj.l + " " + obj.w + " " + obj.weight);
    }
}
