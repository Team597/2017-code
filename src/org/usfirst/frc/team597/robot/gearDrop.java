package org.usfirst.frc.team597.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Solenoid;

public class gearDrop {
	Joystick secondstick;
	   Solenoid rightgear;
	public gearDrop(Joystick secondStick) {
		secondstick = secondStick;
		rightgear = new Solenoid(Ports.drop.Drop1);
	}

	public void teleOp() {
		if (secondstick.getRawButton(1)) {
			rightgear.set(true);
		} else {
			rightgear.set(false);
		}
	}

}
