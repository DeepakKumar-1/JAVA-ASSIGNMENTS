package com.company.GraphTheory;
import java.util.*;

public class KosarajuAlgorithm {
    private static final Stack<Integer> stack = new Stack<>();

    private static void dft(int [][]adjMatrix,int currentVertex, boolean []visited){
        visited[currentVertex] = true;
        for(int i=0; i < adjMatrix.length; i++){
            if(adjMatrix[currentVertex][i]==1 && !visited[i]){
                dft(adjMatrix, i, visited);
            }
        }
        stack.push(currentVertex);
//        System.out.println(stack);
    }

    private static int [][] transpose(int [][]adjMatrix){
        int [][]dist = new int[adjMatrix.length][adjMatrix.length];
        int n = adjMatrix.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                dist[i][j] = adjMatrix[j][i] ;
            }
        }
        return dist;
    }

    private static void kosaraju_Algorithm(int[][] adjMatrix) {
        boolean [] visited = new boolean[adjMatrix.length];
        for (int v=0; v< adjMatrix.length; v++) {
            if(!visited[v]) {
                dft(adjMatrix, v, visited);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(!stack.isEmpty()){
            int element = stack.pop();
            list.add(element);
        }
        System.out.println(list);
        // Transpose the adjMatrix
        int [][] dist = transpose(adjMatrix);
        for(int [] row: dist){
            System.out.println(Arrays.toString(row));
        }
        // Apply DFS again and Print the Connected Components
        boolean [] visit = new boolean[dist.length];
        System.out.println("Connected Components are: ");
        for (int v : list) {
            if (!visit[v]) {
                dfTraversal(dist, v, visit);
                System.out.println();
            }
        }
    }

    private static void dfTraversal(int [][]adjMatrix, int currentVertex, boolean []visited){
        visited[currentVertex] = true;
        System.out.print(currentVertex + " ");
        for(int i=0; i < adjMatrix.length; i++){
            if(adjMatrix[currentVertex][i]==1 && !visited[i]){
                dfTraversal(adjMatrix, i, visited);
            }
        }
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Vertices: ");
        int n = sc.nextInt();
        System.out.print("Enter Number of Edges: ");
        int e = sc.nextInt();
        int [][]adjMatrix = new int[n][n];
        for(int i=0; i<e; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjMatrix[v1][v2] = 1;
        }
        kosaraju_Algorithm(adjMatrix);
    }
}


// OUTPUT
/*

        Enter Number of Vertices: 6
        Enter Number of Edges: 7
            0 1
            1 2
            2 1
            1 3
            3 4
            4 5
            5 4
            [0, 1, 3, 4, 5, 2]
            [0, 0, 0, 0, 0, 0]
            [1, 0, 1, 0, 0, 0]
            [0, 1, 0, 0, 0, 0]
            [0, 1, 0, 0, 0, 0]
            [0, 0, 0, 1, 0, 1]
            [0, 0, 0, 0, 1, 0]
            Connected Components are:
            0
            1 2
            3
            4 5



            Enter Number of Vertices: 5
            Enter Number of Edges: 5
                0 1
                1 2
                2 0
                1 3
                4 3
                [4, 0, 1, 3, 2]
                [0, 0, 1, 0, 0]
                [1, 0, 0, 0, 0]
                [0, 1, 0, 0, 0]
                [0, 1, 0, 0, 1]
                [0, 0, 0, 0, 0]
                Connected Components are:
                4
                0 2 1
                3

 */
