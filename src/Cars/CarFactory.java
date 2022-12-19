package Cars;

import Cars.Car;

public class CarFactory {

    public static Car createFactory(Class aClass)throws IllegalAccessException,InstantiationException{
        return (Car) aClass.newInstance();
    }
}
