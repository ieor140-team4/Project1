import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.util.Delay;


public class Milestone2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MotorsSetAccel(500);
		
		Button.waitForAnyPress();
		
		int sideLength = (int) Math.round(36*2.54);
		int sides = 4;

		PolyTracer.traceEquilateral(sideLength, sides, true);
		PolyTracer.traceEquilateral(sideLength, sides, true);
		
		
		double trackWidth = 9.2 + 2.6;
		double wheelDiam = 5.56;
		DifferentialPilot dp = new DifferentialPilot(wheelDiam, trackWidth, Motor.A, Motor.B);
		dp.setRotateSpeed(45);
		dp.rotate(-90.0);

		PolyTracer.traceEquilateral(sideLength, sides, false);
		PolyTracer.traceEquilateral(sideLength, sides, false);
	}
	

	public static void MotorsSetAccel(int accel) {
		Motor.A.setAcceleration(accel);
		Motor.B.setAcceleration(accel);
	}
}
