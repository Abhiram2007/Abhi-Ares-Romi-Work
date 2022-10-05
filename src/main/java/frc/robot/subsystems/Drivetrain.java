// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import static frc.robot.Constants.DrivetrainConstants.*;

public class Drivetrain extends SubsystemBase {
  /**
   * PN: 
   * Include: 
   *  - 2 Sparks (1 left, 1 right -- same as last time)
   *  - 2 Encoders (WPILib class, ctrl-click on class name to look at constructor) -- left has ports 4,5 and right has ports 6,7
   *  - 1 DifferentialDrive class -- does the math of figuring out side speeds for us (look at class for constructor)
   */
    private final Spark right = new Spark(kSparkPort1);
    private final Spark left = new Spark(kSparkPort2);

    //private final VictorSP leftMotor = new VictorSP(0);
    //private final VictorSP rightMotor = new VictorSP(1);

    private final Encoder leftEncoder = new Encoder(kEncoderPort1, kEncoderPort2);
    private final Encoder rightEncoder = new Encoder(kEncoderPort3, kEncoderPort4);

    private final DifferentialDrive drive = new DifferentialDrive(left, right);

  public Drivetrain() {
    /**
     * PN:
     * Here, use the setDistancePerPulse method of the Encoders 
     * to tell each one how much distance to report per pulse/count -- use the constants you made and some math
     *  
     * Reset the encoders using the method you made below
     * 
     * Finally, use SmartDashboard.putNumber() two times to add the left and right distances to the GUI.
     * 
     * 
     */

    leftEncoder.setDistancePerPulse(kWheelDiameter/kEncoderCPR);
    rightEncoder.setDistancePerPulse(kWheelDiameter/kEncoderCPR);
    resetEncoders();
    
   
  }
  /**
   * PN: 
   * Make a curvatureDrive method which calls the curvatureDrive method in DifferentialDrive
   * @param throttle
   * @param steering
   * @param isQuickTurn
   */
public void curvatureDrive(double throttle, double steering, boolean isQuickTurn){
  drive.curvatureDrive(throttle, steering, isQuickTurn);
}

public void resetEncoders(){
  leftEncoder.reset();
  rightEncoder.reset();
}
   

  /**
   * PN: Make two methods which each return the distance reading from the left or right encoders, respectively
   * @return distance in inches for left/right encoders
   */

  public double distanceLeft(){
    double distanceLeftInInches = leftEncoder.getDistance();
    return distanceLeftInInches;
  }

  public double distanceRight(){
    double distanceRightInInches = rightEncoder.getDistance();
    return distanceRightInInches;
  }


}
