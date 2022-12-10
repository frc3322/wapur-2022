// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
 
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.CAN;
 
public class RapidReactGrabber extends SubsystemBase {
 
private final CANSparkMax roller = new CANSparkMax(CAN.ROLLER, MotorType.kBrushless);
private final Compressor rrCompressor = new Compressor(1, PneumaticsModuleType.CTREPCM);
//private final DoubleSolenoid rrSolenoid = new DoubleSolenoid(PneumaticsModuleType.REVPH, CAN.forwardSolenoid, CAN.backwardSolenoid);

  /** Creates a new ExampleSubsystem. */
  public RapidReactGrabber() {
    roller.setIdleMode(IdleMode.kBrake);
 
    roller.burnFlash();
  }
 
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
 
  public void setPower(double power) {
    roller.set(power);
  }
 
  @Override
  public void simulationPeriodic() {
   // SmartDashboard.putData("pressure", rrCompressor.);
    // This method will be called once per scheduler run during simulation
  }

  // public void extendIntake(){
  //   rrSolenoid.set(Value.kForward);
  // }

  // public void retractIntake(){
  //   rrSolenoid.set(Value.kReverse);
  // }

  // public void compOn(){
  //   rrCompressor.enableDigital();
  // }

  // public void compOff(){
  //   rrCompressor.disable();
  // }
}
