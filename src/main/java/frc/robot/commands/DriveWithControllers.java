package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

public class DriveWithControllers extends CommandBase {
    
    /**
     * PN: 
     * fields: a Drivetrain, a double 'rightThrottle', a double 'leftThrottle', a double 'steering' and a boolean 'quickturn' (private final, as always)
     * constructor: should take parameters corresponding to the fields and instantiates them
     * methods: 
     * - override the execute() method -- every time this command is executed, it should call
     *   the curvatureDrive() method of the Drivetrain with appropriate parameters
     *   (hint: Right trigger of the xboxcontroller makes the romi go forward, left trigger makes it go backward)
     *  
     *    
     */
    private final Drivetrain drivetrain;
    private final double rightThrottle;
    private final double leftThrottle;
    private final double steering;
    private final boolean quickturn;
    private double throttle;
    public DriveWithControllers(Drivetrain drivetrain, double rightThrottle, double leftThrottle, double steering, boolean quickturn){
        this.drivetrain = drivetrain;
        this.rightThrottle = rightThrottle;
        this.leftThrottle = leftThrottle;
        this.steering = steering;
        this.quickturn = quickturn;
    }

    @Override
    public void execute(){
        throttle = rightThrottle - leftThrottle;
        drivetrain.curvatureDrive(throttle, steering, quickturn);
        
    }
    public double getThrottle(){
        return throttle;       
    }
}
