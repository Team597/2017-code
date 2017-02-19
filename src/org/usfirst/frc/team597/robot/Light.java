package org.usfirst.frc.team597.robot;

import edu.wpi.first.wpilibj.Relay;

public class Light {
	Relay light;

	public Light() {
		light = new Relay(Ports.light.light);
	}

	public void LightOn() {
		light.set(Relay.Value.kForward);
	}

	public void LightOff() {
		light.set(Relay.Value.kReverse);

	}
}
