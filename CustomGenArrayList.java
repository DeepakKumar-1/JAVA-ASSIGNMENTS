package ObjectOrientedProg.Generics;

import java.util.Arrays;

public class CustomGenArrayList<T> {
    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    private CustomGenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        // Copy the Current items in the new Array
        for (int i = 0; i < data.length; i++)
            temp[i] = data[i];
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index) {
        return (T)(data[index]);
    }

    public int size() {
        return data.length;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size = " + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add(45);
//        list.remove(0);
//        list.get(0);
//        list.set(0, 78);
//        list.size();
//        list.isEmpty();

       CustomGenArrayList<Integer> list = new CustomGenArrayList<>();
        list.add(3);
        list.add(7);
        list.add(1);
        System.out.println(list);
    }
}
