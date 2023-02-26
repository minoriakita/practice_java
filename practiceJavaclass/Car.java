package practice.practiceJavaclass;

public class Car {
     String brand;
     Engine engine; // Engineクラスのオブジェクト

    public Car(String brand, Engine engine) {
        this.brand = brand;
        this.engine = engine;
    }

    public void start() {
        engine.start(); // Engineクラスのメソッドを呼び出す
        System.out.println("The " + brand + " car has started.");
    }
}



