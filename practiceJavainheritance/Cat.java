package practice.practiceJavainheritance;

public class Cat extends Animal {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public void purr() {
        System.out.println(getName() + " is purring.");
    }

    public String getColor() {
        return color;
    }
}
