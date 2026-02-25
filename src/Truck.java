public class Truck implements Car{
    @Override
    public void assemble() {
        System.out.println("Assembling Truck");
    }

    @Override
    public String getSpecifications() {
        return "Truck Specifications";
    }
}
