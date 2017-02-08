package org.usfirst.frc.team597.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.VictorSP;

public class Drive {
	VictorSP leftFrontVictor;
	VictorSP leftBackVictor;
	VictorSP leftTopVictor;
	VictorSP rightFrontVictor;
	VictorSP rightBackVictor;
	VictorSP rightTopVictor;
	
	Joystick leftStick;
	Joystick rightStick;
	public Drive(){
		leftFrontVictor = new VictorSP(0);
		leftBackVictor = new VictorSP(1);
		leftTopVictor = new VictorSP(2);
		rightFrontVictor = new VictorSP(3);
		rightBackVictor = new VictorSP(4);
		rightTopVictor = new VictorSP(5);
		
		leftStick = new Joystick(0);
		rightStick = new Joystick(1);
	}
	public void Driving(){
		teleop(leftStick.getY(), rightStick.getY());
			
		
	}
	public void teleop(double leftSpeed, double rightSpeed){
		leftFrontVictor.set(rightSpeed);
		leftBackVictor.set(leftSpeed);
		leftTopVictor.set(-leftSpeed);
		rightFrontVictor.set(rightSpeed);
		rightBackVictor.set(rightSpeed);
		rightTopVictor.set(-rightSpeed);
	}
}
