// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public static final class CAN{

        //CAN for the drive motors
        public static final int FL = 0;
        public static final int FR = 1;
        public static final int BL = 2;
        public static final int BR = 3;

        //CAN for the TennisBallGrabber
        public static final int ELEVATOR = 4;
        public static final int WINCH = 5;

        // CAN for rapid react ball grabber
        public static final int ROLLER = 6;
    }

}
