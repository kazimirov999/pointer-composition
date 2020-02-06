import java.sql.SQLOutput;

class  Wheels implements PumpWheel {
    private int Radius;
    private String Brand;
    private double Pressure;


    public int getRadius() {
        return Radius;
    }

    public void setRadius(int radius) {
        Radius = radius;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public double getPressure() {
        return Pressure;
    }

    public void setPressure(double pressure) {
        Pressure = pressure;
    }

    public Wheels(int radius, String brand, double pressure) {
        Radius = radius;
        Brand = brand;
        Pressure = pressure;
    }

    @Override
    public String toString() {
        if (Radius == 15)
            return "Radius " + Radius + " Michelin";
        else
            return "Radius " + Radius + Brand;
    }

    @Override
    public void pump() {
        if (Radius <= 15 & Pressure == 2.2) {
            System.out.println(" Тиск в шинах в нормі ");
        }
        else {
            while (Radius <= 15 & Pressure <= 2.2) {
                Pressure = Pressure + 0.1;
                System.out.println(" Підкачка колес ");
            }
        }
        if (Radius <= 20 & Pressure == 2.8) {
            System.out.println(" Тиск в шинах в нормі ");
        }
        else {
            while (Radius <= 20 & Pressure <= 2.8) {
                Pressure = Pressure + 0.1;
                System.out.println(" Підкачка колес ");
            }
        }

    }

        public void WheelsDisplay () {
            System.out.println("Радіус колеса " + Radius + " Виробник " + Brand + " Тиск в шинах " + Pressure);
        }

    }


