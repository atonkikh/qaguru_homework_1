import javax.swing.*;

public class Car {
    String model;
    int dateOfManufacture;
    int mileage;

    public Car (String model, int dateOfManufacture, int mileage) {
        this.model = model;
        this.dateOfManufacture = dateOfManufacture;
        this.mileage = mileage;
    }

    void insuranceDiscount() {
        if (dateOfManufacture >= 2010 && mileage >= 10000) {
            System.out.println("Ваша скидка на страховку 5%");
        } else if (dateOfManufacture <= 2010 && mileage >= 10000) {
            System.out.println("Ваша скидка на страховку 10%");
        } else if (dateOfManufacture <= 2010 && mileage <= 10000) {
            System.out.println("Ваша скидка на страховку 15%");
        }
    }
}