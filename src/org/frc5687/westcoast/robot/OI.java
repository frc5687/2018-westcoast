package org.frc5687.westcoast.robot;

import org.frc5687.westcoast.robot.utils.Gamepad;

public class OI {
    protected Gamepad _driverGamepad;

    public OI(){
        _driverGamepad = new Gamepad(0);
    }


    public double getLeftSpeed() {
        double speed = -getSpeedFromAxis(_driverGamepad, Gamepad.Axes.LEFT_Y.getNumber());
        speed = Helpers.applyDeadband(speed, Constants.DriveTrain.DEADBAND);
        SmartDashboard.putNumber("DriveTrain/LeftRaw", speed);
        double sensitivity = _gear == Shifter.Gear.LOW ? Constants.DriveTrain.SENSITIVITY_LOW_GEAR : Constants.DriveTrain.SENSITIVITY_HIGH_GEAR;
        speed = Helpers.applySensitivityFactor(speed, sensitivity);
        SmartDashboard.putNumber("DriveTrain/LeftScaled", speed);
        return 0;
    }

    public double getRightSpeed() {
        double speed = -getSpeedFromAxis(_driverGamepad, Gamepad.Axes.RIGHT_Y.getNumber());
        speed = Helpers.applyDeadband(speed, Constants.DriveTrain.DEADBAND);
        SmartDashboard.putNumber("DriveTrain/RightRaw", speed);
        double sensitivity = _gear == Shifter.Gear.LOW ? Constants.DriveTrain.SENSITIVITY_LOW_GEAR : Constants.DriveTrain.SENSITIVITY_HIGH_GEAR;
        speed = Helpers.applySensitivityFactor(speed, sensitivity);
        SmartDashboard.putNumber("DriveTrain/RightScaled", speed);
        return 0;
    }

}