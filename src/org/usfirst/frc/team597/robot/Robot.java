 package org.usfirst.frc.team597.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	final String defaultAuto = "Default";
	final String customAuto = "My Auto";
	String autoSelected;
	SendableChooser<String> chooser = new SendableChooser<>();
	VictorSP leftM1;
	VictorSP leftM2;
	VictorSP leftM3;
	VictorSP rightM1;
	VictorSP rightM2;
	VictorSP rightM3;
	VictorSP intake;
	VictorSP dumpingFuel;
	VictorSP climb;

	Joystick leftStick;
	Joystick rightStick;
	Joystick secondaryStick;

	DoubleSolenoid GearDrop;
	DoubleSolenoid shifting;

	Drive drive;
	FuelDump fuelDump;
	gearDropManual gearDrop;
	shifting Shifter;
	climbing Climb;
	driveBackIntake dBI;
	autoPeriod auto;
	
	
//Names
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		chooser.addDefault("Default Auto", defaultAuto);
		chooser.addObject("My Auto", customAuto);
		SmartDashboard.putData("Auto choices", chooser);
		leftM1 = new VictorSP(0);
		leftM2 = new VictorSP(1);
		leftM3 = new VictorSP(2);
		rightM1 = new VictorSP(3);
		rightM2 = new VictorSP(4);
		rightM3 = new VictorSP(5);
		intake = new VictorSP(6);
		dumpingFuel = new VictorSP(7);
		climb = new VictorSP(8);

		leftStick = new Joystick(0);
		rightStick = new Joystick(1);
		secondaryStick = new Joystick(2);

		GearDrop = new DoubleSolenoid(0, 1);
		shifting = new DoubleSolenoid(2, 3);

		drive = new Drive(leftStick, rightStick, leftM1, leftM2, leftM3, rightM1, rightM2, rightM3);
		fuelDump = new FuelDump(secondaryStick, intake);
		gearDrop = new gearDropManual(secondaryStick, GearDrop);
		Shifter = new shifting(shifting, leftStick, rightStick);
		Climb = new climbing(climb, secondaryStick);
		dBI = new driveBackIntake(leftStick,rightStick, intake);
		auto = new autoPeriod(leftM1, leftM2, leftM3, rightM1, rightM2, rightM3);
		
		
	
//Ports
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString line to get the auto name from the text box below the Gyro
	 *
	 * You can add additional auto modes by adding additional comparisons to the
	 * switch structure below with additional strings. If using the
	 * SendableChooser make sure to add them to the chooser code above as well.
	 */
	@Override
	public void autonomousInit() {
		autoSelected = chooser.getSelected();
		// autoSelected = SmartDashboard.getString("Auto Selector",
		// defaultAuto);
		System.out.println("Auto selected: " + autoSelected);
	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
		switch (autoSelected) {
		case customAuto:auto.autoPeriodic();

			
			// Put custom auto code here
			break;
		case defaultAuto:
		default:
			// Put default auto code here
			break;
		}
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		drive.teleopPeriodic();
		fuelDump.teleopPeriodic();
		gearDrop.teleopPeriodic();
		Shifter.teleopPeriodic();
		Climb.teleopPeriodic();
		dBI.teleopPeriodic();
		
//Enables classes to work0-
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
	}
}
