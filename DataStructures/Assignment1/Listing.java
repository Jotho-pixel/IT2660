import javax.swing.JOptionPane;


public class Listing{
    private String name;
    private int age;

    public Listing()
    {
        name = "";
        age = 0;
    }

    public Listing(string n, int a)
    {
        name = n;
        age = a;
    }

    public String toString()
    {
        return ("this persons name is: "+ name + " this perosons age is: "+ age);
    }

    public void input()
    {
        var newName = JOptionPane.showInputDialog("Please input a Name:");
        setName(newName);
        var newAge = JOptionPane.showInputDialog("Please input an Age:");
        setAge(newAge);
        
    }

    public void setName(String newName)
    {
        this.name = newName;
    }

    public void setAge(String newAge)
    {
        this.age = Integer.parseInt(newAge);
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }
}