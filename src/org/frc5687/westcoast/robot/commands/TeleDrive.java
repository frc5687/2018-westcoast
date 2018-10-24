package org.frc5687.westcoast.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.frc5687.westcoast.robot.OI;
import org.frc5687.westcoast.robot.subsystems.DriveTrain;

/**
 * Created by Ben Bernard on 10/23/2018.
 */
public class TeleDrive extends Command {

    private OI _oi;
    private DriveTrain _driveTrain;

    public TeleDrive(OI oi,  DriveTrain driveTrain) {
        _oi = oi;
        _driveTrain = driveTrain;
        requires(driveTrain);
    }

    @Override
    protected void execute() {
        double leftSpeed = _oi.getLeftSpeed();
        double rightSpeed = _oi.getRightSpeed();

        _driveTrain.tankDrive(leftSpeed, rightSpeed);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }
}
