import Cars.Audi;
import Cars.Bmw;
import Cars.CarFactory;
import Cars.Mercedes;
import Insurances.Insurance;
import java.util.Scanner;

public class CarInsuranceProgram {
    Insurance insurance;
    Scanner scanner;
    String carInfo= "Welcome to the car insurance price inquiry application. " +
            "\nBelow you can find the types of cars that we can provide the price offer for car insurance."+
            "\n1- Audi, A3, 1470 CC"+
            "\n2- BMW, M2, 1620 CC"+
            "\n3- Mercedes, A180, 1528 CC"+
            "\nPlease select your type of car";
    String info="======================="+
            "\nHere is our insurance options: "+
            "\n1- StandardPacket\t2- ExtraPacket\t3- DeluxePacket\t4- PremiumPacket"+
            "\nPlease select any of the insurance catalog.";
    public void runProgram()  {
        scanner=new Scanner(System.in);
        System.out.println(carInfo);
        //Factory Pattern starts here
        int carSelection=scanner.nextInt();
        carFactoryPattern(carSelection);
        //Builder Pattern starts here
        System.out.println(info);
        int insuranceSelection=scanner.nextInt();
       insuranceBuilderPattern(insuranceSelection);
    }

    public void carFactoryPattern(int carSelection){
        while (carSelection<1 ||carSelection>3){
            System.out.println("ERROR, please select once again!");
            carSelection=scanner.nextInt();
        }
        try{
            switch (carSelection){
                case 1: Audi audi=(Audi) CarFactory.createFactory(Audi.class);
                    System.out.println("Car type has been selected.");
                    audi.carBrand();
                    audi.carModel();
                    audi.motorCC();
                    break;
                case 2: Bmw bmw=(Bmw) CarFactory.createFactory(Bmw.class);
                    System.out.println("Car type has been selected.");
                    bmw.carBrand();
                    bmw.carModel();
                    bmw.motorCC();
                    break;
                case 3: Mercedes mercedes=(Mercedes) CarFactory.createFactory(Mercedes.class);
                    System.out.println("Car type has been selected.");
                    mercedes.carBrand();
                    mercedes.carModel();
                    mercedes.motorCC();
                    break;
                default: System.out.println("ERROR!");
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        }
    }


    public void insuranceBuilderPattern(int insuranceSelection){
        while (insuranceSelection>4 ||insuranceSelection<1){
            System.out.println("Error! Please select once again!");
            insuranceSelection=scanner.nextInt();
        }
        int standard=3;
        int extra=2;
        int deluxe=3;
        int premium=1;
        int totalAmount = 0;
        if (insuranceSelection==1){
            insurance=new Insurance.InsuranceBuilder().setStandardPacket(standard).Build();
            totalAmount=insurance.getStandardPacket();
        } else if (insuranceSelection==2) {
            insurance=new Insurance.InsuranceBuilder().setStandardPacket(standard).setExtraPacket(extra).Build();
            totalAmount=insurance.getStandardPacket()+ insurance.getAddExtraPacket();
        } else if (insuranceSelection==3) {
            insurance=new Insurance.InsuranceBuilder().setStandardPacket(standard).setExtraPacket(extra).setDeluxePacket(deluxe).Build();
            totalAmount=insurance.getStandardPacket()+ insurance.getAddExtraPacket()+ insurance.getAddDeluxePacket();
        } else if (insuranceSelection==4) {
            insurance=new Insurance.InsuranceBuilder().setStandardPacket(standard).setExtraPacket(extra).setDeluxePacket(deluxe).setPremiumPacket(premium).Build();
            totalAmount=insurance.getStandardPacket()+ insurance.getAddExtraPacket()+ insurance.getAddDeluxePacket()+ insurance.getAddPremiumPacket();
        }
        System.out.println("Total Amount of the selected Insurance offer is : "+totalAmount + " Euro"+"\nGoodbye!");
    }



}