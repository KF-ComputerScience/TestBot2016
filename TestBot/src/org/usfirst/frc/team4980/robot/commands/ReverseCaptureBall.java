package org.usfirst.frc.team4980.robot.commands;

import org.usfirst.frc.team4980.robot.Robot;
import org.usfirst.frc.team4980.robot.subsystems.CaptureWheels;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ReverseCaptureBall extends Command {

	private double speed;
	private static CaptureWheels captureWheels;
    public ReverseCaptureBall() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    	this(-.8);//calls the other constuctor
    	
    }
    public ReverseCaptureBall(double speed) {
    	requires(captureWheels);//used for interupts method, see capture ball
    	this.speed = speed;
    	captureWheels = Robot.captureWheels;
    	captureWheels.speed = this.speed;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	captureWheels.capture();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	//if we had a motion sensor we could
    	//say return true if ball is close enough to sensor
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	captureWheels.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
