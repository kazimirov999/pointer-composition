class Wheel {

    private float diametr, pressure;

    private float getDiametr() {
        return diametr;
    }

    void setDiametr(float diametr1) {
        diametr = diametr1;
    }

    private float getPressure() {
        return pressure;
    }

    void setPressure(float pressure1) {
        pressure = pressure1;
    }

    void pump() {
        if (diametr == 15 & pressure == 2.5f) {
            System.out.println(" Wheels in good condition! Pressure is : " + getPressure() + " Diametr is : "
                                       + getDiametr());
        }
        if (diametr < 15) {
            System.out.println(" Check wheels!!! ");
            if (pressure < 2.5) {
                System.out.println(" Pump wheel to 2.5! and check pressure!");
            }

        }


    }

}
