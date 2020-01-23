import sun.awt.CharsetString;

public class Wheel {

    private long AccelerationRate;
    private long[] MaxAccelerationRate = new long[1000];

    public Wheel(int accelerationRate){
        this.AccelerationRate = accelerationRate;
    }

    public long[] getMaxAccelerationRate(){
        return MaxAccelerationRate;
    }

    public void setMaxAccelerationRate(long[] maxAccelerationRate){
        this.MaxAccelerationRate = maxAccelerationRate;
    }

    public long getAccelerationRate(){
        return AccelerationRate;
    }

    public void  setAccelerationRate( long accelerationRate){
        this.AccelerationRate =  accelerationRate;
    }

    public void setAccelerationRate(long[] maxAccelerationRate, long[][] accelerationRate){
        accelerationRate[0] = maxAccelerationRate;
        accelerationRate[100] = maxAccelerationRate;
        accelerationRate[200] = maxAccelerationRate;
        accelerationRate[300] = maxAccelerationRate;
        accelerationRate[400] = maxAccelerationRate;
        accelerationRate[500] = maxAccelerationRate;
        accelerationRate[600] = maxAccelerationRate;
        accelerationRate[700] = maxAccelerationRate;
        accelerationRate[800] = maxAccelerationRate;
        accelerationRate[900] = maxAccelerationRate;
        accelerationRate[1000] = maxAccelerationRate;

    }
    public  void maxAccelerationRateDisplay(CharsetString maxAccelerationRate){
        for(long i = 0; i < maxAccelerationRate.length; i++){
            System.out.println("Швидкість прискорення = " + maxAccelerationRate);
        }
    }

}
