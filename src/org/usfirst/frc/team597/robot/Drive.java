package org.usfirst.frc.team597.robot;

import edu.wpi.first.wpilibj.Joystick;

public class Drive {
	Motor motor;
	Joystick leftstick;
	Joystick rightstick;


	public Drive(Joystick leftStick, Joystick rightStick) {
		motor = new Motor();
		leftstick = leftStick;
		rightstick = rightStick;
	}
	public void TeleOp(){
		motor.teleopDrive(leftstick.getY(), rightstick.getY());
	}

}