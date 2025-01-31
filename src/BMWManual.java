import com.benbackend.automobile.ManualCar;

public class BMWManual extends ManualCar {
    private String seatCover;
    private int headLamps;
    private int rearLights;
    private int indicatorLights;
    private int breakLights;

    public BMWManual(String engineType, String carColour, String carType,
                     int numberOfSeats, String seatCover, int headLamps,
                     int rearLights, int indicatorLights, int breakLights) {
        super(engineType, carColour, carType, numberOfSeats);
        this.seatCover = seatCover;
        this.headLamps = headLamps;
        this.rearLights = rearLights;
        this.indicatorLights = indicatorLights;
        this.breakLights = breakLights;
    }

    public String getSeatCover() {
        return seatCover;
    }

    public void setSeatCover(String seatCover) {
        this.seatCover = seatCover;
    }

    public int getHeadLamps() {
        return headLamps;
    }

    public void setHeadLamps(int headLamps) {
        this.headLamps = headLamps;
    }

    public int getRearLights() {
        return rearLights;
    }

    public void setRearLights(int rearLights) {
        this.rearLights = rearLights;
    }

    public int getIndicatorLights() {
        return indicatorLights;
    }

    public void setIndicatorLights(int indicatorLights) {
        this.indicatorLights = indicatorLights;
    }

    public int getBreakLights() {
        return breakLights;
    }

    public void setBreakLights(int breakLights) {
        this.breakLights = breakLights;
    }
}
