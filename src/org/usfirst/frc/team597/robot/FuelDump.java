package org.usfirst.frc.team597.robot;

import edu.wpi.first.wpilibj.Joystick;

public class FuelDump {
	Joystick secondaryStick;
	Motor fuelDump;

	public FuelDump(Joystick second) {
		secondaryStick = second;
		fuelDump = new Motor();
		// Name
	}

	public void teleOp() {
		if (secondaryStick.getRawButton(1)) {
			fuelDump.teleopDump(1);

		} else if (secondaryStick.getRawButton(5)) {
			fuelDump.teleopDump(-1);

		} else {
			fuelDump.teleopDump(0);

			// button 5 means takes out Fuel
		}

	}
}