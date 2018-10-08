package tddmicroexercises.tirepressuremonitoringsystem;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.junit.runner.RunWith;
import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class TestAlarm {

  @Mock
  private Sensor mockedSensor;

  @InjectMocks
  private Alarm alarm = new Alarm();

  @Test
  public void AlarmOnWhenPresureLessThan17() {
    // given
    when(mockedSensor.popNextPressurePsiValue()).thenReturn(16d);

    // when
    alarm.check();

    // then
    assertEquals(true, alarm.isAlarmOn());
  }

  @Test
  public void AlarmOnWhenPresureMoreThan21() {
    // given
    when(mockedSensor.popNextPressurePsiValue()).thenReturn(22d);

    // when
    alarm.check();

    // then
    assertEquals(true, alarm.isAlarmOn());
  }

  @Test
  public void AlarmOffwhenPresureBetween17And21() {
    // given
    when(mockedSensor.popNextPressurePsiValue()).thenReturn(19d);
 
    // when
    alarm.check();

    // then
    assertEquals(false, alarm.isAlarmOn());
  }
}
