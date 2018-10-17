package tddmicroexercises.tirepressuremonitoringsystem;

public class PressureLimit {

  private static final double LOW_PRESSURE_THRESHOLD = 17;
  private static final double HIGH_PRESSURE_THRESHOLD = 21;

  public boolean IsAbnormal(double value) {
     return this.isTooLow(value) || this.isTooHigh(value);
  }

  private boolean isTooLow(double value) {
    return value < LOW_PRESSURE_THRESHOLD;
  }

  private boolean isTooHigh(double value) {
    return value > HIGH_PRESSURE_THRESHOLD;
  }
}
