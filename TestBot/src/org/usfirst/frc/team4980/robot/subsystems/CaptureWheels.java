package org.usfirst.frc.team4980.robot.subsystems;

import org.usfirst.frc.team4980.robot.Robot;
import org.usfirst.frc.team4980.robot.commands.CaptureBall;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CaptureWheels extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public static double speed;
	public CaptureWheels(double speed) {
		this.speed = speed;
	}
	
	public CaptureWheels() {
		this(.8);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new CaptureBall());
    }
    public void stop() {
    	setSpeed(0);
    }
    
    public void setSpeed(double speed) {
    	Robot.robotMap.captureWheelsMotor.set(speed);
    }
    
    public void capture() {
    	Robot.robotMap.captureWheelsMotor.set(this.speed);
    }
}

