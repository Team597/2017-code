package org.usfirst.frc.team597.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.VictorSP;

public class climbing {
	VictorSP climb;
	Joystick secondaryStick;

	public climbing(VictorSP cLB, Joystick second) {
		secondaryStick = second;
		climb = cLB;
		// Names
	}

	public void teleopPeriodic() {
		if (secondaryStick.getRawButton(5)) {
			climb.set(1);

		} else {
			climb.set(0);
			// When button 3 is being pressed the climbing motor goes forward
		}
	}

}
