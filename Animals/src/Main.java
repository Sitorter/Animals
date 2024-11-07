interface Animals {
    void sound();
    default void sleep() {
        System.out.println("zwierze spi");
    }
    default void eat() {
        System.out.println("zwierze je");
    }
}
class Bird implements Animals {
    public void sound() {
        System.out.println("tweet tweet");
    }
}
class Cow implements Animals {
    public void sound() {
        System.out.println("Moo Moo");
    }
}
public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Cow cow = new Cow();
        bird.sound();
        cow.sound();
        bird.eat();
        bird.sleep();
        cow.eat();
        cow.sleep();
    }
}