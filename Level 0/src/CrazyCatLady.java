import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
String cat=JOptionPane.showInputDialog("How many cats do you have?");
		// 2. Convert their answer into an int
 int cats=Integer.parseInt(cat);
		
if(cats>3){
	JOptionPane.showInputDialog("You are a crazy cat lady");
		
}
else if(cats<=3&&cats>0){
	playVideo("https://www.youtube.com/watch?v=5dsGWM5XGdg&t=5s");
	
	
	
}
else if(cats==0){
	playVideo("https://www.youtube.com/watch?v=vr1D3oswBgE");
	
	
	
	
	
	
}
}
// 3. If they have more than 3 cats, tell them they're a crazy cat lady	
	// 4. If they have 3 or less, call the method below to show them a cat video
	// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human
		
	

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

