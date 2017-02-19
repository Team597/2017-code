package org.usfirst.frc.team597.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
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
	Joystick leftStick;
	Joystick rightStick;
	Joystick secondStick;

	Climb climb;
	Drive drive;
	FuelDump fueldump;
	gearDrop geardrop;
	Intake intake;
	Shifting shifting;
	Light light;
	CameraFeed camerafeed;

	// Names
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		chooser.addDefault("Default Auto", defaultAuto);
		chooser.addObject("My Auto", customAuto);
		SmartDashboard.putData("Auto choices", chooser);
		leftStick = new Joystick(Ports.joystick.LeftStick);
		rightStick = new Joystick(Ports.joystick.RightStick);
		secondStick = new Joystick(Ports.joystick.CopilotStick);
		// Ports
		climb = new Climb(secondStick);
		drive = new Drive(leftStick, rightStick);
		fueldump = new FuelDump(secondStick);
		geardrop = new gearDrop(secondStick);
		intake = new Intake(secondStick);
		shifting = new Shifting(rightStick);
		light = new Light();
		camerafeed = new CameraFeed();
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
		case customAuto:

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
		climb.teleOp();
		drive.teleOp();
		fueldump.teleOp();
		geardrop.teleOp();
		intake.teleOp();
		light.LightOn();
		shifting.teleOp();
		camerafeed.teleOp();
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
	}
}
