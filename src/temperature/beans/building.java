package temperature.beans;
import java.time.LocalDateTime; 
public class building {
    private String name;
    private String area;
    private double floor;
    private LocalDateTime opendatetime;
    private LocalDateTime closedatetime;

    //getters and setters
    public String getName() {
        return name;
    }       
public void setName(String name) {
        this.name = name;
    }                   



public String getArea() {
        return area;
    }           

public void setArea(String area) {
        this.area = area;
    }
public double getFloor() {
        return floor;
    }
public void setFloor(double floor) {
        this.floor = floor;
    }   
public localDateTime getOpendatetime() {
        return opendatetime;
    }   
public void setOpendatetime(LocalDateTime opendatetime) {
        this.opendatetime = opendatetime;       

    }           
public LocalDateTime getClosedatetime() {
        return closedatetime;
    }       



}
