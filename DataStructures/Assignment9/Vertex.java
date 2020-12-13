public class Vertex {
    private int value;
    private boolean pushed;

    public Vertex()
    {
        value = 0;
    }

    public void setValue(int v)
    {
        this.value = v;
    }

    public int getValue()
    {
        return value;
    }

    public Vertex deepCopy()
    {
        Vertex clone = this;
        return clone;
    }
    
    public boolean getPushed()
    {
        return pushed;
    }

    public void setPushed(boolean push)
    {
        pushed = push;
    }

    public void visit()
    {
        System.out.println(this.value);
    }
}
