package prob4;

public class MallardDuck extends Duck {
   MallardDuck(){
//       super(new FlyWithWings(), new Quack());

       super(FlyBehaviourEnum.FLY_BEHAVIOUR_FLY, QuackBehaviourEnum.QUACK_BEHAVIOUR_CANNOT);
   }
}

class RedheadDuck extends Duck {
    RedheadDuck(){
//        super(new FlyWithWings(), new Quack());
        super(FlyBehaviourEnum.FLY_BEHAVIOUR_FLY, QuackBehaviourEnum.QUACK_BEHAVIOUR_QUACK);

    }
}

class RubberDuck extends Duck {
    RubberDuck(){
//        super(new CannotFly(), new Squeak());
        super(FlyBehaviourEnum.FLY_BEHAVIOUR_CANNOT_FLY, QuackBehaviourEnum.QUACK_BEHAVIOUR_SQUEAK);

    }

}

class DecoyDuck extends Duck {

    DecoyDuck(){
//        super(new CannotFly(), new MuteQuack());
        super(FlyBehaviourEnum.FLY_BEHAVIOUR_CANNOT_FLY, QuackBehaviourEnum.QUACK_BEHAVIOUR_CANNOT);

    }
}
