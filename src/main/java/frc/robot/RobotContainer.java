// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.BucketGrabber;
import frc.robot.subsystems.TennisBallGrabber;
import frc.robot.subsystems.RapidReactGrabber;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.StartEndCommand;


/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();
  private final Drivetrain drivetrain = new Drivetrain();
  private final BucketGrabber bucketGrab = new BucketGrabber();
  private final TennisBallGrabber tennisGrab = new TennisBallGrabber();
  private final RapidReactGrabber rapidReactGrabber = new RapidReactGrabber();

  private final CommandXboxController driverController = new CommandXboxController(0);

  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);
  private final Command driveCommand = new RunCommand(
    ()->{
      double left = MathUtil.applyDeadband(driverController.getLeftY()/4, 0.09);
      double right = MathUtil.applyDeadband(driverController.getRightY()/4, 0.08);
      drivetrain.tankDrive(left, right);
    }
    , drivetrain);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();

    drivetrain.setDefaultCommand(driveCommand);
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    driverController.x().whenHeld(new StartEndCommand(
      () -> {
        //onInit
        bucketGrab.setPower(0.05);
      },
      () -> {
        //onEnd
        bucketGrab.setPower(0.0);
      },
      //target subsystem 
      bucketGrab
      ));
    
    driverController.y().whenHeld(new StartEndCommand(
      () -> {
        //onInit
        bucketGrab.setPower(-0.05);;
      },
      () -> {
        //onEnd
        bucketGrab.setPower(0);
      }, 
      //target subsystem
      bucketGrab
      
    ));
    driverController.x().whenHeld(new StartEndCommand(
      () -> {
        //onInit
        bucketGrab.setPower(0.05);
      },
      () -> {
        //onEnd
        bucketGrab.setPower(0.0);
      },
      //target subsystem 
      bucketGrab
      ));
    
    driverController.leftBumper().whenHeld(new StartEndCommand(
      () -> {
        //onInit
        tennisGrab.setPowerWinch(0.05);;
      },
      () -> {
        //onEnd
        tennisGrab.setPowerWinch(0);
      }, 
      //target subsystem
      tennisGrab
      
    ));
    driverController.rightBumper().whenHeld(new StartEndCommand(
      () -> {
        //onInit
        tennisGrab.setPowerWinch(-0.05);;
      },
      () -> {
        //onEnd
        tennisGrab.setPowerWinch(0);
      }, 
      //target subsystem
      tennisGrab
      
    ));

    /*driverController.a().whenHeld(new StartEndCommand(
      () -> {
        //onInit
        rapidReactGrabber.setPower(0.01);
      },
      () -> {
        //onEnd
        rapidReactGrabber.setPower(0.0);
      },
      // target subsystem      
      rapidReactGrabber
      ));
   
    driverController.b().whenHeld(new StartEndCommand(
      () -> {
        //onInit
        rapidReactGrabber.setPower(-0.01);
      },
      () -> {
        //onEnd
        rapidReactGrabber.setPower(0);
      },
      //target subsystem
      rapidReactGrabber
    ));*/

    
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
}
