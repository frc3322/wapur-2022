// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.CAN;

public class BucketGrabber extends SubsystemBase {
  private final CANSparkMax BucketGrabberMotor = new CANSparkMax(CAN.BUCKET_GRABBER, MotorType.kBrushless);

  /** Creates a new ExampleSubsystem. */
  public BucketGrabber() {
    BucketGrabberMotor.setIdleMode(IdleMode.kBrake);

    BucketGrabberMotor.burnFlash();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void setPower(double power) {
    BucketGrabberMotor.set(power);
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
