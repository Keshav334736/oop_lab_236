// Parent class
class Animal {

    String name;
    int age;
    String dietType;

    Animal(String name, int age, String dietType) {
        this.name = name;
        this.age = age;
        this.dietType = dietType;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Diet Type: " + dietType);
    }
}

// Child class: Mammal
class Mammal extends Animal {

    String furColor;

    Mammal(String name, int age, String dietType, String furColor) {
        super(name, age, dietType);
        this.furColor = furColor;
    }

    void run() {
        System.out.println(name + " is running.");
    }

    void display() {
        super.display();
        System.out.println("Fur Color: " + furColor);
    }
}

// Child class: Bird
class Bird extends Animal {

    double wingSpan;

    Bird(String name, int age, String dietType, double wingSpan) {
        super(name, age, dietType);
        this.wingSpan = wingSpan;
    }

    void fly() {
        System.out.println(name + " is flying.");
    }

    void display() {
        super.display();
        System.out.println("Wing Span: " + wingSpan + " meters");
    }
}

// Child class: Reptile
class Reptile extends Animal {

    boolean venomous;

    Reptile(String name, int age, String dietType, boolean venomous) {
        super(name, age, dietType);
        this.venomous = venomous;
    }

    void crawl() {
        System.out.println(name + " is crawling.");
    }

    void display() {
        super.display();
        System.out.println("Venomous: " + venomous);
    }
}

// Main class
public class ZooSystem {

    public static void main(String[] args) {

        Mammal m = new Mammal("Lion", 5, "Carnivore", "Golden");
        m.display();
        m.eat();
        m.sleep();
        m.run();

        System.out.println("----------------------");

        Bird b = new Bird("Parrot", 2, "Herbivore", 0.5);
        b.display();
        b.eat();
        b.sleep();
        b.fly();

        System.out.println("----------------------");

        Reptile r = new Reptile("Snake", 3, "Carnivore", true);
        r.display();
        r.eat();
        r.sleep();
        r.crawl();
    }
}