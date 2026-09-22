// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystem;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Subsystem_Act1_Name extends SubsystemBase {
  /** Creates a new Subsystem_Act1_Name. */

  public Subsystem_Act1_Name() {}

  Command NE = Commands.runOnce(() -> System.out.println("Ervey"));

  public Command Name_Ervey() {
    return runOnce(() -> System.out.println("Ervey"));
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
