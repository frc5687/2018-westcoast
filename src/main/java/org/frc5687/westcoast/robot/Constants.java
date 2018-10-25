package org.frc5687.westcoast.robot;

/**
 * Created by Ben Bernard on 10/23/2018.
 */
public class Constants {
    public static final int CYCLES_PER_SECOND = 50;

    public static class DriveTrain {
        public static final double DEADBAND = 0.01;
        public static final double SENSITIVITY_LOW_GEAR = 0.1;
        public static final double SENSITIVITY_HIGH_GEAR = 0.3;
        public static final double ROTATION_SENSITIVITY = 0.3;

        public static final double HIGH_POW = 1.0;
        public static final double LOW_POW = -HIGH_POW;

        public static final boolean LEFT_MOTORS_INVERTED = false;
        public static final boolean RIGHT_MOTORS_INVERTED = true;

        public static class Encoders {

            public static final boolean REVERSED = true; //TODO change to new robot specifications
            public static final int SAMPLES_TO_AVERAGE = 20;
            public static final int PULSES_PER_ROTATION = 4096; // 1024 in quad mode. talon is 4096.

            public class WheelDiameter {
                public static final double INCHES = 6; //TODO: confirm wheel diameters!
                public static final double METERS = 0.1524; // TODO: Confirm!
            }
            public static final double GEAR_RATIO = 3.0; // TODO: Confirm!
            public class DistancePerRotation {
                public static final double INCHES = Math.PI * WheelDiameter.INCHES * GEAR_RATIO;
                public static final double METERS = Math.PI * WheelDiameter.METERS;
            }

            public class DistancePerPulse {
                public static final double INCHES = DistancePerRotation.INCHES / PULSES_PER_ROTATION;
            }

            public static final double SCALAR_RATIO = 8; // TODO: Confirm!
            public static final double MAX_PERIOD = 5;

            public class Track {
                public static final double INCHES = 24; // TODO: Confirm!
                public static final double METERS = 0.6096; // TODO: Confirm!
            }

            public static final double INCHES_PER_PULSE = DistancePerPulse.INCHES;

        }

    }
}
