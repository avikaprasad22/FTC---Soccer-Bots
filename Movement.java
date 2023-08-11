package org.firstinspires.ftc.teamcode;

public abstract class Movement extends HardwareMap {
    public static void MoveForward(long milliseconds, double speed) throws InterruptedException{
        frontLeft.setPower(speed);
        backLeft.setPower(speed);
        backRight.setPower(speed);
        frontRight.setPower(speed);
        Thread.sleep(milliseconds);
        frontLeft.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);
        frontRight.setPower(0);
    }
    public static void MoveBackward(long milliseconds, double speed) throws InterruptedException{
        frontLeft.setPower(-speed);
        backLeft.setPower(-speed);
        backRight.setPower(-speed);
        frontRight.setPower(-speed);
        Thread.sleep(milliseconds);
        frontLeft.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);
        frontRight.setPower(0);
    }
    public static void TurnRight(long milliseconds, double speed) throws InterruptedException{
        frontLeft.setPower(speed);
        backLeft.setPower(speed);
        backRight.setPower(-speed);
        frontRight.setPower(-speed);
        Thread.sleep(milliseconds);
        frontLeft.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);
        frontRight.setPower(0);
    }
    public static void TurnLeft(long milliseconds, double speed) throws InterruptedException{
        frontLeft.setPower(-speed);
        backLeft.setPower(-speed);
        backRight.setPower(speed);
        frontRight.setPower(speed);
        Thread.sleep(milliseconds);
        frontLeft.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);
        frontRight.setPower(0);
    }
    public static void StrafeLeft(long milliseconds, double speed) throws InterruptedException{
        frontLeft.setPower(-speed);
        backLeft.setPower(speed);
        backRight.setPower(-speed);
        frontRight.setPower(speed);
        Thread.sleep(milliseconds);
        frontLeft.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);
        frontRight.setPower(0);
    }
    public static void StrafeRight(long milliseconds, double speed) throws InterruptedException{
        frontLeft.setPower(speed);
        backLeft.setPower(-speed);
        backRight.setPower(speed);
        frontRight.setPower(-speed);
        Thread.sleep(milliseconds);
        frontLeft.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);
        frontRight.setPower(0);
    }

    public abstract void start();

    public abstract void loop() throws InterruptedException;
}