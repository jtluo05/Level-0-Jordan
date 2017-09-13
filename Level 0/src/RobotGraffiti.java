import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		Robot r2d2 = new Robot("batman");
		r2d2.setPenColor(Color.GREEN);
		r2d2.penDown();
		r2d2.setPenWidth(10);
		r2d2.setSpeed(10);
		r2d2.move(250);
		r2d2.turn(270);
		r2d2.move(260);
		r2d2.turn(180);
		r2d2.move(520);
		r2d2.turn(180);
		r2d2.move(260);
		r2d2.turn(270);
		r2d2.move(375);
		for (int i = 0; i < 180; i++) {
			r2d2.turn(1);
			r2d2.move(3);
		}
		r2d2.hide();
	}

}
