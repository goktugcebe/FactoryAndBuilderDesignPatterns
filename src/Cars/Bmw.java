package Cars;

public class Bmw implements Car{
    @Override
    public void carBrand() {
        System.out.println("Brand of the car is BMW.");
    }

    @Override
    public void carModel() {
        System.out.println("Model of the car is M2.");
    }

    @Override
    public void motorCC() {
        System.out.println("Motor CC is 1620 CC.");
    }
}
