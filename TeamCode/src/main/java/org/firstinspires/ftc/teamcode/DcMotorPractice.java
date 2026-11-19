package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.TestBench;

@TeleOp
public class DcMotorPractice extends OpMode {
    TestBench bench = new TestBench();
    @Override
    public void init() {
        telemetry.addLine("inside of dcmotor class init");
    }

    @Override
    public void loop() {
        telemetry.addLine("inside of void loop");
      if(bench.isTouchSensorState()){
          bench.setMotorSpeed((0.5));
          telemetry.addLine("inside is touch seneor");
      }
      else{
          bench.setMotorSpeed(0.0);
      }
      telemetry.addData("Motor Revs", bench.getMotorRevs());
    }
}
