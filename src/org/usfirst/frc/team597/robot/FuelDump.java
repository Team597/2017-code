package org.usfirst.frc.team597.robot;

import edu.wpi.first.wpilibj.Joystick;

import edu.wpi.first.wpilibj.VictorSP;

public class FuelDump {
	Joystick secondaryStick;
	VictorSP dumpingFuel;

	public FuelDump(Joystick second, VictorSP fuelDump) {
		secondaryStick = second;
		dumpingFuel = fuelDump;
//Name 
	}

	public void teleopPeriodic() {
		if (secondaryStick.getRawButton(1)) {
			dumpingFuel.set(1);

		} else {
			dumpingFuel.set(0);
		
		//button 1 means bring in Fuel
		}
	}
}
