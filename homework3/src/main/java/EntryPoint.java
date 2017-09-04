import pojo.Car;
import pojo.Driver;
import pojo.DriverName;

import java.util.Optional;

public class EntryPoint {
    public static void main(String[] args) {


        Optional.of(new Car())
        .map(Car::getDriver)
        .map(Driver::getDriverName)
        .map(DriverName::getName);





    }

}
