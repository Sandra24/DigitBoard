// This code demonstrates the Rev Robotics Digit board. It cycles through the alphabet sending 4 letters at a time
// to the board's 4-digit display

package org.usfirst.frc.team20.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;

public class Robot extends IterativeRobot {

	REVDigitBoard board;

	final String defaultAuto = "Default";
	final String customAuto = "My Auto";
	String autoSelected;
	SendableChooser chooser;
	double a;

	public void robotInit() {
		board = new REVDigitBoard();
		board.clear();
		a = 0.00;

	}

	public void autonomousInit() {

	}

	/**
	 * This function is called periodically during autonomous
	 */
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

	public void disabledPeriodic() {
		if (board.getButtonA()) {
			a += 0.01;
			board.display(a);
		}
		if (board.getButtonB()) {
			a -= 0.01;
			board.display(a);
		}

	}

	/**
	 * This function is called periodically during operator control
	 */
	public void teleopPeriodic() {
	}

	/**
	 * This function is called periodically during test mode
	 */
	public void testPeriodic() {

	}

}