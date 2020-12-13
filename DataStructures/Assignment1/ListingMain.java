import java.util.Arrays;

import javax.swing.JOptionPane;

public class ListingMain {
    public static void main(String[] args)
    {
        Listing a[] = new Listing[3];
	
	for(int i=0; i<a.length; i++)
	{
		a[i]= new Listing();
        a[i].input();
        
	};
	 

	for(int i=2; i>=0 ;i--)
	{JOptionPane.showMessageDialog(null, a[i].toString()); };
	
	
    };
	
}