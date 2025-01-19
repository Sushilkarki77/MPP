public abstract class Duck {

    FlyBehavior flybehavior;
    QuackBehavior quackBehavior;


    Duck(FlyBehavior flybehavior, QuackBehavior quackBehavior) {
        this.flybehavior = flybehavior;
        this.quackBehavior = quackBehavior;
    }

    public void quack() {
        quackBehavior.quack();
    }

    public void fly() {
        flybehavior.fly();
    }

    public void display() {
        System.out.println("Displaying");
    }

    public void swim() {
        System.out.println("Swimming");
    }
}
