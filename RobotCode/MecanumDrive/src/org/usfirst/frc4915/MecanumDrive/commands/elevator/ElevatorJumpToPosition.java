package org.usfirst.frc4915.MecanumDrive.commands.elevator;

import org.usfirst.frc4915.MecanumDrive.Robot;
import org.usfirst.frc4915.MecanumDrive.subsystems.Elevator;
import org.usfirst.frc4915.debuggersystem.CustomDebugger.LoggerNames;

import edu.wpi.first.wpilibj.command.Command;

public class ElevatorJumpToPosition extends Command {
	Elevator elevator = Robot.elevator;

	// Position number -- number of totes that you would need to stack on top
	// of.
	private double positionNumber;

	public ElevatorJumpToPosition(double d) {
<<<<<<< HEAD

		// Use requires() here to declare subsystem dependencies
=======
	// Use requires() here to declare subsystem dependencies
>>>>>>> e234c23db517a6dcc0fcac4a2edd59942de06aa6
		// eg. requires(chassis);
		requires(Robot.grabber);
		requires(Robot.elevator);
		positionNumber = d;
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		Robot.debugger.logError(LoggerNames.ELEVATOR, "Elevator Initialized");
		elevator.setHeightToPosition(positionNumber);
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		// Changes height
	}

	// Make this return true when this Command no longer needs to run execute()
	// TODO This command doesn't end
	protected boolean isFinished() {
		return true;
	}

	// Called once after isFinished returns true
	protected void end() {
    	Robot.debugger.logError(LoggerNames.ELEVATOR, "Jumped to position " + positionNumber);

	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		end();
	}
}
