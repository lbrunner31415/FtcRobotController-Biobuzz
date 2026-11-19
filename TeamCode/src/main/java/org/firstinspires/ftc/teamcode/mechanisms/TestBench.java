package org.firstinspires.ftc.teamcode.mechanisms;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;
public class TestBench{

    private DigitalChannel touchSensor;
    private DcMotor motor;
    private double ticksPerRev;

    public void init(HardwareMap
                             hwMap){
        motor = hwMap.get(DcMotor.class, "motor");
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        touchSensor = hwMap.get(DigitalChannel.class, "touch_sensor");
        telemetry.addLine("siuhfgljaufhd");
        touchSensor.setMode(DigitalChannel.Mode.INPUT);
        ticksPerRev = motor.getMotorType().getTicksPerRev();
    }
    public double getMotorRevs(){
        return  motor.getCurrentPosition() / ticksPerRev;
    }
    public void setMotorSpeed(double speed){
        motor.setPower(speed);
    }
    public boolean isTouchSensorState(){
        return  !touchSensor.getState();
    }
}
