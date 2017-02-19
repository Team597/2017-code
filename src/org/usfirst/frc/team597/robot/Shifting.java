package org.usfirst.frc.team597.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.Joystick;

public class Shifting {
	DoubleSolenoid rightshift;
	Joystick rightStick;
	ToggleButton toggle;

	public Shifting(Joystick rightstick) {
		rightshift = new DoubleSolenoid(Ports.shifting.Shift1, Ports.shifting.Shift2);
		rightStick = rightstick;
		toggle = new ToggleButton();
	}

	public void teleOp() {
		toggle.input(rightStick.getRawButton(1));
		if (toggle.Output() == true) {
			rightshift.set(Value.kForward);
		} else {
			rightshift.set(Value.kReverse);
		}
	}

}
