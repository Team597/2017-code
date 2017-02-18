package org.usfirst.frc.team597.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;

public class shifting {
	DoubleSolenoid shifting;
	Joystick leftStick;
	Joystick rightStick;
	DoubleSolenoid shifting2;
	final Value speedMode = Value.kForward;
	final Value torqueMode = Value.kReverse;

	String driveMode = "Speed Mode";

	// Imports
	public shifting(DoubleSolenoid shift, DoubleSolenoid shift2, Joystick ls, Joystick rs) {
		shifting2 = shift2;
		shifting = shift;
		leftStick = ls;
		rightStick = rs;
		// Names
	}

	public void teleopPeriodic() {
		if (leftStick.getRawButton(1) || rightStick.getRawButton(1)) {
			shifting.set(torqueMode);
			driveMode = "TORQUE";
		} else {
			shifting.set(speedMode);
			driveMode = "SPEED";
			// Shifts to torque or speed
		}
		if (leftStick.getRawButton(1) || rightStick.getRawButton(1)) {
			shifting2.set(torqueMode);
			driveMode = "TORQUE";
		} else {
			shifting2.set(speedMode);
			driveMode = "SPEED";
			// Shifts to torque or speed
		}
		
		
		SmartDashboard.putString("Drive Mode", driveMode);
		// Shows Dashboard Drive Train
	}

}
