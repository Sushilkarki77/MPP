package src;

public interface QuackBehavior {


    public QuackBehaviourEnum getQuackBehaviour();

    default void quack(){
        switch (getQuackBehaviour()) {
            case QUACK_BEHAVIOUR_CANNOT -> cannotQuack();
            case QUACK_BEHAVIOUR_SQUEAK -> Squeaking();
            case QUACK_BEHAVIOUR_QUACK -> canQuack();
        }
    }

    default void canQuack() {
        System.out.println("Quacking");
    }

    default void Squeaking() {
        System.out.println("Squeaking");
    }

    default void cannotQuack() {
        System.out.println("Cannot Quack");
    }
}
