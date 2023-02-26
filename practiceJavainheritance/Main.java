package practice.practiceJavainheritance;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Mimi", 2, "black");
        Dog dog = new Dog("Pochi", 3, "golden retriever");

        System.out.println("Cat's name is " + cat.getName() + ", age is " + cat.getAge() + ", and color is " + cat.getColor() + ".");
        cat.eat();
        cat.sleep();
        cat.speak();
        cat.purr();

        System.out.println();

        System.out.println("Dog's name is " + dog.getName() + ", age is " + dog.getAge() + ", and breed is " + dog.getBreed() + ".");
        dog.eat();
        dog.sleep();
        dog.speak();
        dog.bark();
    }
}