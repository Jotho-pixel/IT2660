import java.util.jar.Attributes.Name;

import javax.swing.JOptionPane;
public class StudentListingsMain {
    public static void main(String[] args) {
        
        
        int inSize = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Array size:"));
        BinaryTree sa = new BinaryTree();

        for (int i = 0; i < inSize ; i++)
        {
            StudentListings a = new StudentListings();
            a.input();
            sa.insert(a);
            a = null;
        }


        int cmnd = 0;
        while(cmnd != 6)
        {
        cmnd = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter: \n 1 to insert a new student's information, \n" +
                                    "2 to fetch and output a student's information, \n"+
                                    "3 to delete a student's infomation, \n" +
                                    "4 to update a student's information, \n" +
                                    "5 to output all the student information in sorted order, and \n" +
                                    "6 to exit the program"));
            if( cmnd == 1)
                {   StudentListings a = new StudentListings();
                    a.input();
                    sa.insert(a);
                    a = null;
                }
            if(cmnd == 2)
            {
                String name = JOptionPane.showInputDialog(null, "Input student Name:");
                JOptionPane.showMessageDialog(null, sa.fetch(name));
            }
            if(cmnd == 3)
            {
                String name = JOptionPane.showInputDialog(null, "Input student Name:");
                sa.delete(name);
            }
            if (cmnd == 4)
            {
                String name = JOptionPane.showInputDialog(null, "Input student Name:");
                StudentListings a = new StudentListings();
                a.input();
                sa.update(name, a);
                a = null;
            }
            if(cmnd == 5);
        //{sa.showAll();}
            
        }
        

    }
    
}
