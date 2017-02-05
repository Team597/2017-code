package org.usfirst.frc.team597.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.VictorSP;

public class driveBackIntake {
	Joystick leftStick;
	Joystick rightStick;
	VictorSP intake;
	
	double deadzone;
	
	
	

	public driveBackIntake(Joystick lS,Joystick rS,VictorSP in){
		leftStick = lS;
		rightStick = rS;
		intake = in;
		deadzone = 0.15;
	}
		
	
	public void teleopPeriodic() {
		if (leftStick.getY() < -deadzone || rightStick.getY() < -deadzone) {
			intake.set(1);

		} else {
			intake.set(0);
	
		
		
	}
	
	}
}
