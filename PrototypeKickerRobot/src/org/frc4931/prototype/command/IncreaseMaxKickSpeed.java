/*
 * Copyright (c) FIRST 2008-2013. All Rights Reserved.
 * Open Source Software - may be modified and shared by FRC teams. The code
 * must be accompanied by the FIRST BSD license file in the root directory of
 * the project.
 */
package org.frc4931.prototype.command;

/**
 * A command used to increase the maximum speed of the robot.
 */
public class IncreaseMaxKickSpeed extends ChangeMaxKickSpeed {

    public IncreaseMaxKickSpeed( double delta ) {
        super(delta);
    }

    public String toString() {
        return "Increase the maximum drive speed by " + delta + "%";
    }
}
