package temperature.beans;

public class Sensor {
    private String name;
    private int sensorId;
    private String temperaturedate;

    //getter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSensorId() {
        return sensorId;
    }
    public void setSensorId(int sensorId) {
        this.sensorId = sensorId;
    }
    public String getTemperaturedate() {
        return temperaturedate;
    }
    public void setTemperaturedate(String temperaturedate) {
        this.temperaturedate = temperaturedate;
    }
    
    
}
