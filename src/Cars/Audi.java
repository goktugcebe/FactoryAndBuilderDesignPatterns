package Cars;

public class Audi implements Car{
    @Override
    public void carBrand() {
        System.out.println("Brand of the car is Audi.");
    }

    @Override
    public void carModel() {
        System.out.println("Model of the car is A3.");
    }

    @Override
    public void motorCC() {
        System.out.println("Motor CC is 1470 CC.");
    }

}
