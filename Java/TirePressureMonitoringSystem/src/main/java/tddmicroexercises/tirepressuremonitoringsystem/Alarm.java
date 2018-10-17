package tddmicroexercises.tirepressuremonitoringsystem;

public class Alarm {
  private Sensor sensor;
  private PressureLimit presureLimit;
  private boolean alarmOn;

  public Alarm() {
    this.sensor = new Sensor();
    this.presureLimit = new PressureLimit();
  }

  public void check() {
    if (this.presureLimit.IsAbnormal(sensor.popNextPressurePsiValue())) {
      alarmOn = true;
    }
  }

  public boolean isAlarmOn() {
    return alarmOn; 
  }
}
