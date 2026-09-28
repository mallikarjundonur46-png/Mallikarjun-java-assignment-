class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal: " + name;
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Dog: " + name;
    }
}

class Fox extends Animal {
    Fox(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Fox: " + name;
    }
}

public class Main {
    public static void main(String[] args) {

        Animal a = new Animal("Animal");
        Dog d = new Dog("Tommy");
        Fox f = new Fox("Fox");

        System.out.println(a);
        System.out.println(d);
        System.out.println(f);
    }
}