package Cars;

public class Mercedes implements Car{
    @Override
    public void carBrand() {
        System.out.println("Brand of the car is Mercedes.");
    }

    @Override
    public void carModel() {
        System.out.println("Model of the car is A180.");
    }

    @Override
    public void motorCC() {
        System.out.println("Motor CC is 1528 CC.");
    }
}
