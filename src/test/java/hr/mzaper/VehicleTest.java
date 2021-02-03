package hr.mzaper;

import hr.mzaper.model.vehicle.Car;
import hr.mzaper.model.vehicle.Vehicle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VehicleTest {

    @Test
    public  void shouldReturnTrueIfGasPercentageBetweenZeroAndHundred(){

        Vehicle v=new Car();
        Assertions.assertTrue(v.getGasPercentage()<=100 && v.getGasPercentage()>=0);
    }

    @Test
    public  void shouldReturnFalseIfGasPercentageGreaterThanHundredOrLowerThanZero(){

        Vehicle v=new Car();
        Assertions.assertFalse(v.getGasPercentage()>100 && v.getGasPercentage()<0);
    }

}
