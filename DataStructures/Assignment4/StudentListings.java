import javax.swing.JOptionPane;


public class StudentListings
{
    private String name;
    private String idNum;
    private String gpa;
    
    
    public StudentListings()
    {
        name= "";
        idNum = "";
        gpa = "";
    }

    public StudentListings(String n, String id, String gpa)
    {
        name = n;
        idNum = id;
        this.gpa = gpa;
    }

    public String toString()
    {
        return ("Name is "+ name +
                "\nID is " + idNum +
                "\nGPA is " + gpa + "\n");
    }

    public StudentListings deepCopy()
    {
        StudentListings clone = new StudentListings();
        clone.name = name;
        clone.idNum = idNum;
        clone.gpa = gpa;
        return clone;
    }

    public int compareTo(String targetKey)
    {
        return(name.compareTo(targetKey));
    }

    public int getID()
    {
        return Integer.parseInt(this.idNum);
    }

    public String getName()
    {
        return name;
    }

    public void input()
    {
        name = JOptionPane.showInputDialog("Enter a name");
        idNum = JOptionPane.showInputDialog("Enter an id Number");
        gpa = JOptionPane.showInputDialog("Enter a gpa");
    }

}