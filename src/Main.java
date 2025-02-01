import com.benbackend.automobile.AutomaticGear;
import com.benbackend.automobile.AutomobileDetails;
import com.benbackend.automobile.ManualGear;

public class Main {
    public static void main(String[] args) {
        BMWAutomatic bmw206 = new BMWAutomatic("Petrol",
                "Black", "4 wheel drive", 4,
                "Leather", 4, 4, 2,
                2);
        bmw206.startEngine();
        bmw206.setGear(AutomaticGear.DRIVE);
        bmw206.accelerate(20);
        bmw206.turnLeft(3);
        bmw206.turnRight(5);
        bmw206.decelerate(20);
        bmw206.parkVehicle(true);

        BMWManual bmw106 = new BMWManual("Petrol", "White",
                "4 wheel drive", 4,
                "Leather", 4, 4,
                4, 2);
        bmw106.startEngine();
        bmw106.setGear(ManualGear.GEAR1);
        bmw106.accelerate(20);
        bmw106.turnLeft(3);
        bmw106.turnRight(5);
        bmw106.decelerate(20);
        bmw106.parkVehicle(true);

        AutomobileDetails.printCarDetails(bmw106);
    }
}
