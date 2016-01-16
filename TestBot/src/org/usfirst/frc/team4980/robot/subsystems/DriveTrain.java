package org.usfirst.frc.team4980.robot.subsystems;

import org.usfirst.frc.team4980.robot.Robot;
import org.usfirst.frc.team4980.robot.commands.Drive;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new Drive());
    }
    
    public void tankDriveXbox() {
    	double left = Robot.oi.xbox.getRawAxis(2);
    	double right = Robot.oi.xbox.getRawAxis(5);
    	Robot.robotMap.robotDrive.tankDrive(left, right);
    }
}

