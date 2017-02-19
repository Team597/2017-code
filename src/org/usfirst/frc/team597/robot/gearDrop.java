package org.usfirst.frc.team597.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Solenoid;

public class gearDrop {
	Joystick secondStick;
	   Solenoid rightgear;
	public gearDrop(Joystick secondstick) {
		secondStick = secondstick;
		rightgear = new Solenoid(Ports.drop.Drop1);
	}

	public void teleOp() {
		if (secondStick.getRawButton(1)) {
			rightgear.set(true);
		} else {
			rightgear.set(false);
		}
	}

}
