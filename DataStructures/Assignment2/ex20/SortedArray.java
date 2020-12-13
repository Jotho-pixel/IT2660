//import javax.lang.model.util.ElementScanner14;
import javax.swing.JOptionPane;
//import javax.xml.crypto.Data;

public class SortedArray {

    private int next;
    private int size;
    private StudentListings[] studentlist;
    
    public SortedArray(int s)
    {
        next = 0;
        studentlist = new StudentListings[s];
        size = s;
    }


    public void insert()
    {
        StudentListings a = new StudentListings();
        a.input();
        StudentListings student = a.deepCopy();
        a = null;
        int low = 0;
        int high = next - 1;
        int i = (low + high)/2;

        if (next == 0)
        {
            studentlist[0] = student;
            next = next + 1;
        }
        else if (next == 1)
        {
            if (student.getID() < studentlist[0].getID())
            {
                studentlist[1] = studentlist[0];
                studentlist[0] = student;
                next = next + 1;
            }
            else
            {
                studentlist[1] = student;
                next = next + 1;
            }
        }
        else
        {
            if(next == size)
                {
                    StudentListings[] temp = new StudentListings[size];
                    temp = studentlist;
                    size = size * 2;
                    StudentListings[] larger = new StudentListings[size];
                    studentlist =larger;

                    for(int j = 0; j < next ; j++)
                    {
                        studentlist[j] = temp[j];
                    }
                    //System.out.println("Stack Expanded");
                    temp = null;
                    larger = null;
                }
            
            while (i >= 1&& student.getID() <= studentlist[i].getID() && student.getID() >= studentlist[i -1].getID()) 
            {
                if(student.getID() < studentlist[i].getID())
                { high = i - 1;}
                else
                { low = i + 1;}
                i = (high + low)/2;
            }

            for ( int j = next; j >= i && j >= 1; j--)
            {   
                
                studentlist[j] = studentlist[j -1];
            }
            next = next + 1;
            studentlist[i] = student.deepCopy();
        }
    }

    public void delete(StudentListings student)
    {
        int low = 0;
        int high = next - 1;
        int i = (low + high)/2;

        while (student.getID() != studentlist[i].getID() && high != low)
        {
            if (student.getID()< studentlist[i].getID())
            { high = i -1;}
            else
            { low = i + 1;}
            i = (high + low)/2;
        }

        for (int j = i; j <next- 1; j++){
        
            studentlist[j] = studentlist[j +1];
        }
        next = next - 1;
        studentlist[next] = null;
        

    }

    public StudentListings fetch(int id)
    {
        int low = 0;
        int high = next - 1;
        int i = (low + high)/2;

        while (id != studentlist[i].getID() && high != low)
        {
            if (id< studentlist[i].getID())
            { high = i -1;}
            else
            { low = i + 1;}
            i = (high + low)/2;
        }

        if (id == studentlist[i].getID())
        {
            return studentlist[i].deepCopy();
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "ID doesnt exist in array");
            return null;
        }
    }

    public void update(StudentListings student)
    {
        int low = 0;
        int high = next - 1;
        int i = (low + high)/2;

        while (student.getID() != studentlist[i].getID() && high != low)
        {
            if (student.getID()< studentlist[i].getID())
            { high = i -1;}
            else
            { low = i + 1;}
            i = (high + low)/2;
        }

        if (student.getID() == studentlist[i].getID())
        {
            studentlist[i].input();
        }
        else 
        {
            System.out.println("Id Doesnt exist in array");
        }
    }

    public void showAll()
    {
        for (int i =0; i < next; i++)
        {
            JOptionPane.showMessageDialog(null, studentlist[i].toString());
        }
    }



    
}
