import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {

		/*******************************************************************************
		 * Copyright (c) The League of Amazing Programmers 2013-2017 Level 0 Are
		 * you Happy? Duration=.75 Platform=Eclipse Type=Teacher instructions
		 * Objectives=nested if/else
		 * 
		 * 
		 ******************************************************************************/
		String y = "yes";
		String n = "no";
		/*
		 * http://www.typcut.com/wp-content/uploads/2009/08/
		 * Areyouhappy_a2_web_1024.jpg Laminates in classroom Create code
		 * to mimic the handout
		 */
		String answer = JOptionPane.showInputDialog("Are you happy?");
		if (answer.equalsIgnoreCase(y)) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
		} else if (answer.equalsIgnoreCase(n)) {
			answer = JOptionPane.showInputDialog("Do you want to be happy?");
			if (answer.equalsIgnoreCase(n)) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
			} else if (answer.equalsIgnoreCase(y)) {
				JOptionPane.showMessageDialog(null, "Change something.");
			}
		}
	}
}
