// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
  private final CANSparkMax driveLeftSpark = new CANSparkMax(1, MotorType.kBrushless);
  private final CANSparkMax driveRightSpark = new CANSparkMax(2, MotorType.kBrushless);
  private final VictorSPX driveLeftVictor = new VictorSPX(3);
  private final VictorSPX driveRightVictor = new VictorSPX(4);
  
  public void drive(Double leftSpeed, Double rightSpeed) {
    driveLeftSpark.set(leftSpeed);
    driveLeftVictor.set(ControlMode.PercentOutput, leftSpeed);
    driveRightSpark.set(rightSpeed);
    driveRightVictor.set(ControlMode.PercentOutput, rightSpeed);
  }

  
}
