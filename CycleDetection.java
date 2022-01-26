package com.company.GraphTheory;
import java.util.*;

class Graph {
    int v;
    List<List<Integer>> list = new ArrayList<>();

    public Graph(int v){
        this.v = v;
    }
    public void addEdge(int u, int v){
        List<Integer> set= new ArrayList<>();
        set.add(u);
        set.add(v);
        list.add(set);
    }

    // Find
    public int findSet(int x, int []parent){
        // Base Case
        if(parent[x] == -1){
            return x;
        }
        return findSet(parent[x], parent);
    }

    // Union
    public void union_set(int x, int y, int [] parent){
        // Find Out parent of x and y
        int s1 = findSet(x, parent);
        int s2 = findSet(y, parent);
        if(s1 != s2){
            parent[s2] = s1;
        }
    }

    boolean containsCycle(){
        int [] parent = new int[v+1];
        Arrays.fill(parent, -1);
        // iterate over the Edge List
        for(List<Integer> l : list){
            int i = l.get(0);
            int j = l.get(1);
            int s1 = findSet(i, parent);
            int s2 = findSet(j, parent);
            if(s1 != s2){
                union_set(s1, s2, parent);
            } else{
                System.out.println("Same Parent " + s1  + " for " + l);
                return true;
            }
        }
        return false;
    }
}

public class CycleDetection {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Vertices: ");
        int n = sc.nextInt();
        Graph graph = new Graph(n);
        for(int i=0; i<n; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.addEdge(u, v);
        }
        boolean ans = graph.containsCycle();
        System.out.print(ans);
    }
}
