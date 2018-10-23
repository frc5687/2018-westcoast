package org.frc5687.westcoast.robot;

import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * Created by Ben Bernard on 10/23/2018.
 */
public class Robot extends TimedRobot {
    private AHRS _imu;

    @Override
    public void robotInit() {
        setPeriod(1 / Constants.CYCLES_PER_SECOND);
        LiveWindow.disableAllTelemetry();

        _imu = new AHRS(SPI.Port.kMXP, (byte) 100);

    }
    @Override
    public void teleopInit() {
    }

    @Override
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        updateDashboard();
    }


    public void updateDashboard() {
    }

}