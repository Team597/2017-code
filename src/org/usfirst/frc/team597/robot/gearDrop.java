package org.usfirst.frc.team597.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.Joystick;

public class gearDrop {
	Joystick secondstick;
	DoubleSolenoid rightgear;
	public gearDrop(Joystick secondStick) {
		secondstick = secondStick;
		rightgear = new DoubleSolenoid(Ports.drop.rightDrop1, Ports.drop.rightDrop2);
	}

	public void teleOp() {
		if (secondstick.getRawButton(1)) {
			rightgear.set(Value.kForward);
		} else {
			rightgear.set(Value.kReverse);
		}
	}

}
