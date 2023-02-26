package practice.practiceJavainheritance;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void speak() {
        System.out.println(name + " is speaking.");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}