package org.usfirst.frc.team597.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.VictorSP;

public class Drive {
	Joystick leftStick;
	Joystick rightStick;
	VictorSP leftM1;
	VictorSP leftM2;
	VictorSP leftM3;
	VictorSP rightM1;
	VictorSP rightM2;
	VictorSP rightM3;
	VictorSP intake;

	double deadzone;

	public Drive(Joystick jsL, Joystick jsR, VictorSP lM1, VictorSP lM2, VictorSP lM3, VictorSP rM1, VictorSP rM2,
			VictorSP in, VictorSP rM3) {
		leftStick = jsL;
		rightStick = jsR;
		leftM1 = lM1;
		leftM2 = lM2;
		leftM3 = lM3;
		rightM1 = rM1;
		rightM2 = rM2;
		rightM3 = rM3;
		intake = in;

		deadzone = 0.15;

	}

	public void teleopPeriodic() {
		if ((rightStick.getY() < deadzone && rightStick.getY() > -deadzone)) {
			rightM1.set(0);
			rightM2.set(0);
			rightM3.set(0);

		} else {
			rightM1.set(rightStick.getY());
			rightM2.set(rightStick.getY());
			rightM3.set(rightStick.getY());
		}
		if (leftStick.getY() < deadzone && leftStick.getY() > -deadzone) {
			leftM1.set(0);
			leftM2.set(0);
			leftM3.set(0);

		} else {
			leftM1.set(leftStick.getY());
			leftM2.set(leftStick.getY());
			leftM3.set(leftStick.getY());

		}
		if (leftStick.getY() < -deadzone || rightStick.getY() < -deadzone) {
			intake.set(1);

		} else {
			intake.set(0);

		}

	}

}
