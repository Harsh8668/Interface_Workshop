public class Main {
    public static void main(String[] args) {
        Flyable flyable = new Parrot();
        Object o = new Parrot();
        Parrot p = new Parrot();
        Bird b = new Parrot();
        p.eat();

        p.fly();
        Swimmable penguin = new Penguin();
        penguin.swim();

        Swimmable duck = new Duck();
        Flyable duck1 = new Duck();
        duck.swim();
        duck1.fly();
        b.eat();
    }
}
