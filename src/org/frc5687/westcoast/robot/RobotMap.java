package org.frc5687.westcoast.robot;

public class RobotMap {

    public static class CAN {
        public static final int LEFT_MASTER = 1;
        public static final int RIGHT_MASTER = 0;
        public static final int LEFT_FOLLOWER_A = 0;
        public static final int LEFT_FOLLOWER_B = 2;
        public static final int RIGHT_FOLLOWER_A = 1;
        public static final int RIGHT_FOLLOWER_B = 3;

    }

    public static class PWM {
        public static final int ARM_MOTOR = 1;
        public static final int INTAKE_MOTOR = 0;
    }

    public static class PCM {
        public static final int LEFT_PINCER_OPEN = 0;
        public static final int LEFT_PINCER_CLOSE = 1;
        public static final int RIGHT_PINCER_OPEN = 2;
        public static final int RIGHT_PINCER_CLOSE = 3;
        public static final int SHIFTER_HIGH = 4;
        public static final int SHIFTER_LOW = 5;
    }

    public static class PDP {
        public static final int ARM_VICTOR = 3;
        public static final int INTAKE_VICTOR = 14;
    }

    public static class Analog {
        public static final int POTENTIOMETER = 0;
        public static final int POSITION_SELECTOR = 1;
    }
}
