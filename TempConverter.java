import java.util.*;
abstract class Temperature {
    double temp;

    void setTempData(double temp) {
        this.temp = temp;
    }

    abstract void changeTemp();
}

class Fahrenheit extends Temperature {
    double ctemp;

    @Override
    void changeTemp() {
        ctemp = (5.0 / 9) * (temp - 32);
        System.out.println("Fahrenheit " + temp + "°F = " + ctemp + "°C");
    }
}


class Celsius extends Temperature {
    double ftemp;

    @Override
    void changeTemp() {
        ftemp = (9.0 / 5) * temp + 32;
        System.out.println("Celsius " + temp + "°C = " + ftemp + "°F");
    }
}


public class TempConverter {
    public static void main(String[] args) {
        Fahrenheit f = new Fahrenheit();
        f.setTempData(98.6);
        f.changeTemp();

        Celsius c = new Celsius();
        c.setTempData(37);
        c.changeTemp();
    }
}
