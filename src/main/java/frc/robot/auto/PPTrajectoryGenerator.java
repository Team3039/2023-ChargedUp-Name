// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.auto;

import java.util.List;

import com.pathplanner.lib.PathConstraints;
import com.pathplanner.lib.PathPlanner;
import com.pathplanner.lib.PathPlannerTrajectory;
import com.pathplanner.lib.PathPoint;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.geometry.Translation2d;

/** Add your docs here. */
public class PPTrajectoryGenerator {
    public static PPTrajectoryGenerator INSTANCE = new PPTrajectoryGenerator();

    public static PathPlannerTrajectory getTestPath() {
        return PathPlanner.loadPath("Test Code", 
                new PathConstraints(1.0, 3));
    }
    
    public static PathPlannerTrajectory getForwardTestPath() {
        return PathPlanner.loadPath("Forward Path", 
                new PathConstraints(1.0, 3));
    }
    
    public static PathPlannerTrajectory getReverseTestPath() {
        return PathPlanner.loadPath("Reverse Path", 
                new PathConstraints(1.0, 3));
    }

    public static PathPlannerTrajectory getPathThreePiece() {
        return PathPlanner.loadPath("Bottom 3 Piece YYP", 
            new PathConstraints(1.0, 3));
}
    }
