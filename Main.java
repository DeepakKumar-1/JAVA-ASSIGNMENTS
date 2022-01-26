package com.company.Trees;


import java.util.*;

public class Main {

    public static TreeNode<Integer> takeInput(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Next Node Data: ");
        n = sc.nextInt();
        TreeNode<Integer>  root = new TreeNode<Integer>(n);
        System.out.print("Enter Number of Children for " + n + " ");
        int childCount = sc.nextInt();
        for(int i=0; i<childCount; i++){
            TreeNode<Integer> child = takeInput();
            root.children.add(child);
        }
        return root;
    }

    public static void print(TreeNode<Integer> root){
        String s = root.data + ":";
        for(int i=0; i<root.children.size(); i++){
            s = s + root.children.get(i).data + ", ";
        }
        System.out.println(s);
        for(int i=0; i< root.children.size(); i++){
            print(root.children.get(i));
        }
    }
    public static void main(String [] args){
        TreeNode<Integer> root = takeInput();
        print(root);
//        TreeNode<Integer> root = new TreeNode<>(4);
//        TreeNode<Integer> node1 = new TreeNode<>(2);
//        TreeNode<Integer> node2 = new TreeNode<>(3);
//        TreeNode<Integer> node3 = new TreeNode<>(5);
//        TreeNode<Integer> node4 = new TreeNode<>(6);
//        root.children.add(node1);
//        root.children.add(node2);
//        root.children.add(node3);
//
//        System.out.println(root);

//        node2.children.add(node4);


    }
}
