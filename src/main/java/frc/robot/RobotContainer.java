// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystem.Subsystem_Act1;
import frc.robot.subsystem.Subsystem_Act1_Name;

public class RobotContainer {

  // Variables
  CommandXboxController CommandController = new CommandXboxController(0);
  private final Subsystem_Act1 Sub_Buttons = new Subsystem_Act1();
  private final Subsystem_Act1_Name Sub_Names = new Subsystem_Act1_Name();
  

  public RobotContainer() {
    configureBindings();
  }

  // EVENTOS
  private void configureBindings() {

    CommandController.y()
    .onTrue(Sub_Buttons.PressButton_Y());

    CommandController.b()
    .onTrue(Sub_Names.Name_Ervey());

    CommandController.a()
    .onTrue(Sub_Buttons.PressButton_A().alongWith(Sub_Names.Name_Ervey()));



    CommandController.x()
    .onTrue(Sub_Buttons.AddToCounter_Button().alongWith(Sub_Buttons.PrintName_Counter()));

  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
