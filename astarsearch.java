package Test;
import java.util.*;
public class astarsearch{
    // A Node class for A* Pathfinding
    static class Node{
        
        Node parent;
        int position[];
        int f,g,h;
        // Constructor for Node class.
        Node(Node parent, int position[]){
            this.parent=parent;
            this.position=position;
            this.f=this.g=this.h=0;
        }
        // Comparator for Node class
        boolean equals(Node temp){
            return this.position[0]==temp.position[0]&&
            this.position[1]==temp.position[1];
        }
    }
    // Boolean function to check if 
    // a move is valid or not.
    private static boolean notValid(int nodePosition[], 
                                    int n, int m){
        return nodePosition[0]>n-1||nodePosition[0]<0 ||
        nodePosition[1]>m-1||nodePosition[1]<0;
    }
    // A* algorithm function
    private static List<int[]> A_star(int board[][], 
                                int src[], int dest[]){
        /* This function returns a list of
        tuples representing the path from the given 
        src node to the given dest node in the given board */
        
        // Creating the src and dest node
        // with the parent as null.
        Node srcNode=new Node(null, src);
        Node destNode=new Node(null, dest);
        
        // Initializing both openList and 
        // closedList as empty list.
        List<Node> openList=new ArrayList<>();
        List<Node> closedList=new ArrayList<>();
        
        // Append srcNode in openList. 
        openList.add(srcNode);
        
        // Iterate until we reach the 
        // dest Node. 
        while(openList.size()>0){
            // Get the current node
            Node currentNode=openList.get(0);
            int currentIndex=0;
            
            // Iterate over the openList to find 
            // node with least 'f'. 
            for(int i=0;i<openList.size();i++)
                if(openList.get(i).f<currentNode.f){
                    currentNode=openList.get(i);
                    currentIndex=i;
                }
                
            // Pop the found node off openList,
            // and add it to the closedList.
            openList.remove(currentIndex);
            closedList.add(currentNode);
            
            // If reached the dest.
            if(currentNode.equals(destNode)){
                // Initializng the 'path' list. 
                List<int[]> path=new ArrayList<>();
                Node current=currentNode;
                
                // Adding current position in path 
                // and the moving to its parent until 
                // we reach None (parent of src). 
                while(current!=null){
                    path.add(current.position);
                    current=current.parent;
                }
                // Returning the reversed path (to make
                // it src -> dest, instead of dest -> src).
                Collections.reverse(path);
                return path;
            }
            // Generate children
            List<Node> children=new ArrayList<>();
            int dirs[][]=new int[][]{
                {0,-1}, {0,1}, {-1,0}, {1,0},
                {-1,-1}, {-1,1}, {1,-1}, {1,1}
            };
            // Iterate over neighouring cells.
            for(int newPosition[]:dirs){
                // Find the position of new Node.
                int nodePosition[]=new int[]{
                  currentNode.position[0]+newPosition[0],
                  currentNode.position[1]+newPosition[1]
                };
                
                // If the new position is not valid (lies outside board)
                // then do not proceed ahead with this node. Also if the  
                // new position contains obstacle, we can't proceed.
                if(notValid(nodePosition, board.length,board[0].length)||
                        board[nodePosition[0]][nodePosition[1]]!=0){
                    continue;
                }
                // Append the node in children list.
                children.add(new Node(currentNode, nodePosition));
            }
            // Iterate over children list.
            for(Node child: children){
                // If the child is in closedList
                for(Node closedChild:closedList)
                    if(closedChild.equals(child))
                        continue;
                    
                // Assign the values of f, g, and h.
                child.g=currentNode.g+1;
                child.h=(int)((Math.pow(child.position[0]-
                    destNode.position[0],2) + (Math.pow(child.position[1]-
                        destNode.position[1],2))));
                child.f=child.g+child.h;
                
                // If the Child is present in OpenList. 
                for(Node openNode:openList){
                    if(child.equals(openNode) && child.g>openNode.g)
                        continue;
                }
                // Append the child at the last of open list
                openList.add(child);
            }
            
            if(openList.size()>board.length*board.length*
            board[0].length*board[1].length)
                break;
        }
        return new ArrayList<>();
    }
    public static void main(String args[]){
        int board[][]=new int[][]{
          {0, 0, 0, 1, 0, 0},
          {0, 0, 1, 0, 1, 0},
          {1, 0, 1, 0, 0, 0}
        };
        int src[]=new int[]{1,0};
        int dest[]=new int[]{2,5};
        
        List<int[]> pathSrcToDest=A_star(board,src,dest);
        for(int i=0;i<pathSrcToDest.size();i++){
            System.out.print("("+pathSrcToDest.get(i)[0]+
            ", "+pathSrcToDest.get(i)[1]+") ");
        }
    }
}
