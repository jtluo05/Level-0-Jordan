import java.applet.AudioClip;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.io.File;
import java.net.MalformedURLException;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

import org.teachingextensions.logo.ImageBackground;
import org.teachingextensions.logo.Paintable;
import org.teachingextensions.logo.Tortoise;

/**
 * Note: You will need the latest version of the TKP jar:
 * http://school.wintrisstech.org/jars/TeachingKidsProgramming.jar
 **/

public class TurtleTreasureHunt implements KeyEventDispatcher {

	int tortoiseSpeed = 5;

	private void goUp() {
		// 1. Make the tortoise move up the screen
		Tortoise.move(1);

	}

	private void goDown() {
		// 2. make the tortoise move down the screen
		Tortoise.turn(180);
		Tortoise.move(1);
		Tortoise.turn(180);
	}

	private void goLeft() {
		// 3. make the tortoise move left (3 lines of code)
		// Hint: the turn() method lags more than setAngle()
		Tortoise.turn(270);
		Tortoise.move(1);
		Tortoise.turn(90);

	}

	private void goRight() {
		// 4. make the tortoise move right
		Tortoise.turn(90);
		Tortoise.move(1);
		Tortoise.turn(-90);
	}

	private void spaceBarWasPressed() {
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();

		// 5. Print out the variables for tortoiseLocationX and
		// tortoiseLocationY
		System.out.println("X:" + tortoiseLocationX);
		System.out.println("Y:" + tortoiseLocationY);
		// 6. If tortoise is at same location as the little girl,
		// make a pop-up tell the Tortoise where to go next
		if (tortoiseLocationX == 510) {
			if (tortoiseLocationY == 300) {
				JOptionPane.showMessageDialog(null,
						".nottub tlA eht sserp dna egde s'retaw eht no llorcs eht dnif.(backward)");

			}
		}

		// 7. Give the user subsequent clues at different locations on the image
		// (pirate robot, swamp, etc.)

	}

	private void altwaspressed() {
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();

		if (tortoiseLocationX == 290) {
			if (tortoiseLocationY == 380) {

				JOptionPane.showMessageDialog(null, "Good Job! Now that you have found the scroll it will help you!"
						+ " The scroll says 'Go to each parrot's body in this picture and press the u button on each one of them. Only one of them is correct.' ");

			}
		}
	}

	private void uwaspressed() {
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();

		if (tortoiseLocationX == 410) {
			if (tortoiseLocationY == 110) {
				JOptionPane.showMessageDialog(null,
						"Good job! Now go back to the pirates skull and crossbones and press the tab button");
			}
		}
	}

	private void tabwaspressed() {
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();
		if (tortoiseLocationX == 400) {
			if (tortoiseLocationY == 240) {
				JOptionPane.showMessageDialog(null,
						"Amazing! You have finished the quest!");
				playTheSoundOfSuccess();
			}
		}
	}

	
	private static void playTheSoundOfSuccess() {
		AudioClip sound;
		try {
			sound = JApplet.newAudioClip(new File("file:///Users/League/Google%20Drive/league-sounds/homer-woohoo.wav").toURI().toURL());
			sound.play();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	
	
	
	private void go() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		/*
		 * If you want to use your own background, download the image you want,
		 * and change the following line to point to it like: new
		 * ImageBackground("file:/Users/joonspoon/Desktop/dinosaurLand.jpg");
		 */
		Paintable backgroundImage = new ImageBackground(
				"file:/Users/League/Google Drive/league-images/treasure_hunt.jpg");
		Tortoise.getBackgroundWindow().addPaintable(backgroundImage);
		Tortoise.penUp();
		Tortoise.setSpeed(10);
		JOptionPane.showMessageDialog(null,
				"Ask the little girl for help with your quest. Crawl all around the little girl's head untill you find the flower on her head. Once you do, press the space bar.");
	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			else if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			else if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			else if (e.getKeyCode() == KeyEvent.VK_DOWN)
				goDown();
			else if (e.getKeyCode() == KeyEvent.VK_SPACE)
				spaceBarWasPressed();
			else if (e.getKeyCode() == KeyEvent.VK_U)
				uwaspressed();
			else if (e.getKeyCode() == KeyEvent.VK_TAB)
				tabwaspressed();
			else if (e.getKeyCode() == KeyEvent.VK_ALT)
				altwaspressed();
		}
		return false;
	}

	public static void main(String[] args) throws MalformedURLException {
		new TurtleTreasureHunt().go();
	}

}
