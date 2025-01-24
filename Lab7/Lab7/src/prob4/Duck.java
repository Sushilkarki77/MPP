package src;

public abstract class Duck implements FlyBehavior, QuackBehavior {

    FlyBehaviourEnum flyBehaviour;
    QuackBehaviourEnum quackBehavior;


    Duck(FlyBehaviourEnum behaviour, QuackBehaviourEnum quackBehavior) {
        this.flyBehaviour = behaviour;
        this.quackBehavior = quackBehavior;
    }

    public FlyBehaviourEnum getFlyBehaviour(){
        return flyBehaviour;
    }

    public QuackBehaviourEnum getQuackBehaviour(){
        return quackBehavior;
    }

    public void display() {
        System.out.println("Displaying");
    }

    public void swim() {
        System.out.println("Swimming");
    }
}
