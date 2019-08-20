public class Car {
    SteeringWheel[] steeringWheel;
    Wheel[] wheel;
    Engine engine;
    Body body;

    public Car(){
        this.body = new Body(Color.GREEN);
        this.engine = new Engine(1.0f,2.4f);
    };

    public Car(Color color, Wheel[] wheel) {
        this.body = new Body(color);
        this.wheel = wheel;
        this.steeringWheel = new SteeringWheel[]{new SteeringWheel(102.4f),
                                                 new SteeringWheel(0f),
                                                 new SteeringWheel(30.4f),
                                                 new SteeringWheel(-170.3f),
                                                 new SteeringWheel(13.2f),
                                                 new SteeringWheel(-570.9f),
                                                 new SteeringWheel(0f)
        };
        this.engine = new Engine(2.1f,5.2f);
    }

    //float[] pass = {102.4f, 0f, 30.4f, -170.3f, 13.2f, -570.9f, 0f};

    void ingine() {
        engine.start(engine.getVolume(), engine.getPower());
        int i = steeringWheel.length;
        int y = steeringWheel.length - 4;

        for (SteeringWheel steeringWheel : steeringWheel) {
            steeringWheel.turn(steeringWheel);
            i--;
            if (i >= 1) {
                if(y == i) {
                    i--;
                    System.out.println("Треба заїхати у сервісний центр...");
                    System.out.println("СЕРВІСНИЙ ЦЕНТР: 'ПОДОРОЖНИК'");
                    for (Wheel wheel : wheel) {
                            wheel.pump(wheel);
                    }
                    body.clean();
                }
                System.out.println("Їдемо далі...");
            } else
                System.out.println("Кінець шляху.");
        }

    }
}
