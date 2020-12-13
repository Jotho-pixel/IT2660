import javax.swing.JOptionPane;
public class StudentListingsMain {
    public static void main(String[] args) {
        
        
        int inSize = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Array size:"));
        SortedArray sa = new SortedArray(inSize);

        for (int i = 0; i < inSize ; i++)
        {
            sa.insert();
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
                {sa.insert();}
            if(cmnd == 2)
            {
                int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Input student ID:"));
                JOptionPane.showMessageDialog(null, sa.fetch(id));
            }
            if(cmnd == 3)
            {
                int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Input student ID:"));
                sa.delete(sa.fetch(id));
            }
            if (cmnd == 4)
            {
                int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Input student ID:"));
                sa.update(sa.fetch(id));
            }
            if(cmnd == 5)
        {sa.showAll();}
            
        }
        

    }
    
}
