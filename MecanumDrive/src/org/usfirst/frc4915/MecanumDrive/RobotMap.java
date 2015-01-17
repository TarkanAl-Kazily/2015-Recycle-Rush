// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4915.MecanumDrive;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.livewindow.LiveWindowSendable;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANTalon mecanumDriveControls1LeftFront1;
    public static CANTalon mecanumDriveControls1LeftRear2;
    public static CANTalon mecanumDriveControls1RightFront3;
    public static CANTalon mecanumDriveControls1RightRear4;
    public static RobotDrive mecanumDriveControls1RobotDrive41;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static Gyro gyro;
    public static void init() {
    	
    	mecanumDriveControls1LeftFront1 = new CANTalon(10); 
    	mecanumDriveControls1LeftRear2 = new CANTalon(11);
    	mecanumDriveControls1RightFront3 = new CANTalon(12);
    	mecanumDriveControls1RightRear4 = new CANTalon(13);
    	gyro = new Gyro(1);
    	
    	
    	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
        LiveWindow.addActuator("Mecanum Drive Controls 1", "Left Front 1", (LiveWindowSendable) mecanumDriveControls1LeftFront1);
        
       
        LiveWindow.addActuator("Mecanum Drive Controls 1", "Left Rear 2", (LiveWindowSendable) mecanumDriveControls1LeftRear2);
        
       
        LiveWindow.addActuator("Mecanum Drive Controls 1", "Right Front 3", (LiveWindowSendable) mecanumDriveControls1RightFront3);
        
        
        LiveWindow.addActuator("Mecanum Drive Controls 1", "Right Rear 4", (LiveWindowSendable) mecanumDriveControls1RightRear4);
        
        mecanumDriveControls1RobotDrive41 = new RobotDrive(mecanumDriveControls1LeftFront1, mecanumDriveControls1LeftRear2,
              mecanumDriveControls1RightFront3, mecanumDriveControls1RightRear4);
        
        mecanumDriveControls1RobotDrive41.setSafetyEnabled(true);
        mecanumDriveControls1RobotDrive41.setExpiration(0.1);
        mecanumDriveControls1RobotDrive41.setSensitivity(0.5);
        mecanumDriveControls1RobotDrive41.setMaxOutput(1.0);


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
