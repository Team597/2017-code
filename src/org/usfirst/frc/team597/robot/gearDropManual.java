package org.usfirst.frc.team597.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.Joystick;

public class gearDropManual {
	Joystick secondaryStick;
	DoubleSolenoid gearDrop;

	public gearDropManual(Joystick second, DoubleSolenoid gD) {
		second = secondaryStick;
		gD = gearDrop;
//Name
	}

	public void teleopPeriodic() {
		if (secondaryStick.getRawButton(2)) {
			gearDrop.set(Value.kForward);
		} else {
			gearDrop.set(Value.kReverse);
		
		//If button 2 is pressed Gear will drop
		}

	}

}
