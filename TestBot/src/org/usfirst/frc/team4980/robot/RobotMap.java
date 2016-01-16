package org.usfirst.frc.team4980.robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	public static RobotDrive robotDrive;
	public static SpeedController leftFront, leftRear, rightFront, rightRear, captureWheelsMotor;
	
	public RobotMap() {
		leftFront = new Talon(0);
		leftRear = new Talon(1);
		rightFront = new Talon(2);
		rightRear = new Talon(3);
		
		robotDrive = new RobotDrive(leftFront, leftRear, rightFront, rightRear);
		
		captureWheelsMotor = new Talon(4);
	}
	
}
