import javax.swing.JOptionPane;

public class SimpleNumberSorter {
	public static void main(String[] args) {
		int BN = 0;
		int SN = 0;
		String answer1 = JOptionPane.showInputDialog("Write one random number.");
		String answer2 = JOptionPane.showInputDialog("Write another random number.");
		String answer3 = JOptionPane.showInputDialog("Write one more random number.");
		int one = Integer.parseInt(answer1);
		int two = Integer.parseInt(answer2);
		int three = Integer.parseInt(answer3);
		if (one > two && one > three) {
			BN = one;
		}
		if (two > one && two > three) {
			BN = two;
		}
		if (three > two && three > one) {
			BN = three;
		}
		if (one < two && one < three) {
			SN = one;
		}
		if (two < one && two < three) {
			SN = two;
		}
		if (three < two && one > three) {
			SN = three;
		}
		System.out.println("The biggest number you typed was " + BN + ". The smallest number you typed was " + SN);

	}
}
