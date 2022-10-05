// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 */
public final class Constants {

    /**
     * PN: 
     * - include a class here called DriveConstants
     * - Add two constants to this class
     *   1. ENCODER_CPR -- encoder counts per revolution = 1440.0 
     *   2. WHEEL_DIAMETER -- diameter of wheel in inches = 2.75591
     */

     public static final class DrivetrainConstants{
        public static final int kSparkPort1 = 0;
        public static final int kSparkPort2 = 1;

        public static final int kEncoderPort1 = 4;
        public static final int kEncoderPort2 = 5;
        public static final int kEncoderPort3 = 6;
        public static final int kEncoderPort4 = 7;
        
        public static double kEncoderCPR = 1440.0;
        public static double kWheelDiameter = 2.75591;
     } 
}
