package org.usfirst.frc.team597.robot;

import edu.wpi.first.wpilibj.Joystick;

public class Climb {
	Joystick secondStick;
	Motor climb;

	public Climb(Joystick stick3) {
		secondStick = stick3;
		climb = new Motor();
	}

	public void teleOp() {
		if (secondStick.getRawButton(5)) {
			climb.teleopClimb(.6);
		} else {
			climb.teleopClimb(0);
		}
	}

}
