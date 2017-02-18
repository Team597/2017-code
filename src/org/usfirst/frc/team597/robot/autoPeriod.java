package org.usfirst.frc.team597.robot;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.VictorSP;

public class autoPeriod {
	int autoState;
	int driveValue;
	double gyroValue;

	VictorSP leftBR;
	
	VictorSP leftM3;
	VictorSP rightBR;
	
	VictorSP rightM3;

	Encoder leftEncoder;
	Encoder rightEncoder;
	AnalogGyro driveGyro;

	PIDController leftPID;
	PIDController rightPID;
	PIDController turnPID;

	autoPID autoLeft;
	autoPID autoRight;
	autoPID autoTurn;

	public autoPeriod(VictorSP lBR,  VictorSP lM3, VictorSP rBR,  VictorSP rM3) {
		leftBR = lBR;
	
		leftM3 = lM3;
		rightBR = rBR;
		
		rightM3 = rM3;

		autoState = 0;
		driveValue = 1500;
		gyroValue = 0.0;

		leftEncoder = new Encoder(0, 1);
		rightEncoder = new Encoder(2, 3);
		driveGyro = new AnalogGyro(0);

		leftPID = new PIDController(1.0 / 100.0, 0.0, 0.0, leftEncoder, autoLeft);
		rightPID = new PIDController(1.0 / 100.0, 0.0, 0.0, rightEncoder, autoRight);
		turnPID = new PIDController(1.0 / 10.0, 0.0, 0.0, 0.0, driveGyro, autoTurn);

		autoLeft = new autoPID();
		autoRight = new autoPID();
		autoTurn = new autoPID();

	}

	public void autoPeriodic() {
		if (autoState == 0) {

			leftPID.setSetpoint(driveValue);
			rightPID.setSetpoint(driveValue);
			leftPID.enable();
			rightPID.enable();			

			autoState = 1;
			
		}
		else if (autoState == 1) {
			leftBR.set(autoLeft.PIDValue());
			leftM3.set(-autoLeft.PIDValue());
			
			rightBR.set(autoRight.PIDValue());
			rightM3.set(-autoRight.PIDValue());
			
			if (leftPID.getError() <= 10.0 && rightPID.getError() <= 10.0) {
				leftPID.disable();
				rightPID.disable();
				leftBR.set(0);
				leftM3.set(0);
				rightBR.set(0);
				rightM3.set(0);

				autoState = 2;
			}

		}
		else if(autoState == 2) {
			
		}

			/*
			 * if (leftEncoder.get() >= (driveValue)) { autoState = 1; } if
			 * (driveGyro.getAngle() >= (gyroValue - 10) && driveGyro.getAngle()
			 * <= (driveValue + 10)) { autoState = 2; }
			 * 
			 * } if (autoState == 1) { leftPID.disable(); rightPID.disable();
			 * turnPID.enable(); gyroValue = 45; turnPID.setSetpoint(gyroValue);
			 * leftM1.set(autoTurn.PIDValue()); leftM2.set(autoTurn.PIDValue());
			 * leftM3.set(autoTurn.PIDValue()); rightM1.set(autoTurn.PIDValue()
			 * * -1); rightM2.set(autoTurn.PIDValue() * -1);
			 * rightM3.set(autoTurn.PIDValue() * -1);
			 * 
			 * if (driveGyro.getAngle() >= (gyroValue - 5) &&
			 * driveGyro.getAngle() <= (driveValue + 5)) { autoState = 3; } } if
			 * (autoState == 2) { leftPID.disable(); rightPID.disable();
			 * turnPID.enable(); gyroValue = 0; turnPID.setSetpoint(gyroValue);
			 * leftM1.set(autoTurn.PIDValue()); leftM2.set(autoTurn.PIDValue());
			 * leftM3.set(autoTurn.PIDValue()); rightM1.set(autoTurn.PIDValue()
			 * * -1); rightM2.set(autoTurn.PIDValue() * -1);
			 * rightM3.set(autoTurn.PIDValue() * -1); if (driveGyro.getAngle()
			 * >= (gyroValue - 2) && driveGyro.getAngle() <= (driveValue + 2)) {
			 * autoState = 0; } }
			 * 
			 * if (autoState == 3) { leftPID.disable(); leftPID.disable();
			 * turnPID.disable();
			 * 
			 * autoState = 4;
			 */
		}
	}


