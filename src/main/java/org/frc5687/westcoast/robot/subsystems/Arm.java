package org.frc5687.westcoast.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.frc5687.westcoast.robot.Robot;
import edu.wpi.first.wpilibj.VictorSP;
import org.frc5687.westcoast.robot.RobotMap;


public class Arm extends Subsystem {
    private Robot _robot;
    private VictorSP _motor;
    @Override
    protected void initDefaultCommand() {
    }
    public void drive(double speed){
        _motor.setSpeed(speed);
    }

    public Arm(Robot robot) {
        _robot = robot;
        _motor = new VictorSP(RobotMap.PWM.ARM_MOTOR);
    }
}
