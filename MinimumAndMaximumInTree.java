package com.company.Trees;
class Pairs<T, K>{
    T minimum;
    K maximum;

    public Pairs(T minValue, K maxValue) {
        this.maximum = maxValue;
        this.minimum = minValue;
    }
}
public class MinimumAndMaximumInTree extends NodeWithLargestValue {

    public static Pairs<Integer, Integer> getMinMax(BinaryTreeNode<Integer> root){
        if(root == null){
            return new Pairs<>(Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Pairs<Integer, Integer> leftPair = getMinMax(root.left);
        Pairs<Integer, Integer> rightPair = getMinMax(root.right);
        int minimum = Math.min(root.val, Math.min(leftPair.minimum, rightPair.minimum));
        int maximum = Math.max(root.val, Math.min(leftPair.maximum, rightPair.maximum));
        return new Pairs<>(minimum, maximum);
    }

    public static void main(String [] args){
        BinaryTreeNode<Integer> root, n1, n2, n3, n4, n5, n6, n7, n8;
        root = createNode(0);
        n1 = createNode(3);
        n2 = createNode(10);
        n3 = createNode(1);
        n4 = createNode(6);
        n5 = createNode(14);
        n6 = createNode(4);
        n7 = createNode(7);
        n8 = createNode(13);
        root.left = n1;
        root.right = n2;
        n1.left = n3;
        n1.right = n4;
        n2.right = n5;
        n4.left = n6;
        n4.right = n7;
        n5.left = n8;

        Pairs<Integer, Integer> pair = getMinMax(root);
        System.out.print("Minimum is: " + pair.minimum + " " + "Maximum is: " + pair.maximum);
    }
}
