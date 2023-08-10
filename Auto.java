package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.ClassFactory;
import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaTrackables;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;
import org.openftc.easyopencv.OpenCvCamera;
import org.openftc.easyopencv.OpenCvCameraFactory;
import org.openftc.easyopencv.OpenCvCameraRotation;
import org.openftc.easyopencv.OpenCvInternalCamera;
import org.openftc.easyopencv.OpenCvPipeline;

import java.util.ArrayList;
import java.util.List;

/* Copyright (c) 2017 FIRST. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted (subject to the limitations in the disclaimer below) provided that
 * the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list
 * of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice, this
 * list of conditions and the following disclaimer in the documentation and/or
 * other materials provided with the distribution.
 *
 * Neither the name of FIRST nor the names of its contributors may be used to endorse or
 * promote products derived from this software without specific prior written permission.
 *
 * NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
 * LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

@Autonomous (name="Auto", group="Pushbot")
public class Auto extends OpMode {

    private ElapsedTime runtime = new ElapsedTime();
    public static DcMotor frontLeft;
    public static DcMotor frontRight;
    public static DcMotor backLeft;
    public static DcMotor backRight;
    public static DcMotor rightOut;
    public static DcMotor leftOut;
    public static DcMotor intake;

    Robot robot = new Robot(); // use the class created to define a Pushbot's hardware
    public static final double STRAFE_SPEED = 1;


    public void init() {

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


        telemetry.addData("Say", "Hello Driver");    //
    }


    /*
     * Code to run REPEATEDLY after the driver hits INIT, but before they hit PLAY
     */
    @Override
    public void init_loop() {

    }

    @Override
    public void start() {

    }

    @Override
    public void runAuto() throws InterruptedException{
        frontLeft.setDirection(DcMotor.Direction.REVERSE);
        backLeft.setDirection(DcMotor.Direction.REVERSE);
        leftOut.setDirection(DcMotor.Direction.REVERSE);

        //a wheel moves 8.32 millimeters per second//
        // Diameter of a wheel is 96 millimeters and it rotates 312 revolutions per minute//
        //There 60,000 milliseconds in a second so you divide 312 * 96 by 60,000//


        for (int i = 0; i < 4; i++){
            //Robot starts on the left of the field
            //Move forward till it hits a wall//
            frontLeft.setPower(1);
            backLeft.setPower(1);
            backRight.setPower(1);
            frontRight.setPower(1);
            Thread.sleep(5000);
            //Turn Right//
            frontLeft.setPower(1);
            backLeft.setPower(1);
            backRight.setPower(-1);
            frontRight.setPower(-1);
            Thread.sleep(1000);
            //Strafe Left//
            frontLeft.setPower(-1);
            backLeft.setPower(1);
            backRight.setPower(-1);
            frontRight.setPower(1);
            Thread.sleep(500);
            //Move Backwards
            frontLeft.setPower(-1);
            backLeft.setPower(-1);
            backRight.setPower(-1);
            frontRight.setPower(-1);
            Thread.sleep(5000);

            telemetry.addData("Cycle %d complete", i+1);

        }

        telemetry.addData ("Autonomus succeeded!","Thank you for flying socor bot airlines.");

    }
}