package org.frc5687.westcoast.robot;

import edu.wpi.first.wpilibj.Joystick;
import org.frc5687.westcoast.robot.subsystems.DriveTrain;
import org.frc5687.westcoast.robot.utils.Gamepad;

import static org.frc5687.westcoast.robot.utils.Helpers.applyDeadband;
import static org.frc5687.westcoast.robot.utils.Helpers.applySensitivityFactor;

public class OI {
    protected Gamepad _driverGamepad;

    public OI(){
        _driverGamepad = new Gamepad(0);
    }


    public double getLeftSpeed() {
        // TODO: Implement!
        return 0;
    }

    public double getRightSpeed() {
        // TODO: Implement!
        return 0;
    }

    public double getDriveSpeed(DriveTrain.DriveMode driveMode) {
        double speed = -getSpeedFromAxis(_driverGamepad, Gamepad.Axes.LEFT_Y.getNumber());
        speed = applyDeadband(speed, Constants.DriveTrain.DEADBAND);
        return applySensitivityFactor(speed, Constants.DriveTrain.SENSITIVITY_LOW_GEAR);

    }

    public double getDriveRotation(DriveTrain.DriveMode driveMode) {
        double speed = driveMode == DriveTrain.DriveMode.ARCADE ?
                getSpeedFromAxis(_driverGamepad, Gamepad.Axes.LEFT_X.getNumber())
                : getSpeedFromAxis(_driverGamepad, Gamepad.Axes.RIGHT_X.getNumber());
        speed = applyDeadband(speed, Constants.DriveTrain.DEADBAND);
        return applySensitivityFactor(speed, Constants.DriveTrain.ROTATION_SENSITIVITY);

    }
    protected double getSpeedFromAxis(Joystick gamepad, int axisNumber) {
        return gamepad.getRawAxis(axisNumber);
    }

}
