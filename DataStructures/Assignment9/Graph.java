import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class Graph{
    Vertex vertex[];
    Edge edge[][];
    int max , numberOFVertices;

    public Graph(int n)
    {
        vertex = new Vertex[n];
        edge = new Edge[n][n];
        max = n;
        numberOFVertices = 0;
    }

    

    public void insertVertex(int vertexNumber, Vertex NewVertex)
    {
        vertex[vertexNumber] = NewVertex.deepCopy();
    }

    public void insertEdge(int fromVertex, int toVertex, int weight)
    {
        Edge a = new Edge();
        a.setConnect();
        a.setWeight(weight);
        edge[fromVertex][toVertex] = a;
    }

    public void showVertex(int vertexNumber)
    {
        System.out.println(vertex[vertexNumber].getValue());
    }

    public void showEdges(int vertexNumber)
    {
        for( int column = 0; column < max; column++)
        {
            if(edge[vertexNumber][column] == 1)
                System.out.println(vertexNumber + ", " + column);
        }
    }

    public void DFT(int firstVertex, int search)
    {
        int v;
        int searched =0;
        boolean found =false;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < max-1; i++)
        {
            vertex[i].setPushed(false);
        }

        stack.push(firstVertex);
        vertex[firstVertex].setPushed(true);
        while(!stack.empty() && found != true)
        {
            v = stack.pop();
            //vertex[v].visit();
            for(int column = 0; column < max-1; column++)
            {
                if(edge[v][column] != null && edge[v][column].getConnect() == 1 && !vertex[column].getPushed())
                {
                    stack.push(column);
                    vertex[column].setPushed(true);
                    if (vertex[column].getValue() == search)
                    {
                        System.out.println("DFT found " + search + ", "+ searched + " nodes searched");
                        found = true;
                        break;
                    }
                    else
                    {
                        
                        searched += 1;
                    }

                }
                
            }
        }

        if(found != true)
        {
            System.out.println("not found");
        }
    }

    public void BT(int firstVertex, int search)
    {
        int v;
        int searched = 0;
        boolean found = false;
        Queue<Integer> que = new LinkedList<>();
            
        for(int i = 0; i < max-1; i++)
        {
            vertex[i].setPushed(false);
        }

        que.add(firstVertex);
        vertex[firstVertex].setPushed(true);
        while(!que.isEmpty() && found != true)
        { 
            v = que.poll();
            //vertex[v].visit();
            for(int column = 0; column < max-1; column++)
            {
                if(edge[v][column] != null && edge[v][column].getConnect() == 1 && !vertex[column].getPushed())
                {
                    que.add(column);
                    vertex[column].setPushed(true);
                    if (vertex[column].getValue() == search)
                    {
                        System.out.println("BT found " +search +", "+ searched + " nodes searched");
                        found = true;
                        break;
                    }
                    else
                    {
                        
                        searched += 1;
                    }
                }
            }
        }

        if(found != true)
        {
            System.out.println("not found");
        }
    }

    
}