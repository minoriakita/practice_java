package practice.practiceJavaclass;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Car Spacio = new Car("Spacio", engine);
        Car Golf = new Car("Golf", engine);
        Spacio.start();
        Golf.start();
        Golf.engine.stop(Spacio.brand);
    }
}