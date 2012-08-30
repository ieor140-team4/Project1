import lejos.util.Delay;
import lejos.nxt.*;


public class Milestone1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
				Button.waitForAnyPress();
				
				Delay.msDelay(200);
				MotorsSetAccel(1000);
				MotorsSetSpeed(400);
				
				//1st side + 1st turn
				double diam = 5.5;
				double length = 36 * 2.54;
				double circumference = diam*Math.PI;
			    int degrees = (int) Math.round(360 * length / circumference);
				MotorsRotate(degrees);
				BotRotate(90);
				
				//2nd side + 2nd turn
				MotorsRotate(degrees);
				BotRotate(90);
				
				//3rd side + 3rd turn
				MotorsRotate(degrees);
				BotRotate(90);
				
				//4th side
				MotorsRotate(degrees);
				BotRotate(90);
				
				//Second square - 1st side + 1st turn
				MotorsRotate(degrees);
				BotRotate(90);
				
				//2nd side + 2nd turn
				MotorsRotate(degrees);
				BotRotate(90);
				
				//3rd side + 3rd turn
				MotorsRotate(degrees);
				BotRotate(90);
				
				//4th side
				MotorsRotate(degrees);
				
				//180-degree turn
				BotRotate(180);
				
				
				//First backward square:
				MotorsRotate(degrees);
				BotRotate(-90);
				MotorsRotate(degrees);
				BotRotate(-90);
				MotorsRotate(degrees);
				BotRotate(-90);
				MotorsRotate(degrees);
				BotRotate(-90);
				
				//Second backward square:
				MotorsRotate(degrees);
				BotRotate(-90);
				MotorsRotate(degrees);
				BotRotate(-90);
				MotorsRotate(degrees);
				BotRotate(-90);
				MotorsRotate(degrees);
				
				
				//int sides = 4, sideLength = 3;
				//for(int i = 0; i < sides; i++){
					//moveForward(sideLength);
					//rotate(degrees)
				}

			public static void MotorsForward(){
				Motor.A.forward();
				Motor.B.forward();
			}
			
			public static void MotorsRotate(int degrees) {
				Motor.A.rotate(degrees, true);
				Motor.B.rotate(degrees);
			}
			
			public static void MotorsStop() {
				Motor.A.stop(true);
				Motor.B.stop();
			}
			
			public static void MotorsSetAccel(int accel) {
				Motor.A.setAcceleration(accel);
				Motor.B.setAcceleration(accel);
			}
			
			public static void MotorsSetSpeed(int speed) {
				Motor.A.setSpeed(speed);
				Motor.B.setSpeed(speed);
			}
			
			public static void BotRotate(int degrees) {
				int prevSpeed = Motor.B.getSpeed();
				int rotateSpeed = 200;
				MotorsSetSpeed(rotateSpeed);
				int wheelDegrees = (int) Math.round(degrees*2.135);
				Motor.A.rotate(wheelDegrees,true);
				Motor.B.rotate(-wheelDegrees);
				MotorsSetSpeed(prevSpeed);
			}
	}