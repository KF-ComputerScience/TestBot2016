package org.usfirst.frc.team4980.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team4980.robot.commands.CaptureBall;
import org.usfirst.frc.team4980.robot.commands.ExampleCommand;
import org.usfirst.frc.team4980.robot.commands.ReverseCaptureBall;
import org.usfirst.frc.team4980.robot.commands.ShootBall;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public static Joystick xbox;//intended joystick is xbox controller
	public static Button button1, button2, button3;
	
	public OI() {
		xbox = new Joystick(1);//constructor takes an int that represents
								//which port the joystick is in. Should be
								//displayed on driverstation.
		
		button1 = new JoystickButton(xbox, 0);//buttons also take an int as
		button2 = new JoystickButton(xbox, 1);//one of the values passed int.
		button3 = new JoystickButton(xbox, 2);//the button numbers should also be
		                                       //displayed on driverstation.
		
		button1.whileHeld(new CaptureBall(.5));//can set speed here, or inside command
		button2.whileHeld(new ReverseCaptureBall(-.8));
		//button3.whenPressed(new ShootBall());
	}										   
	
	
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
	
}

