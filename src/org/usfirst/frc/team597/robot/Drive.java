package org.usfirst.frc.team597.robot;

import edu.wpi.first.wpilibj.Joystick;

public class Drive {
	Motor motor;
	Joystick leftStick;
	Joystick rightStick;


	public Drive(Joystick leftstick, Joystick rightstick) {
		motor = new Motor();
		leftStick = leftstick;
		rightStick = rightstick;
	}
	public void teleOp(){
		motor.teleopDrive(leftStick.getY(), rightStick.getY());
	}

}