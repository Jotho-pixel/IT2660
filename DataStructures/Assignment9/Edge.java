

public class Edge {
    
    private int connect;
    private int weight; 
    
    public Edge()
    {
        connect = 0;
        weight = 0;
    }
    
    public int getConnect() {
        return connect;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int w)
    {
        this.weight = w;
    }
    public void setConnect()
    {
        this.connect= 1;
    }
}
