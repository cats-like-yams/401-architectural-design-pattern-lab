package SimpleFactory;

public class Sedan implements Car {
    @Override
    public void assemble() {
        System.out.println("Sedan Assemble");
    }

    @Override
    public String getSpecifications() {
        return "Sedan Specifications";
    }
}
