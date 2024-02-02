import java.time.Year;

public class Car {
    String carModel;
    int carYear;
    String carColor;

//    public Car(String carModel, int carYear, String carColor) {
//        this.carModel = carModel;
//        this.carYear = carYear;
//        this.carColor = carColor;
//    }

    void showCarDetails() {
        System.out.println("Car model: " + carModel);
        System.out.println("Car year: " + carYear);
        System.out.println("Car color: " + carColor);
    }

    int calculateCarAge() {
        return Year.now().getValue() - carYear;
    }
}
