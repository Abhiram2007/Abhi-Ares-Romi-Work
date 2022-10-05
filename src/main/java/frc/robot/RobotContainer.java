// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drivetrain;
import frc.robot.commands.DriveWithControllers;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  Drivetrain mainDriveTrain;
  XboxController xboxController;
  /** The container for the robot. Contains subsystems and commands. */
  public RobotContainer() {
  
  }


  /*
   * PN: add a configureCommands() method which uses the setDefaultCommand
   * method to set DriveWithControllers as the default command of the drivetrain
   * hint: construct a new DriveWithControllers command as a parameter of setDefaultCommand
   * Give xboxcontroller button bindings as parameters for DriveWithControllers
   * The controls:
   *  -Right trigger to go forward, left trigger to go backward
   *  -Left joystick to control steering
   *  -X button to activate quickturn
   * Search wpilib docs for how to declare button bindings!
   */
  
   public void configureCommands(){
     mainDriveTrain.setDefaultCommand(new DriveWithControllers(mainDriveTrain, xboxController.getRightTriggerAxis(), xboxController.getLeftTriggerAxis(), xboxController.getLeftX(), xboxController.getXButtonPressed()));
   }
   
   public Command getAutonomousCommand() {
     return null;
   }
}
