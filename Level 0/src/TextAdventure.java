import javax.swing.JOptionPane;

public class TextAdventure {
	public static void main(String[] args) {

		String answer = JOptionPane.showInputDialog(
				"You are in a forest clearing with two paths, on leading north and one leading south. Which way do you want to go?");

		if (answer.equalsIgnoreCase("south")) {
			answer = JOptionPane
					.showInputDialog("You are now in a clearing. Ahead of you there is a shack. Do you want to go in?");

			if (answer.equalsIgnoreCase("yes")) {
				JOptionPane.showInputDialog(
						"You tried the handle, but it is locked. Instead of giving up, you kick down the door. You are now inside the kitchen."
								+ "There is a table with a lemon on it. Do you cut it?");
			}
			if (answer.equalsIgnoreCase("no")) {
				JOptionPane.showInputDialog(
						"You tried the handle, but it is locked. Instead of giving up, you kick down the door. You are now inside the kitchen."
								+ "There is a table with a lemon on it. Do you cut it?");
			}
			if (answer.equalsIgnoreCase("yes")) {
				JOptionPane.showInputDialog(
						"You cut your self using the knife and lemon juice leaks all over you cut. You scream and you somehow die.");
			}

		}

		if (answer.equalsIgnoreCase("north")) {
			JOptionPane.showMessageDialog(null,
					"You are now deep in the woods. There is a cave ahead of you. Unfortunetly, you have been making too much noise and a huge black bear is woken up from sleeping. It eats you and you die.");

		}

	}
}