// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystem;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Subsystem_Act1 extends SubsystemBase {
  /** Creates a new Subsystem_Act1. */

  public Subsystem_Act1() {}

  // Other ways to create commands
  Command PB1_Option2 = Commands.runOnce(() -> System.out.println("Button Y was pressed"));
  Command PB2_Option2 = Commands.runOnce(() -> System.out.println("Button B was pressed"));
  Command PB3_Option2 = Commands.runOnce(() -> System.out.println("Button A was pressed"));



  // Commands
  public Command PressButton_Y() {
    return runOnce(() -> System.out.print("Button Y was pressed"));
  }

  public Command PressButton_B() {
    return runOnce(() -> System.out.println("Button B was pressed"));
  }

  public Command PressButton_A() {
    return runOnce(() -> System.out.println("Button A was pressed"));
  }



  int CounterValue = 0;

  public Command PrintName_Counter() {
    return runOnce(() -> {
      System.out.println("Ervey");
  }).until(() -> CounterValue >= 10);
  }

  public Command AddToCounter_Button() {
    return runOnce(() -> CounterValue += 1);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}