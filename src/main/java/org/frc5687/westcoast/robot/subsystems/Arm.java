package org.frc5687.westcoast.robot.subsystems;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.frc5687.westcoast.robot.Robot;
import edu.wpi.first.wpilibj.VictorSP;
import org.frc5687.westcoast.robot.RobotMap;
import org.frc5687.westcoast.robot.utils.AnglePotentiometer;
import org.frc5687.westcoast.robot.Constants;

public class Arm extends Subsystem {
    private Robot _robot;
    private VictorSP _motor;
    private AnglePotentiometer _pot;
    @Override
    protected void initDefaultCommand() {
    }
    public void drive(double speed){
        if(getAngle() >= Constants.Arm.ANGLE_MAX || getAngle() <= Constants.Arm.ANGLE_MIN){
            DriverStation.reportError(("Angle limit reached"), false);
        }
        else{
            _motor.setSpeed(speed);
        }
    }


    public Arm(Robot robot) {
        _robot = robot;
        _motor = new VictorSP(RobotMap.PWM.ARM_MOTOR);
        _pot = new AnglePotentiometer(RobotMap.Analog.ARM_POTENTIOMETER, Constants.Arm.ANGLE_MIN,
                Constants.Arm.POT_MIN, Constants.Arm.ANGLE_MAX,  Constants.Arm.POT_MAX);
    }
    public double getPot() {
        return _pot.get();
    }

    public double getAngle() {
        return getPot();
    }
}
