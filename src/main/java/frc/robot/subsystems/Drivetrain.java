// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import frc.robot.Constants.CAN;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  public Drivetrain() {
    final CANSparkMax FLMotor = new CANSparkMax(CAN.FL, MotorType.kBrushless);
    final CANSparkMax FRMotor = new CANSparkMax(CAN.FR, MotorType.kBrushless);
    final CANSparkMax BLMotor = new CANSparkMax(CAN.BL, MotorType.kBrushless);
    final CANSparkMax BRMotor = new CANSparkMax(CAN.BR, MotorType.kBrushless);
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
