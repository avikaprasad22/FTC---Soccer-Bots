package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

public class HardwareMap {
    HardwareMap hwMap =  null;
    private final ElapsedTime period = new ElapsedTime();
    public static DcMotor frontLeft;
    public static DcMotor frontRight;
    public static DcMotor backLeft;
    public static DcMotor backRight;
    public static DcMotor rightOut;
    public static DcMotor leftOut;
    public static DcMotor intake;

    public HardwareMap(){

    }
    public void init(HardwareMap ahwMap) {

        hwMap = ahwMap;

        frontLeft = hardwareMap.dcMotor.get("frontLeft");
        backLeft = hardwareMap.dcMotor.get("backLeft");
        frontRight = hardwareMap.dcMotor.get("frontRight");
        backRight = hardwareMap.dcMotor.get("backRight");
        rightOut = hardwareMap.dcMotor.get("rightOut");
        leftOut = hardwareMap.dcMotor.get("leftOut");
        intake = hardwareMap.dcMotor.get("intake");

        frontLeft.setDirection(DcMotor.Direction.REVERSE);
        backLeft.setDirection(DcMotor.Direction.REVERSE);
        leftOut.setDirection(DcMotor.Direction.REVERSE);
    }
}
