/*
 * Week6_My_First_Applet
 *
 */

import java.awt.Graphics;
import javax.swing.JOptionPane;
import javax.swing.JApplet;

public class Week6_My_First_Applet extends JApplet
{
	public void init()
	{
		showStatus("We are in init() method");
		JOptionPane.showMessageDialog(null, "Check the status bar, we are in init() method");
	}  // end of init() method


	public void start()
	{
		showStatus("We are in start() method");
		JOptionPane.showMessageDialog(null, "Check the status bar, we are in start() method");
	}  // end of start() method


	public void paint(Graphics g)
	{
		super.paint(g);
		showStatus("We are in paint method");
		JOptionPane.showMessageDialog(null, "Check the status bar, We are in paint() method");
	}  // end of paint() method


	public void stop()
	{
		showStatus("We are in stop() method");
		JOptionPane.showMessageDialog(null, "Check the status bar, We are in stop() method");
	}  // end of stop() method


	public void destroy()
	{
		showStatus("We are in destroy() method");
		JOptionPane.showMessageDialog(null, "Check the status bar, we are in destroy() method");
	}  // end of destroy() method

}  // end of JApplet class
