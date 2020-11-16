package week6;

import java.awt.Graphics;
import javax.swing.JOptionPane;
import java.applet.Applet;

//@SuppressWarnings("deprecation")
public class my_first_applet extends Applet {
	public void init()
	{
		showStatus("We are in init() method");
		JOptionPane.showMessageDialog(null, "Check the status bar, we are in init() method");
		
		
		
	}  // end of init() method


	public void start()
	{
		showStatus("We are in start() method");
		JOptionPane.showMessageDialog(null, "Check the status bar, we are in start() method");
		
		String input, output;
		double first, second, sum;
		
		input = JOptionPane.showInputDialog(null, "Enter the first number", "Sum of two numbers", JOptionPane.QUESTION_MESSAGE);
		first = Double.parseDouble(input);
		input = JOptionPane.showInputDialog(null, "Enter the second number", "Sum of two numbers", JOptionPane.QUESTION_MESSAGE);
		second = Double.parseDouble(input);
		
		sum = first + second;
		
		output = "The total of " + first + " and " + second + " is " + sum ;
	}  // end of start() method


	public void paint(Graphics g)
	{
		g.drawRect(50, 50, 150, 40);
		g.drawString(sum, x, y);
		JOptionPane.showMessageDialog(null, sum);
		//super.paint(g);
		//showStatus("We are in paint method");
		//JOptionPane.showMessageDialog(null, "Check the status bar, We are in paint() method");
		
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

}
