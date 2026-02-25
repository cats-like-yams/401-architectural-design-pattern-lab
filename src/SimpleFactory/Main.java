package SimpleFactory;

public class Main {
    public static void main(String[] args) {
        String[] types = {"sedan", "suv", "truck"};
        for (String type : types) {
            Car car = CarFactory.createCar(type);
            car.assemble();
            System.out.println(car.getSpecifications());
        }
    }
}