package org.frc5687.westcoast.robot.subsystems;

import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.frc5687.westcoast.robot.OI;
import org.frc5687.westcoast.robot.commands.TeleDrive;
import sun.security.krb5.internal.crypto.Aes128CtsHmacSha1EType;

public class DriveTrain extends Subsystem {

    // Subsystem references here
    private OI _oi;
    private AHRS _imu;

    // TODO: Add member variables for motor controllers here

    public DriveTrain(OI oi, AHRS imu) {
        _oi = oi;
        _imu = imu;

        // TODO: Initialize motor controllers here
    }

    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new TeleDrive(_oi, this));
    }

    public void tankDrive(double leftSpeed, double rightSpeed) {
        // TODO: Implement tank drive logic here!
    }
}

