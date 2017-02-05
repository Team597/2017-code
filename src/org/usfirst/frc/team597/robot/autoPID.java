package org.usfirst.frc.team597.robot;

	import edu.wpi.first.wpilibj.PIDOutput;

		

	public class autoPID implements PIDOutput {
		
		double PIDValue;
		
		@Override
		public void pidWrite(double output) {
			// TODO Auto-generated method stub
			PIDValue = output;
		}

		public double PIDValue() {
			
			return PIDValue;
		}


}
