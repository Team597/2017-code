package org.usfirst.frc.team597.robot;

import edu.wpi.first.wpilibj.Joystick;

public class Intake {
	Joystick secondstick;
	Motor intake;

	public Intake(Joystick secondStick) {
		secondstick = secondStick;
		intake = new Motor();
	}

	public void teleOp() {
		if (secondstick.getRawButton(6)) {
			intake.teleopIntake(1);
		} else {
			intake.teleopIntake(0);

		}
	}
}
