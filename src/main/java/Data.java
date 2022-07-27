public class Data {

    public static void main(String[] args) {
        Car insuredCar = new Car("Opel", 2012, 15000);
        insuredCar.insuranceDiscount();

        Owner insuredOwner = new Owner("Anastasia", 30, 4);
        insuredOwner.discountPossibility();
    }

}
