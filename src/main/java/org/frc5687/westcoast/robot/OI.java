package org.frc5687.westcoast.robot;

import edu.wpi.first.wpilibj.Joystick;
import org.frc5687.westcoast.robot.subsystems.DriveTrain;
import org.frc5687.westcoast.robot.subsystems.Shifter;
import org.frc5687.westcoast.robot.utils.Gamepad;
import org.frc5687.westcoast.robot.utils.Helpers;

import static org.frc5687.westcoast.robot.utils.Helpers.applyDeadband;
import static org.frc5687.westcoast.robot.utils.Helpers.applySensitivityFactor;


public class OI {
    protected Gamepad _driverGamepad;

    public OI(){
        _driverGamepad = new Gamepad(0);
    }

    private Shifter.Gear _gear = Shifter.Gear.LOW;


    public double getLeftSpeed() {
        double speed = -getSpeedFromAxis(_driverGamepad, Gamepad.Axes.LEFT_Y.getNumber());
        speed = Helpers.applyDeadband(speed, Constants.DriveTrain.DEADBAND);
        double sensitivity = _gear == Shifter.Gear.LOW ? Constants.DriveTrain.SENSITIVITY_LOW_GEAR : Constants.DriveTrain.SENSITIVITY_HIGH_GEAR;
        speed = Helpers.applyDeadband(speed, sensitivity);


        return speed;

    }

    public double getRightSpeed() {
        double speed = -getSpeedFromAxis(_driverGamepad, Gamepad.Axes.RIGHT_Y.getNumber());
        speed = Helpers.applyDeadband(speed, Constants.DriveTrain.DEADBAND);
        double sensitivity = _gear == Shifter.Gear.LOW ? Constants.DriveTrain.SENSITIVITY_LOW_GEAR : Constants.DriveTrain.SENSITIVITY_HIGH_GEAR;
        speed = Helpers.applySensitivityFactor(speed, sensitivity);

        return speed;
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
