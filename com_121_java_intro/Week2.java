/*
 *  HelloWorld in GUI - Graphical User Interface
 *  format of the week1
 */


import javax.swing.JOptionPane;  // this class contains showInputDialog() and showMessageDialog() methods or functions
public class Week2
{
	public static void main(String[] args)
	{
		String message_to_display = "Hello World !!!";
		String username = "";

		JOptionPane.showMessageDialog(null, message_to_display);

		// gets input from user via dialog graphical window
		username = JOptionPane.showInputDialog(null, "Enter your name, please: ");

		// Say hello to the user
		JOptionPane.showMessageDialog(null, "Hello " + username);
	}  // end of main method
}  // end of Week2 class
