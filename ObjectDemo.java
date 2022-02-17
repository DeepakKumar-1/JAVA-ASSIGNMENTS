package ObjectOrientedProg.AccessControls;

public class ObjectDemo {

    @Override
    public String toString(){
        return super.toString();
    }

    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        return super.equals(obj);
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String [] args){
        ObjectDemo obj = new ObjectDemo();
        ObjectDemo obj2 = new ObjectDemo();
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());

        System.out.println(obj.getClass());
        System.out.println(obj.getClass().getName());
    }
}
