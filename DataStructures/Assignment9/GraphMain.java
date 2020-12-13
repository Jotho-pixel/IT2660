public class GraphMain {
    public static void main(String[] args) {
        Graph g = new Graph(1000);
        
        for (int i = 0; i < 1000; i++)
        {
            Vertex v = new Vertex();
            int rnd = (int)(Math.random()* (600-1+1)+1);
            v.setValue(rnd);
            g.insertVertex(i, v);
            v = null;
        }
        
        for(int i = 0; i < 1000; i++)
        {
            int rnd = (int)(Math.random()* (5-1+1)+1);
            for(int j = 0; j < rnd; j++)
            {
                int weight = (int)(Math.random()* (20-1+1)+1);
                int to = (int)(Math.random()* (999-0+1));
                g.insertEdge(i, to, weight);
            }
        }

        g.DFT(1, 95);
        g.BT(4, 95);
    }
    
}
