/*
 *  HelloWorld in GUI - Graphical User Interface
 *  format of the week1
 */


import javax.swing.JOptionPane;  
/*
 * Package javax.swing contains JOptionPane
 * JOptionPane is a class that contains
 * showInputDialog() and showMessageDialog() methods or functions
 * showInputDialog() - display a dialog box, requesting for an input while
 * showMessageDialog() - displays a dialog box, showing a given output, 
 * just like print function would do in python program but via 
 * a GUI dialog box window.
 */
public class Week2    // using Week2 as the name of the main class means the name of this java file is Week2.java
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
