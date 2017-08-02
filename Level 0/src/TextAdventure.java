import javax.swing.JOptionPane;

public class TextAdventure {
	public static void main(String[] args) {

		String answer = JOptionPane.showInputDialog(
				"You are in a forest clearing with two paths, on leading north and one leading south. Which way do you want to go?");

		if (answer.equalsIgnoreCase("south")) {
			answer = JOptionPane
					.showInputDialog("You are now in a clearing. Ahead of you there is a shack. Do you want to go in?");

			if (answer.equalsIgnoreCase("no")) {
				answer = JOptionPane.showInputDialog(
						"You are now in a clearing. Ahead of you there is a shack. Do you want to go in?");
			}

			if (answer.equalsIgnoreCase("yes")) {
				answer = JOptionPane.showInputDialog(
						"You tried the handle, but it is locked. Instead of giving up, you kick down the door. You are now inside the kitchen."
								+ "There is a table with a lemon on it. Do you cut it?");
				if (answer.equalsIgnoreCase("yes")) {
					JOptionPane.showMessageDialog(null,
							"You cut your self using the knife and lemon juice leaks all over you cut. You scream and you somehow die.");
				}
				if (answer.equalsIgnoreCase("no")) {
					answer = JOptionPane.showInputDialog(
							"You now look around the room. There are two doorways one is lit and one is dark. Do you want to go into the lit passegeway?");
					if (answer.equalsIgnoreCase("yes")) {
						JOptionPane.showMessageDialog(null,
								"You are now in the living room. Unfortunetly, the guy on the couch sees you "
										+ "and takes you prisoner into his basement. You die of boredom.");
					}
					if (answer.equalsIgnoreCase("no")) {
						 JOptionPane.showMessageDialog(null,
								"You now see a teleporter and you turn it on, and you finally teleport back to your home"
										+ " and live happily ever after. Good Job!");

					}
				}
			}

			if (answer.equalsIgnoreCase("north")) {
				JOptionPane.showMessageDialog(null, "You are now deep in the woods. There is a cave ahead of you. "
						+ "Unfortunetly, you have been making too much noise and a huge black bear is woken up from sleeping. It eats you and you die.");

			}

		}
	}
}