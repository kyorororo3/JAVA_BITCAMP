package main_3;

import Robot_3.DanceRobot;
import Robot_3.DrawRobot;
import Robot_3.Robot;
import Robot_3.SingRobot;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Robot[] arr = {new DanceRobot(), new SingRobot(),
				new DrawRobot()};
			for(int i = 0; i<arr.length;i++) {
				action(arr[i]);
			}
	}

	static void action(Robot r) {
		
				
		if(r instanceof DanceRobot) {
			DanceRobot d = (DanceRobot)r;
			d.dance();
			}
		
		else if(r instanceof SingRobot) {
			SingRobot s = (SingRobot)r;
			s.sing();
			}
		else if(r instanceof DrawRobot) {
			DrawRobot s = (DrawRobot)r;
			s.draw();
			}
	}
			

	
}
