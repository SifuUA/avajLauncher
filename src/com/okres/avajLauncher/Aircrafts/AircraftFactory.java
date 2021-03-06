package com.okres.avajLauncher.Aircrafts;

import com.okres.avajLauncher.Exception.MyException;

public class AircraftFactory {

    public static Flyable newAircraft(String type, String name, int longitude,
                                      int latitude, int height) throws MyException {
        if (longitude <= 0 || latitude <= 0 || height <= 0)
            throw new MyException("Coordinates are incorrect");
        if (type.equals("Baloon")) {
            return new Baloon(name, new Coordinates(longitude, latitude,
                    height));
        } else if (type.equals("JetPlane")) {
            return new JetPlane(name, new Coordinates(longitude, latitude,
                    height));
        } else if (type.equals("Helicopter")) {
            return new Helicopter(name, new Coordinates(longitude, latitude,
                    height));
        } else throw new MyException("Type of aircraft is incorrect");
    }
}
