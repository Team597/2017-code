package org.usfirst.frc.team597.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.VictorSP;

public class Light {
Relay spike;

public Light(Relay led) {
	spike = led;
	
//Name 
}
public void LightON(){
	spike.set(Relay.Value.kForward);
	
	
	
}
public void LightOFF(){
	spike.set(Relay.Value.kOff);
}
}