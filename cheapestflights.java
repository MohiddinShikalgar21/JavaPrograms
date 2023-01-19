package Test;
import java.util.*;

public class cheapestflights {
	public static void main(String[] args) {
		int n = 4;
		int[][] flights = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
		int src = 0, dst = 3, k = 1;
		System.out.println(findCheap(n,flights,src,dst,k));
	}
	
	static int findCheap(int n, int[][] flights, int src, int dst, int k) 
    {
        List<List<Pairs>> adj=new ArrayList<>();

        for(int i=0;i<n;i++)  adj.add(new ArrayList<Pairs>());

        for(int i=0;i<flights.length;i++)
            adj.get(flights[i][0]).add(new Pairs(flights[i][1],flights[i][2]));
        
        Queue<Tuple> queue=new LinkedList<>();
        int[] dist=new int[n];
        Tuple start=new Tuple(0,src,0);
        queue.add(start);
        Arrays.fill(dist,Integer.MAX_VALUE);

        while(!queue.isEmpty())
        {
            Tuple top=queue.peek();
            queue.remove();
            int stops=top.stops;
            int node=top.node;
            int distance=top.dist;
            for(Pairs curr : adj.get(node))
            {
                int destination=curr.stop;
                int amount=curr.distance;
                if(stops<=k && dist[destination]>distance+amount)
                {
                    dist[destination]=distance+amount;
                    queue.add(new Tuple(stops+1,destination,distance+amount));
                }
            }
        }
        int ans=dist[dst];
        return (ans==Integer.MAX_VALUE) ? -1 : ans;
    }
}
class Tuple
{
    int stops;
    int node;
    int dist;
    public Tuple(int s,int node,int dis)
    {
        stops=s;
        this.node=node;
        dist=dis;
    }
}
class Pairs
{
    int stop;
    int distance;
    public Pairs(int s,int d)
    {
        stop=s;
        distance=d;
    }
}