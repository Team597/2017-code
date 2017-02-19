package org.usfirst.frc.team597.robot;

public class Ports {
	public static class joystick{
		public static int LeftStick = 0;
		public static int RightStick = 1;
		public static int CopilotStick = 2;
	}
	public static class drive{
		public static int LeftBottom = 0;
		public static int leftTop = 4;
		public static int RightBot = 2;
		public static int RightTop = 3;
	}
	public static class manipulator{
		public static int Intake = 6;
		public static int Dump = 1;
	}
	public static class climbing {
		public static int climb = 5;
	}
	public static class shifting{
		public static int Shift1 = 2;
		public static int Shift2 = 3;
	}
	public static class drop{
		public static int Drop1 = 0;
		public static int Drop2 = 1;
		
	}
	public static class light{
		public static int light = 0;
	}
}
