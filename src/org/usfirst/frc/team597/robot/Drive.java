
package org.usfirst.frc.team597.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.VictorSP;

public class Drive {
	Joystick leftStick;
	Joystick rightStick;
	VictorSP leftBR;

	VictorSP leftM3;
	VictorSP rightBR;

	VictorSP rightM3;

	double deadzone;

	public Drive(Joystick jsL, Joystick jsR, VictorSP lBR, VictorSP lM3, VictorSP rBR, VictorSP rM3) {
		leftStick = jsL;
		rightStick = jsR;
		leftBR = lBR;
		leftM3 = lM3;

		rightBR = rBR;
		rightM3 = rM3;

		deadzone = 0.15;
		// Names
	}

	public void teleopPeriodic() {
		if ((rightStick.getY() < deadzone && rightStick.getY() > -deadzone)) {
			rightBR.set(0);

			rightM3.set(0);

		} else {
			rightBR.set(rightStick.getY());

			rightM3.set(-rightStick.getY());
		}
		if (leftStick.getY() < deadzone && leftStick.getY() > -deadzone) {
			leftBR.set(0);

			leftM3.set(0);

		} else {
			leftBR.set(leftStick.getY());

			leftM3.set(-leftStick.getY());

		}

		// Dead zones so the Joysticks arent as sensitive
	}

}