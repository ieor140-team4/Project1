import lejos.nxt.Motor;
import lejos.robotics.navigation.DifferentialPilot;

public class PolyTracer {

	/**
	 * @param args
	 */
	
	//wheel diameter = 5.6 cm
	//wheel width = 2.6 cm
	//inner wheel to inner wheel = 9.2 cm
	
	public static void traceEquilateral(int sideLength, int sides, boolean turnsRight) {
		double trackWidth = 9.2 + 2.6;
		double wheelDiam = 5.56;
		DifferentialPilot dp = new DifferentialPilot(wheelDiam, trackWidth, Motor.A, Motor.B);
		dp.setTravelSpeed(30);
		dp.setRotateSpeed(45);
		
		for (int i = 0; i < sides; i++) {
			dp.travel(sideLength);
			if (turnsRight) {
			dp.rotate(-1*findAnglesFromSides(sides)); //negative to turn right instead of left
			}
			else if (!turnsRight) {
				dp.rotate(findAnglesFromSides(sides)); //positive to turn left
			}
		}
	}
	
	public static void traceArc(double radius, double angle) {
		double trackWidth = 9.2 + 2.6;
		double wheelDiam = 5.56;
		DifferentialPilot dp = new DifferentialPilot(wheelDiam, trackWidth, Motor.A, Motor.B);
		dp.setTravelSpeed(30);
		dp.setRotateSpeed(45);
		
		dp.arc(radius, angle);
		
		
	}
	
	private static double findAnglesFromSides(int sides) {
		int totalDegrees = (sides-2)*180;
		return 180 - (totalDegrees/sides);
	}

}
