package org.usfirst.frc.team597.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.VictorSP;

public class Light {
Relay light;
public Light(Relay led) {
	light = led;
//Name 
}

public void LightClassON() {
	light.set(Relay.Value.kForward);
}
public void LightClassOFF() {	
	light.set(Relay.Value.kOff);
	}
	
	
}














}
