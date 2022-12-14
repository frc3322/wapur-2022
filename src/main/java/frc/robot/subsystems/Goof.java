// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;



import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.CAN;

public class Goof extends SubsystemBase {
  /** Creates a new goof. */
  
  //Possible color palletes: Lime Green and Pink, Cyan and Pink
  private final Spark blinkin = new Spark(CAN.LED);

  // Set color voltages
  public final double LIMEGREEN = 0.73;
  public final double PINK = 0.57;
  public final double CYAN = 0.81;
  public final double fireLarge = -0.57;
  public final double CONFETTI = -0.87;
  public final double RAINBOW = -0.45;

  public Goof() {

  }

  public void setPattern(double patternID){
    blinkin.set(patternID);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}