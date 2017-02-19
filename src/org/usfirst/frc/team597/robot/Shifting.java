package org.usfirst.frc.team597.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.Joystick;

public class Shifting {
	DoubleSolenoid rightshift;
	Joystick rightstick;
	ToggleButton toggle;

	public Shifting(Joystick rightStick) {
		rightshift = new DoubleSolenoid(Ports.shifting.Shift1, Ports.shifting.Shift2);
		rightstick = rightStick;
		toggle = new ToggleButton();
	}

	public void TeleOp() {
		toggle.input(rightstick.getRawButton(1));
		if (toggle.Output() == true) {
			rightshift.set(Value.kForward);
		} else {
			rightshift.set(Value.kReverse);
		}
	}

}
