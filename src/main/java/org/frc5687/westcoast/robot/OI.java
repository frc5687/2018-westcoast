package org.frc5687.westcoast.robot;

import edu.wpi.first.wpilibj.Joystick;
import org.frc5687.westcoast.robot.utils.Gamepad;
import static org.frc5687.westcoast.robot.utils.Helpers.*;
import org.frc5687.westcoast.robot.Constants;

public class OI {
    protected Gamepad _driverGamepad;
    protected Gamepad _operatorGamepad;


    public OI(){
        _driverGamepad = new Gamepad(0);
        _operatorGamepad = new Gamepad(1);
    }


    public double getLeftSpeed() {
        // TODO: Implement!
        return 0;
    }

    public double getRightSpeed() {
        // TODO: Implement!
        return 0;
    }
    protected double getSpeedFromAxis(Joystick gamepad, int axisNumber) {
        return gamepad.getRawAxis(axisNumber);
    }
    public double getArmSpeed(){
        double speed = -getSpeedFromAxis(_operatorGamepad, 5) * Constants.Arm.SPEED_MAX;
        speed = applyDeadband(speed, Constants.Arm.DEADBAND);
        return applySensitivityFactor(speed, Constants.Arm.SENSITIVITY);
    }

}
