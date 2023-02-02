// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.util.Units;
import frc.lib.SwerveModuleConstants;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

  public static final class Ports{ 
        public static final int PIGEON_2 = 4;

        public static final int CLAW_LEFT_WHEELS = 12;
        public static final int CLAW_RIGHT_WHEELS = 11;

        public static final int ELEVATOR_A = 9;
        public static final int ELEVATOR_B = 10;

        public static final int WRIST = 13;
  }

  public static final class Elevator {
        // Elevator PID //
        public static final double ELEVATOR_KP = 0;
        public static final double ELEVATOR_KI = 0;
        public static final double ELEVATOR_KD = 0;

        // Elevator FF //
        public static final double ELEVATOR_KS = 0;
        public static final double ELEVATOR_KG = 0;
        public static final double ELEVATOR_KV = 0;

        // Shoulder PID //
        public static final double SHOULDER_KP = 0;
        public static final double SHOULDER_KI = 0;
        public static final double SHOULDER_KD = 0;

        // Shoulder FF //
        public static final double SHOULDER_KS = 0;
        public static final double SHOULDER_KG = 0;
        public static final double SHOULDER_KV = 0;
  }
  
  public static final class Wrist {

    public static final double KP = 0;
    public static final double KI = 0;
    public static final double KD = 0;
    public static final double KS = 0;
    public static final double KG = 0;
    public static final double KV = 0;

  }

  public static final class Swerve{

    public static final double DRIVE_KS = 0;
    public static final double DRIVE_KA = 0;
    public static final double DRIVE_KV = 0;
    public static final double DRIVE_GEAR_RATIO = (6.12 / 1); //6.12 : 1
    public static final double ANGLE_GEAR_RATIO = ((150 / 7) / 1); //150/7 : 1
    public static final boolean CANCONDER_INVERT = false;

    public static final double TRACK_WIDTH = Units.inchesToMeters(21.70);
    public static final double WHEEL_BASE = Units.inchesToMeters(21.70);
    public static final double WHEEL_DIAMETER = Units.inchesToMeters(4);
    public static final double WHEEL_CIRCUMFERENCE = WHEEL_DIAMETER * Math.PI;

    
    public static final boolean DRIVE_MOTOR_INVERT = false;
    public static final boolean ANGLE_MOTOR_INVERT = true;
    public static final double DRIVE_CLOSED_LOOP_RAMP = 0;
    public static final double DRIVE_OPEN_LOOP_RAMP = .25;
    public static final int ANGLE_MOTOR_SMART_CURRENT = 25;
    public static final double ANGLE_MOTOR_SECONDARY_LIMIT = 40;
    public static final int DRIVE_MOTOR_SMART_CURRENT = 35;
    public static final double DRIVE_MOTOR_SECONDARY_LIMIT = 60;
    public static final double ANGLE_MOTOR_KP = 0.008;
    public static final double ANGLE_MOTOR_KI = 0;
    public static final double ANGLE_MOTOR_KD = 0.000;
    public static final double DRIVE_MOTOR_KP = 0.1;
    public static final double DRIVE_MOTOR_KI = 0;
    public static final double DRIVE_MOTOR_KD = 0;
    public static final double DRIVE_MOTOR_KF = 0;
    public static final double DRIVE_MOTOR_MIN_OUTPUT = -1;
    public static final double DRIVE_MOTOR_MAX_OUTPUT = 1;
    public static final double DRIVE_MOTOR_POSITION_CONVERSION = WHEEL_CIRCUMFERENCE / DRIVE_GEAR_RATIO;
    public static final double DRIVE_MOTOR_VELOCITY_CONVERSION = (WHEEL_CIRCUMFERENCE / DRIVE_GEAR_RATIO) / 60;
    public static final SwerveDriveKinematics SWERVE_KINEMATICS = new SwerveDriveKinematics(
      new Translation2d(WHEEL_BASE / 2.0, TRACK_WIDTH / 2.0),
      new Translation2d(WHEEL_BASE / 2.0, -TRACK_WIDTH / 2.0),
      new Translation2d(-WHEEL_BASE / 2.0, TRACK_WIDTH / 2.0),
      new Translation2d(-WHEEL_BASE / 2.0, -TRACK_WIDTH / 2.0));
      
public static final boolean INVERT_GYRO = true;
public static final double MAX_ANGULAR_VELOCITY = 11.5;
public static final double MAX_SPEED = 4.5;

        public static final class Mod0 {
            public static final int driveMotorID = 1;
            public static final int angleMotorID = 2;
            public static final int canCoderID = 0;
            public static final double angleOffset = -224.208;
            public static final SwerveModuleConstants constants = new SwerveModuleConstants(driveMotorID, angleMotorID,
                    canCoderID, angleOffset);
        }

        /* Front Right Module - Module 1 */
        public static final class Mod1 {
            public static final int driveMotorID = 3;
            public static final int angleMotorID = 4;
            public static final int canCoderID = 1;
            public static final double angleOffset = -315;
            public static final SwerveModuleConstants constants = new SwerveModuleConstants(driveMotorID, angleMotorID,
                    canCoderID, angleOffset);
        }

        /* Back Left Module - Module 2 */
        public static final class Mod2 {
            public static final int driveMotorID = 5;
            public static final int angleMotorID = 6;
            public static final int canCoderID = 2;
            public static final double angleOffset = -202.5;
            public static final SwerveModuleConstants constants = new SwerveModuleConstants(driveMotorID, angleMotorID,
                    canCoderID, angleOffset);
        }

        /* Back Right Module - Module 3 */
        public static final class Mod3 {
            public static final int driveMotorID = 7;
            public static final int angleMotorID = 8;
            public static final int canCoderID = 3;
            public static final double angleOffset = -183.339;
            public static final SwerveModuleConstants constants = new SwerveModuleConstants(driveMotorID, angleMotorID,
                    canCoderID, angleOffset);
        }
  }

  public static final class AutoConstants {
    public static final double K_MAX_ANGULAR_SPEED_RADIANS_PER_SECOND = 0;
    public static final double K_MAX_ANGULAR_SPEED_RADIANS_PER_SECOND_SQUARED = 0;
  }
}