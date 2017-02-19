package org.usfirst.frc.team597.robot;

import edu.wpi.first.wpilibj.VictorSP;

public class Motor {

		VictorSP leftBR;

		VictorSP leftTop;
		VictorSP rightBR;

		VictorSP rightTop;
		VictorSP climb;
		VictorSP intake;
		VictorSP dump;

	
	public Motor(){
		leftBR = new VictorSP(Ports.drive.LeftBottom);
		leftTop = new VictorSP(Ports.drive.leftTop);
		rightBR = new VictorSP(Ports.drive.RightTop);
		rightTop = new VictorSP(Ports.drive.RightTop);
		intake = new VictorSP(Ports.manipulator.Intake);
		dump = new VictorSP(Ports.manipulator.Dump);
		climb = new VictorSP(Ports.climbing.climb);
	}
	public void teleopDrive(double x, double y){
		leftBR.set(x);
		leftTop.set(-x);
		rightBR.set(y);
		rightTop.set(-y);
	}
	public void teleopClimb(double x){
		climb.set(x);
	}
	public void teleopDump(double x){
		dump.set(x);
	}
	public void teleopIntake(double x){
		intake.set(x);
	}
}
