package ObjectOrientedProg.StaticExample;

public class Main {
    public static void main(String [] args) {
        Human deepak = new Human("Deepak Kumar", 19, 10000000, false);
        Human raj = new Human("Deepak Kumar", 19, 10000000, false);
        System.out.println(deepak.population);
        System.out.println(raj.population);
        // Convention :
        System.out.println(Human.population);
    }
}
