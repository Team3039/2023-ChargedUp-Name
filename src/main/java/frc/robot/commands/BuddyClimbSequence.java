// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.RobotContainer;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class BuddyClimbSequence extends SequentialCommandGroup {
  /** Creates a new BuddyClimbSequence. */
  public BuddyClimbSequence() {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(
      new InstantCommand(() -> RobotContainer.buddyClimb.setLift(true)),
      new InstantCommand(() -> RobotContainer.buddyClimb.setWinch(80)),
      new WaitCommand(5.0),
      new InstantCommand(() -> RobotContainer.buddyClimb.setWinch(0)),
      new InstantCommand(() -> RobotContainer.buddyClimb.setLift(false))
                );
  }
}
