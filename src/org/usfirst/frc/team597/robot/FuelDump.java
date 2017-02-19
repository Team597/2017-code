package org.usfirst.frc.team597.robot;

import edu.wpi.first.wpilibj.Joystick;

public class FuelDump {
	Joystick secondaryStick;
	Motor fueldump;

	public FuelDump(Joystick second) {
		secondaryStick = second;
		fueldump = new Motor();
		// Name
	}

	public void teleOp() {
		if (secondaryStick.getRawButton(1)) {
			fueldump.teleopDump(1);

		} else if (secondaryStick.getRawButton(5)) {
			fueldump.teleopDump(-1);

		} else {
			fueldump.teleopDump(0);

			// button 5 means takes out Fuel
		}

	}
}