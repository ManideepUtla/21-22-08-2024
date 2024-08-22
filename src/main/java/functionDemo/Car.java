package functionDemo;

public class Car {
    private String nameOfTheCar;
    private String modelOfTheCar;
    private String price;

    public String getNameOfTheCar() {
        return this.nameOfTheCar=nameOfTheCar;
    }

    public String getModelOfTheCar() {
        return this.modelOfTheCar=modelOfTheCar;
    }

    public String getPrice() {
        return this.price=price;
    }

    public Car(String nameOfTheCar, String modelOfTheCar, String price){
        this.nameOfTheCar=nameOfTheCar;
        this.modelOfTheCar=modelOfTheCar;
        this.price=price;
    }
}
