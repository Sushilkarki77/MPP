package src;

public interface FlyBehavior {

    FlyBehaviourEnum getFlyBehaviour();

     default void fly(){
         switch (getFlyBehaviour()) {
             case FLY_BEHAVIOUR_FLY -> flyWithWings();
             case FLY_BEHAVIOUR_CANNOT_FLY -> cannotFly();
         }
     }


    default void flyWithWings() {
        System.out.println("Fly with wings");
    }

    default void cannotFly() {
        System.out.println("Cannot Fly");
    }
}
