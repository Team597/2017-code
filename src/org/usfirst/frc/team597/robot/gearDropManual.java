    package org.usfirst.frc.team597.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.Joystick;

public class gearDropManual {
	Joystick secondaryStick;
	DoubleSolenoid gearDrop;
	DoubleSolenoid gearDrop2;

	public gearDropManual(Joystick second, DoubleSolenoid gD, DoubleSolenoid gD2) {
		secondaryStick = second ;
		gearDrop  = gD;
		gearDrop2 = gD2;
//Name
	}

	public void teleopPeriodic() {
		if (secondaryStick.getRawButton(2)) {
			gearDrop.set(Value.kForward);
			gearDrop2.set(Value.kForward);
		} else {
			gearDrop2.set(Value.kReverse);
			gearDrop.set(Value.kReverse);
		
		//If button 2 is pressed Gear will drop
		}

	}

}
