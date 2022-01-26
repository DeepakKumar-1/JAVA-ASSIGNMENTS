package com.company.Trees;

public class ConstructTreeFromPreIn extends NodeWithLargestValue {

    // Construct Tree Using InOrder and Preorder Traversal
    public static BinaryTreeNode<Integer> helper(int []pre, int []in, int sPre, int ePre, int sIn, int eIn){
        if(sPre > ePre){
            return null;
        }
        int rootData = pre[sPre];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        int indexOfRoot =  -1;
        for(int index = sIn; index <= eIn; index++){
            if(in[index] == rootData){
                indexOfRoot = index;
                break;
            }
        }

        int sPreLeft = sPre + 1;
        int sInLeft = sIn;
        int ePreRight = ePre;
        int eInRight = eIn;

        int sInRight = indexOfRoot + 1;
        int eInLeft = indexOfRoot - 1;
        int ePreLeft = sPre + indexOfRoot - sIn;
        int sPreRight = ePre - eIn + indexOfRoot + 1; // pe - ie + pos + 1


        BinaryTreeNode<Integer>  left = helper(pre, in, sPreLeft, ePreLeft,sInLeft, eInLeft);
        BinaryTreeNode<Integer>  right = helper(pre, in, sPreRight, ePreRight,sInRight, eInRight);
        root.left = left;
        root.right = right;
        return root;
    }
    public static BinaryTreeNode<Integer> constructTreeFromPreIn(int []pre, int []in){
        BinaryTreeNode<Integer> root = helper(pre, in, 0, pre.length - 1, 0, in.length - 1);
        return root;
    }
    public static void postOrder(BinaryTreeNode<Integer> root){
        if (root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val + " ");
        }
    }
    public static void main(String []args){
        int []pre = {1, 2, 4, 5, 3, 6, 7};
        int []in = {4, 2, 5, 1, 6, 3, 7};
        BinaryTreeNode<Integer> root = constructTreeFromPreIn(pre, in);
        postOrder(root);
        System.out.println();
        levelOrderTraversal(root);
    }
}
