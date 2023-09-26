import javax.swing.*;
import java.util.*;
public class Graph1 {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
//        graph[0].add(new Edge(0,2));
//
//        graph[1].add(new Edge(1,0));
//
//        graph[2].add(new Edge(2,3));
//
//        graph[3].add(new Edge(3,0));

//        Directed Cycle
//        graph[2].add(new Edge(2,3));
//        graph[3].add(new Edge(3,1));
//        graph[4].add(new Edge(4,0));
//        graph[4].add(new Edge(4,1));
//        graph[5].add(new Edge(5,0));
//        graph[5].add(new Edge(5,1));

//        Undirected Cycle
//        graph[0].add(new Edge(0,1));
//        graph[0].add(new Edge(0,4));
//        graph[1].add(new Edge(1,0));
//        graph[1].add(new Edge(1,2));
//        graph[1].add(new Edge(1,4));
//        graph[2].add(new Edge(2,3));
//        graph[3].add(new Edge(3,2));
//        graph[4].add(new Edge(4,0));
//        graph[4].add(new Edge(4,1));
//        graph[4].add(new Edge(4,5));
//        graph[5].add(new Edge(5,4));

//        Dijkstras Algorithm
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,7));
        graph[2].add(new Edge(2,4,3));
        graph[3].add(new Edge(3,5,1));
        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));
    }

    public static boolean isCycleDirected(ArrayList<Edge> graph[], int curr, boolean vis[], boolean rec[]){
        vis[curr] = true;
        rec[curr] = true;

        for (int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(rec[e.dest]){
                return true;
            } else if (!vis[e.dest]){
                if (isCycleDirected(graph, e.dest, vis, rec)){
                    return true;
                }
            }
        }
        rec[curr] = false;
        return false;
    }

    public static boolean isCycleUndirected(ArrayList<Edge> graph[], int curr, boolean vis[], int par){
        vis[curr] = true;

        for (int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if (vis[e.dest] && e.dest!=par){
                return true;
            } else if (!vis[e.dest]){
                if (isCycleUndirected(graph, e.dest, vis, curr)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void topSortUtil(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> stack){
        vis[curr] = true;

        for (int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if (!vis[e.dest]){
                topSortUtil(graph, e.dest, vis, stack);
            }
        }
        stack.push(curr);
    }

    public static void topSort(ArrayList<Edge> graph[], int v){
        boolean vis[] = new boolean[v];
        Stack<Integer> stack = new Stack<>();

        for (int i=0; i<v; i++){
            if (!vis[i]){
                topSortUtil(graph,i,vis,stack);
            }
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }

//    Dijkstra Algorithm
    public static class Pair implements Comparable<Pair>{
        int node;
        int dist;

        public Pair(int n, int d){
            this.node = n;
            this.dist = d;
        }
        public int compareTo(Pair p2){
            return this.dist - p2.dist;
        }
    }
    //O(E + ElogV)
    public static void dijkstra(ArrayList<Edge> graph[], int src, int V){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int dist[] = new int[V];
        for (int i=0; i<V; i++){
            if (i!= src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        boolean vis[] = new boolean[V];
        pq.add(new Pair(0,0));

        while (!pq.isEmpty()){
            Pair curr = pq.remove();
            if (!vis[curr.node]){
                vis[curr.node] = true;

                for (int i=0; i<graph[curr.node].size(); i++){
                    Edge e = graph[curr.node].get(i);
                    int u = e.src;
                    int v = e.dest;
                    if (dist[u] + e.wt < dist[v]){
                        dist[v] = dist[u] + e.wt;
                        pq.add(new Pair(v,dist[v]));
                    }
                }
            }
        }
        for (int i=0; i<V; i++){
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    public static void main(String arg[]){
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
//
//        boolean vis[] = new boolean[v];
//        boolean rec[] = new boolean[v];
//        for (int i=0; i<v; i++){
//            if (!vis[i]){
//                boolean isCycle = isCycleDirected(graph,0,vis,rec);
//                if (isCycle){
//                    System.out.println(isCycle);
//                    break;
//                }
//            }
//        }
        //boolean vis[] = new boolean[v];
        System.out.println(isCycleUndirected(graph,0, new boolean[v], -1));

        topSort(graph,v);


        dijkstra(graph,0,v);
    }
}
