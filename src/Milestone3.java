import lejos.nxt.*;

public class Milestone3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Button.waitForAnyPress();
		
		int sideLength = (int) Math.round(24*2.54);
		
		PolyTracer.traceEquilateral(sideLength, 3, false);
		
		Button.waitForAnyPress();
		
		PolyTracer.traceEquilateral(sideLength, 5, true);
		
		double radius1 = 36*2.54;
		double radius2 = -12*2.54;
		
		Button.waitForAnyPress();
		
		PolyTracer.traceArc(radius1, 180);
		
		Button.waitForAnyPress();
		
		PolyTracer.traceArc(radius2, -90);

	}

}
