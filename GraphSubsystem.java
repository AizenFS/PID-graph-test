
package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
public class GraphSubsystem extends SubsystemBase {
    NetworkTableEntry P,I,D;
 
    public GraphSubsystem() {
        
        setupShuffleboard();
    }
    private void setupShuffleboard() {

        ShuffleboardTab PIDGraph = Shuffleboard.getTab("PID graph");
        P = PIDGraph.add("P", 5);
        I = PIDGraph.add("I", 7);
        D = PIDGraph.add("D", 4);   
    }
    public void publishTelemetry() {
            
        SmartDashboard.putNumber("P", 5);
        SmartDashboard.putNumber("I", 7);
        SmartDashboard.putNumber("D", 4);
    }
    public void periodic() {
        publishTelemetry();
    }
}
