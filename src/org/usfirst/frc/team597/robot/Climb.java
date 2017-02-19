package org.usfirst.frc.team597.robot;

import edu.wpi.first.wpilibj.Joystick;

public class Climb {
	Joystick secondstick;
	Motor climb;

	public Climb(Joystick stick3) {
		secondstick = stick3;
		climb = new Motor();
	}

	public void TeleOp() {
		if (secondstick.getRawButton(5)) {
			climb.teleopClimb(.6);
		} else {
			climb.teleopClimb(0);
		}
	}

}
