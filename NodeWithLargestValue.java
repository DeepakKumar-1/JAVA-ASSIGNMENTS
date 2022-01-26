package com.company.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BalanceTreeReturn{
    int height;
    boolean balanced;
}

class Pair<I extends Number, I1 extends Number> {
    int height;
    int diameter;

    Pair(int height, int diameter){
        this.height = height;
        this.diameter = diameter;
    }
}

 class BinaryTreeNode<T>{
    T val;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;
    BinaryTreeNode(T val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}


public class NodeWithLargestValue {
    public static <T>BinaryTreeNode<T> createNode(T val){
        return new BinaryTreeNode<>(val);
    }

    public static int largest(BinaryTreeNode<Integer> root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int largestLeft = largest(root.left);
        int largestRight = largest(root.right);
        return Math.max(root.val, Math.max(largestLeft, largestRight));
    }

    public static int numNodes(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int leftCount = numNodes(root.left);
        int rightCount = numNodes(root.right);
        return 1+leftCount+rightCount;
    }

    public static int nodesGreaterThanX(BinaryTreeNode<Integer>root, int x){
        if(root == null){
            return 0;
        }

        int count = root.val > x ? 1: 0;

        count += nodesGreaterThanX(root.left, x);
        count += nodesGreaterThanX(root.right, x);
        return count;
    }

    public static int height(BinaryTreeNode<Integer> root){
        if(root == null){
            return  0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1 + Integer.max(leftHeight, rightHeight);
    }

    public static int numOfLeafNodes(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        return numOfLeafNodes(root.left) + numOfLeafNodes(root.right);
    }

    public static void printNodesAtDepthK(BinaryTreeNode<Integer> root, int k){
        if(root == null){
            return;
        }
        if(k == 0){
                System.out.print(root.val + " ");
                return;
        }
        printNodesAtDepthK(root.left, k-1);
        printNodesAtDepthK(root.right, k-1);
    }

    public static void replaceNodesWithDepth(BinaryTreeNode<Integer>root, int level){
        if(root == null){
            return;
        }
        root.val = level;
        replaceNodesWithDepth(root.left, level+1);
        replaceNodesWithDepth(root.right, level+1);
    }

    public static void nodeWithoutSibling(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        if(root.left == null && root.right != null){
            System.out.println(root.right.val + " ");
        }
        if(root.left != null && root.right == null){
            System.out.println(root.left.val + " ");
        }
        nodeWithoutSibling(root.left);
        nodeWithoutSibling(root.right);
    }

    public static BinaryTreeNode<Integer> removeLeaf(BinaryTreeNode<Integer> root){
        if(root == null){
            return null;
        }
        if(root.left == null && root.right == null){
            return null;
        }
        root.left =  removeLeaf(root.left);
        root.right = removeLeaf(root.right);
        return root;
    }

    public static void preOrder(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void mirror(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        mirror(root.left);
        mirror(root.right);
        BinaryTreeNode<Integer> Temp = root.left;
        root.left = root.right;
        root.right = Temp;
    }

    public static boolean isBalancedTree(BinaryTreeNode<Integer> root){
        if(root == null){
            return true;
        }
        int leftSubTreeHeight = height(root.left);
        int rightSubTreeHeight = height(root.right);
        if(Math.abs(leftSubTreeHeight - rightSubTreeHeight) > 1){
            return false;
        }
        boolean isLeftBalanced = isBalancedTree(root.left);
        boolean isRightBalance = isBalancedTree(root.right);
        return isLeftBalanced && isRightBalance;
    }

    public static BalanceTreeReturn isBalanced(BinaryTreeNode<Integer> root){
        // Base Case
        if(root == null){
            int height = 0;
            boolean isBal = true;
            BalanceTreeReturn ans = new BalanceTreeReturn();
            ans.height = height;
            ans.balanced = isBal;
            return ans;
        }
        BalanceTreeReturn leftOut = isBalanced(root.left);
        BalanceTreeReturn rightOut = isBalanced(root.right);
        boolean isBal = true;
        int height = 1 + Math.max(leftOut.height, rightOut.height);
        if(Math.abs(leftOut.height - rightOut.height) > 1){
            isBal = false;
        }
        if(!leftOut.balanced || !rightOut.balanced){
            isBal = false;
        }
        BalanceTreeReturn ans = new BalanceTreeReturn();
        ans.height = height;
        ans.balanced = isBal;
        return ans;
    }

    public static int diameterOfTree(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int opt1 = height(root.left) + height(root.right);
        int opt2 = diameterOfTree(root.left);
        int opt3 = diameterOfTree(root.right);
        return Math.max(opt1, Math.max(opt2, opt3));
    }

    public static Pair<Number, Number> diameterHelper(BinaryTreeNode<Integer> root){
        if(root == null){
            return new Pair<Number, Number>(0, 0);
        }

        Pair<Number, Number> leftPair =  diameterHelper(root.left);
        Pair<Number, Number> rightPair = diameterHelper(root.right);
        int leftDiameter = leftPair.diameter;
        int rightDiameter = rightPair.diameter;

        int dist = leftPair.height + rightPair.height + 1;
        int diameter = Math.max(leftDiameter, Math.max(rightDiameter, dist));

        int height = Math.max(leftPair.height, rightPair.height) + 1;

        return new Pair<Number, Number>(diameter, height);
    }

    public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
        Pair<Number, Number> pair = diameterHelper(root);
        return pair.diameter;
    }


    public static BinaryTreeNode<Integer> treeInputLevelWise(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Root Data: ");
        int rootData = sc.nextInt();
        if(rootData == -1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryTreeNode<Integer> root1 = queue.poll();
            // Take Left Input
            System.out.print("Enter Left Data: ");
            int leftData = sc.nextInt();
            if(leftData ==  -1){
                root1.left = null;
            }else{
                root1.left = new BinaryTreeNode<>(leftData);
                queue.add(root.left);
            }
            System.out.print("Enter right Data: ");
            int rightData = sc.nextInt();
            if(rightData ==  -1){
                root1.right = null;
            }else{
                root1.right = new BinaryTreeNode<>(leftData);
                queue.add(root.right);
            }
        }
        return root;
    }

    public static void levelOrderTraversal(BinaryTreeNode<Integer> root){
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            BinaryTreeNode<Integer> currentRoot = queue.poll();
            System.out.print(currentRoot.val + " ");
            if(currentRoot.left != null){
                queue.add(currentRoot.left);
            }
            if(currentRoot.right != null){
                queue.add(currentRoot.right);
            }
        }
    }

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
        int sInRight = indexOfRoot + 1;
        int eInLeft = indexOfRoot - 1;
        int ePreLeft = sPreLeft + (eInLeft - sInLeft + 1);
        int sPreRight = ePreLeft + 1;
        int eInRight = eIn;

        BinaryTreeNode<Integer>  left = helper(pre, in, sPreLeft, ePreLeft,sInLeft, eInLeft);
        BinaryTreeNode<Integer>  right = helper(pre, in, sPreRight, ePreRight,sInRight, eInRight);
        root.left = left;
        root.right = right;
        return root;
    }
    public static BinaryTreeNode<Integer> constructTreeFromPreIn(int []pre, int []in){
        BinaryTreeNode<Integer> root = helper(pre, in, 0, pre.length, 0, in.length);
        return root;
    }
    // Construct Binary Tree Using InOrder and PostOrder Traversal
        public static BinaryTreeNode<Integer> helper1(int []post, int []in, int sPost, int ePost, int sIn, int eIn){
            if(sPost > ePost || sIn > eIn){
                return null;
            }
            // Find Root
            int rootData = post[ePost];
            BinaryTreeNode<Integer>  root = new BinaryTreeNode<>(rootData);


            // Find Root Index
            int rootIndex = -1;
            for(int i = sIn; i <= eIn; i++){
                if(rootData == in[i]){
                    rootIndex = i;
                    break;
                }
            }

            int sInLeft = sIn;
            int eInLeft = rootIndex - 1;
            int sInRight = rootData + 1;
            int eInRight = eIn;


            int sPostLeft = sPost;
            int ePostLeft = sPost + (rootIndex - sIn - 1);
            int sPostRight = ePostLeft + 1;
            int ePostRight = ePost - 1;


            BinaryTreeNode<Integer>  leftSubTree = helper1(post , in, sPostLeft, ePostLeft, sInLeft, eInLeft);
            BinaryTreeNode<Integer>  rightSubTree = helper1(post , in, sPostRight, ePostRight, sInRight, eInRight) ;
            root.left = leftSubTree;
            root.right = rightSubTree;
            return root;
        }


        public static BinaryTreeNode<Integer>  constructTreeFromPostIn(int []post, int[]in){
            return helper1(post, in, 0, post.length - 1, 0, in.length - 1);
        }

    // Create and Insert Duplicates
    public static void createAndInsertDuplicate(BinaryTreeNode<Integer> root){
        if(root == null){
            return ;
        }
        // Create a new Node
        BinaryTreeNode<Integer> newNode = new BinaryTreeNode<>(root.val);
        // Store the rootLeft Node
        BinaryTreeNode<Integer> rootLeft = root.left;

        root.left = newNode;
        newNode.left = rootLeft;
        createAndInsertDuplicate(rootLeft);
        createAndInsertDuplicate(root.right);
    }

    public static void main(String []args){
        BinaryTreeNode<Integer> root, n1, n2, n3, n4, n5, n6, n7, n8;
        root = createNode(8);
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

        levelOrderTraversal(root);

        System.out.print("Diameter of the Tree is: " + diameterOfTree(root));
        System.out.println();
        System.out.print("Diameter of the Tree is: " + diameterOfBinaryTree(root));
        System.out.println();

        int res = largest(root);
        int count = numNodes(root);
        int x = 5;
        int gCount = nodesGreaterThanX(root, x);
        System.out.println("Largest data of the Tree is: " + res);
        System.out.println("Number of Nodes in the Tree is: " + count);
        System.out.println("Number of Nodes Greater than " + x + " in the Tree is: " + gCount);

        BalanceTreeReturn ans = isBalanced(root);
        System.out.println("Is Balanced: "  + ans.balanced + " Height is: " + ans.height);

        int height = height(root);
        System.out.println("Height of the Binary Tree is: " + height);

        preOrder(root);

        mirror(root);
        System.out.println();
        preOrder(root);

        int numOfLeafNodes = numOfLeafNodes(root);
        System.out.println("Number of Leaf Nodes of the Binary Tree are: " + numOfLeafNodes);

        printNodesAtDepthK(root, 2);
        replaceNodesWithDepth(root, 0);
        nodeWithoutSibling(root);
        root = removeLeaf(root);
        preOrder(root);

        mirror(root);
        preOrder(root);
        System.out.println("Is Balanced Tree: " + isBalancedTree(root));
        BalanceTreeReturn ans1 = isBalanced(root);
        System.out.println("Is Balanced: "  + ans1.balanced + " Height is: " + ans1.height);


        createAndInsertDuplicate(root);
        levelOrderTraversal(root);
    }
}
