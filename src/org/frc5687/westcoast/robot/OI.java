package org.frc5687.westcoast.robot;

import org.frc5687.westcoast.robot.utils.Gamepad;

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

}
