import javax.swing.JOptionPane;

public class LinkedList {
    private Node h;
    public LinkedList()
    {
        h = new Node();
        h.l = null;
        h.next = null;
    }

    public void insert()
    {
        Node n = new Node();
        StudentListings a = new StudentListings();
        a.input();
        StudentListings newlisting = a.deepCopy();
        a = null;
        if(n == null)
            {}
        else
        {
            n.next = h.next;
            h.next = n;
            n.l = newlisting.deepCopy();
            
        }
    }

    public StudentListings fetch(int targetKey)
    {
        Node p = h.next;
        while(p != null && p.l.getID() != targetKey)
        {
            p = p.next;
        }
        if (p != null)
        {return p.l.deepCopy();}
        else
            return null;
    }

    public boolean delete(StudentListings studentListings)
    {
        Node q = h;
        Node p = h.next;
        while(p !=null && p.l.getID() != studentListings.getID())
        {
            q = p;
            p = p.next;
        }
        if (p !=null) 
        {
            q.next = p.next;
            return true;    
        }
        else 
        return false;
    }

    public boolean update(StudentListings studentListings)
    {
        if(delete(studentListings) == false)
        return false;
        else if(insert(newListing) == false)
        return false;
        return true;
    }

    public void showAll()
    {
        Node p = h.next;
        while(p != null)
        {
            JOptionPane.showMessageDialog(null, p.l.toString());
            p = p.next;
        }
    }

    public class Node
    {
        private StudentListings l;
        private Node next;
        public Node()
        {

        }
    }
}
