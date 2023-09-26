import java.util.*;
public class Graphs {
    static class Edge{
        int src;
        int des;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.des = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,2));

        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,3,0));

        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2,4,10));

        graph[3].add(new Edge(3,1,-1));
        graph[3].add(new Edge(3,4,0));
        graph[3].add(new Edge(3,5,-1));

        graph[4].add(new Edge(4,2,-1));
        graph[4].add(new Edge(4,3,0));
        graph[4].add(new Edge(4,5,-1));

        graph[5].add(new Edge(5,3,-1));
        graph[5].add(new Edge(5,4,0));
        graph[5].add(new Edge(5,6,-1));

        graph[6].add(new Edge(6,5,-1));
    }

    //Breadth first Search(BFS)
    //O(V+E)
    public static void bfs(ArrayList<Edge> graph[], int v, boolean vis[], int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        while (!q.isEmpty()){
            int curr = q.remove();
            if(vis[curr]==false){
                System.out.print(curr + " ");
                vis[curr] = true;

                for (int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.des);
                }
            }
        }
    }

    //Depth First Search (DFS)
    //O(V+E)
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]){
        System.out.print(curr + " ");
        vis[curr]=true;

        for (int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if (vis[e.des]==false) {
                dfs(graph, e.des, vis);
            }
        }
    }

    //All path from Source to Destination
    //O(V^V)
    public static void printAllPath(ArrayList<Edge> graph[],int curr,boolean vis[],String path,int tar){
        if (curr==tar){
            System.out.println(path);
            return;
        }

        for (int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if (!vis[e.des]){
                vis[curr]=true;
                printAllPath(graph,e.des,vis,path+e.des,tar);
                vis[curr]=false;
            }
        }
    }

    public static void main(String arg[]){
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        for (int i=0; i<graph[5].size(); i++){
            Edge e = graph[5].get(i);
            System.out.println(e.src + " -> " + e.des + " Weight is: " + e.wt);
        }

        boolean vis[] = new boolean[v];
        for (int i=0; i<v; i++){
            if (vis[i]==false){
                bfs(graph,v,vis,i);
            }
        }
        System.out.println();

        for (int i=0; i<v; i++){
            if (vis[i]==false){
               dfs(graph,0,vis);
            }
        }
        System.out.println();

        int src =0, tar = 5;
        printAllPath(graph,src,new boolean[v],"0",tar);
    }
}
