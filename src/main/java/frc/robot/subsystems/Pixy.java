// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import io.github.pseudoresonance.pixy2api.Pixy2;
import io.github.pseudoresonance.pixy2api.links.SPILink;

public class Pixy extends SubsystemBase {
  private Pixy2 m_camera;

  /** Creates a new Pixy. */
  public Pixy() {
  }

  public void init() {
    m_camera = Pixy2.createInstance(new SPILink()); // Creates a new Pixy2 camera using SPILink
		m_camera.init(); // Initializes the camera and prepares to send/receive data
		m_camera.setLamp((byte) 1, (byte) 1); // Turns the LEDs on
		m_camera.setLED(200, 30, 255); // Sets the RGB LED to purple
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
