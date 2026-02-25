public class CarFactory {
    public static Car createCar(String type)
        switch (type.toLowerCase()){
            case "sedan":
                return new Sedan();
            case "suv":
                return new SUV();
            case "truck":
                return new Truck();

    }
}
