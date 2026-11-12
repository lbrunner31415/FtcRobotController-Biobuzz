package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class IfPractice extends OpMode {

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        boolean aButton = gamepad1.a;
                if(aButton) {
                    telemetry.addData("A button", "Pressed!");
                } else {
                    telemetry.addData("A button", "Not Pressed.");
                }
                telemetry.addData("A Button State", aButton);
                double leftY = gamepad1.left_stick_y;

                if (leftY<0){
                    telemetry.addData("Left Stick", "Is negative");
                } else if (leftY>0) {
                    telemetry.addData("Left Stick", "is greater than 0!");
                } else {
                    telemetry.addData("Left Stick", "is Zero!");
        }
                telemetry.addData("Left Stick value", leftY);
    }
}
