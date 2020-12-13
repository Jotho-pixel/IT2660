public class stack {
    private Listing[] data;
    private int top;
    private int size;

    public stack(int n){
        top = -1;
        size = n;
        data = new Listing[n];
    }

    public void push(Listing newNode)
    {
        if (top == size - 1)
        {
            Listing[] temp = new Listing[size];
            temp = data;
            size = size * 2;
            Listing[] larger = new Listing[size];
            data =larger;

            for(int i = top; i >=0 ; i--)
            {
                data[i] = temp[i];
            }
            System.out.println("Stack Expanded");
            temp = null;
            larger = null;
            top = top + 1;
            data[top] = newNode.deepCopy();
        }
        else
        {
            top = top + 1;
            data[top] = newNode.deepCopy();
            
        }
    }

    public Listing pop()
    {
        int topLocation;
        
        if(top == -1)
        {
            System.out.println("Stack is Empty");
            return null;
        }
            else
        {
            topLocation = top;
            top = top -1;
            return data[topLocation];
        }
    }  
    
    public Listing peek()
    {
        int topLocation;
        
        if(top == -1)
        {
            System.out.println("Stack is Empty");
            return null;
        }
            else
        {
            System.out.println("Result from Peek:");
            topLocation = top;
            return data[topLocation];
        }
    }


    public void showAll()
    {
        for (int i = top; i >= 0; i--)
        {
            System.out.println(data[i].toString());
        }
    }

    public void empty()
    {
        for (int i = top; i >= 0; i--)
        {
            pop();
        }
        System.out.println("Stack Cleared");
    }
}
