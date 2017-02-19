package org.usfirst.frc.team597.robot;

import edu.wpi.first.wpilibj.Joystick;

public class Intake {
	Joystick secondStick;
	Motor intake;

	public Intake(Joystick secondstick) {
		secondStick = secondstick;
		intake = new Motor();
	}

	public void teleOp() {
		if (secondStick.getRawButton(6)) {
			intake.teleopIntake(1);
		} else {
			intake.teleopIntake(0);

		}
	}
}
