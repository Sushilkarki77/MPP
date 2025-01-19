public class MallardDuck extends Duck {
   MallardDuck(){
       super(new FlyWithWings(), new Quack());
   }
}

class RedheadDuck extends Duck{
    RedheadDuck(){
        super(new FlyWithWings(), new Quack());
    }
}

class RubberDuck extends Duck {
    RubberDuck(){
        super(new CannotFly(), new Squeak());
    }

}

class DecoyDuck extends Duck{

    DecoyDuck(){
        super(new CannotFly(), new MuteQuack());
    }
}
