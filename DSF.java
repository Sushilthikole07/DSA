import java.util.*;

class DSF
{
  LinkedList adj[];
  boolean visited[];
  DSF(int v)
  {
     adj = new LinkedList[v];
     for(int i=0;i<v;i++)
     {
        adj[i] = new LinkedList();
     }
     visited = new boolean[v];
  }

  void addEdge(int src, int dest)   
  {
      adj[src].add(dest);
  }  

  void DFS(int s)
  {
     visited[s] = true;
     System.out.print(s + " ");
     Iterator<Integer> itr = adj[s].listIterator();
     while(itr.hasNext())
     {
        int n = itr.next();
        if(!visited[n])
        {
           DFS(n);
        }
     }
  }

  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of vertex");
     int vertex = sc.nextInt();
     DSF m = new DSF(vertex);
     System.out.println("Enter the number of edges");
     int edges = sc.nextInt();
     System.out.println("Enter the src and dest");
     for(int i=0;i<edges;i++)
     {
        m.addEdge(sc.nextInt(), sc.nextInt());
     }
     System.out.println("Enter the starting vertex");
     m.DFS(sc.nextInt());
  }
}