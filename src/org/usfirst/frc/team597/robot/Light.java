package org.usfirst.frc.team597.robot;

import edu.wpi.first.wpilibj.Relay;

public class Light {
	Relay light;
	

	public Light(Relay led) {
		led = light;
	

	}

	public void CameraLightON() {

		light.set(Relay.Value.kForward);
	}

	public void CameraLightOFF() {
		light.set(Relay.Value.kReverse);
	}

}
