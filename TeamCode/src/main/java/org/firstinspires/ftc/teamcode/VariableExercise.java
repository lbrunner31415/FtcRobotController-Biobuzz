package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@Disabled
@TeleOp
public class VariableExercise extends OpMode {
    @Override
    public void init() {
        int teamNumber = 21377;
        String teamName = "Botsworth";
        double motorSpeed = 0.5;
        boolean touchSensor = false;
        int motorAngle = 0;

        telemetry.addData("Tean Number", teamNumber);
        telemetry.addData("Team Name", teamName);
        telemetry.addData("Motor speed", motorSpeed);
        telemetry.addData("Touch Sensor", touchSensor);
        telemetry.addData("Motor angle", motorAngle);
    }

    @Override
    public void loop() {

    }
}
