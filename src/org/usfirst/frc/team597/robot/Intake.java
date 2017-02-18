package org.usfirst.frc.team597.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.VictorSP;

public class Intake {
	Joystick secondaryStick;
	VictorSP intake;
	double intakeSpeed;
	double intakeRSpeed;
	double intakeStop;
	ToggleButton toggleButton;
	boolean toggleState;

	public Intake(Joystick SS, VictorSP in) {
		SS = secondaryStick;
		in = intake;

		intakeSpeed = 1;
		intakeRSpeed = -1;
		intakeStop = 0;
		toggleState = false;
		toggleButton = new ToggleButton();

	}

	public void teleopPeriodic() {
		toggleButton.input(secondaryStick.getRawButton(2));
		toggleState = toggleButton.Output();

		if (toggleState == false) {
			intake.set(intakeSpeed);

		} else if (toggleState == true) {
			intake.set(intakeRSpeed);
		} else {
			intake.set(intakeStop);
		}

	}

}
