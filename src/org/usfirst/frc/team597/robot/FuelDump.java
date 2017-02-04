package org.usfirst.frc.team597.robot;

import edu.wpi.first.wpilibj.Joystick;

import edu.wpi.first.wpilibj.VictorSP;

public class FuelDump {
	Joystick secondaryStick;
	VictorSP dumpingFuel;

	public FuelDump(Joystick second, VictorSP fuelDump) {
		second = secondaryStick;
		fuelDump = dumpingFuel;

	}

	public void teleopPeriodic() {
		if (secondaryStick.getRawButton(1)) {
			dumpingFuel.set(1);

		} else {
			dumpingFuel.set(0);
		}
	}
}
