// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.CAN;

public class TennisBallGrabber extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  private final CANSparkMax ElevatorMotor = new CANSparkMax(CAN.ELEVATOR, MotorType.kBrushless);
  private final CANSparkMax WinchMotor = new CANSparkMax(CAN.WINCH, MotorType.kBrushless);

  public TennisBallGrabber() {
    
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
