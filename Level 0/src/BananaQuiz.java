// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
	String answer=	JOptionPane.showInputDialog("Do you like bananas (All lower case)?");
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		 if (answer.equals("no")) {
			 JOptionPane.showMessageDialog(null, "You are crazy");
			
		}else if (answer.equals("yes")){
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
String hobby=JOptionPane.showInputDialog(null, "What is your favorite hobby?");
		JOptionPane.showMessageDialog(null, hobby+ " is much better with bananas.");}
		//4. OPTIONAL: if they say something other than “yes” or “no”
		//	show a pop up that says “You are bananas!”
		else {
			JOptionPane.showMessageDialog(null, "You are bananas");
		}
		}
	}
	
