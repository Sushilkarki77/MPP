package src;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Duck[] ducks = {new MallardDuck(), new DecoyDuck(), new RedheadDuck(), new RubberDuck() };

        for(Duck d: ducks){
            System.out.println(d.getClass().getSimpleName() + ": ");
            d.display();
            d.fly();
            d.quack();
            d.swim();
        }

    }
}