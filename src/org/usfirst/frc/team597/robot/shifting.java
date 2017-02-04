package org.usfirst.frc.team597.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;

public class shifting {
	DoubleSolenoid shifting;
	Joystick leftStick;
	Joystick rightStick;

	final Value speedMode = Value.kForward;
	final Value torqueMode = Value.kReverse;

	String driveMode = "Speed Mode";

	public shifting(DoubleSolenoid shift, Joystick ls, Joystick rs) {
		shift = shifting;
		ls = leftStick;
		rs = rightStick;

	}

	public void teleopPeriodic() {
		if (leftStick.getRawButton(1) || rightStick.getRawButton(1)) {
			shifting.set(torqueMode);
			driveMode = "TORQUE";
		} else {
			shifting.set(speedMode);
			driveMode = "SPEED";
		}
		SmartDashboard.putString("Drive Mode", driveMode);
	}

}
