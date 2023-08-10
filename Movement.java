package org.firstinspires.ftc.teamcode;

import org.firstinspires.ftc.teamcode.Auto;

public class Movement extends Auto {
    public static void MoveForward(int seconds, int speed) throws InterruptedException{
        frontLeft.setPower(speed);
        backLeft.setPower(speed);
        backRight.setPower(speed);
        frontRight.setPower(speed);
        Thread.sleep(seconds*1000);
        frontLeft.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);
        frontRight.setPower(0);
    }
    public static void MoveBackward(int seconds, int speed) throws InterruptedException{
        frontLeft.setPower(-speed);
        backLeft.setPower(-speed);
        backRight.setPower(-speed);
        frontRight.setPower(-speed);
        Thread.sleep(seconds*1000);
        frontLeft.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);
        frontRight.setPower(0);
    }
    public static void TurnRight(int seconds, int speed) throws InterruptedException{
        frontLeft.setPower(speed);
        backLeft.setPower(speed);
        backRight.setPower(-speed);
        frontRight.setPower(-speed);
        Thread.sleep(seconds*1000);
        frontLeft.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);
        frontRight.setPower(0);
    }
    public static void TurnLeft(int seconds, int speed) throws InterruptedException{
        frontLeft.setPower(-speed);
        backLeft.setPower(-speed);
        backRight.setPower(speed);
        frontRight.setPower(speed);
        Thread.sleep(seconds*1000);
        frontLeft.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);
        frontRight.setPower(0);
    }
    public static void StrafeLeft(int seconds, int speed) throws InterruptedException{
        frontLeft.setPower(-speed);
        backLeft.setPower(speed);
        backRight.setPower(-speed);
        frontRight.setPower(speed);
        Thread.sleep(seconds*1000);
        frontLeft.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);
        frontRight.setPower(0);
    }
    public static void StrafeRight(int seconds, int speed) throws InterruptedException{
        frontLeft.setPower(speed);
        backLeft.setPower(-speed);
        backRight.setPower(speed);
        frontRight.setPower(-speed);
        Thread.sleep(seconds*1000);
        frontLeft.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);
        frontRight.setPower(0);
    }
}