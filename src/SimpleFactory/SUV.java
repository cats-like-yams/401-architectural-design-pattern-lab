package SimpleFactory;

public class SUV implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling SUV");
    }

    @Override
    public String getSpecifications() {
        return "Specifics of SUV";
    }
}
