package lesson9.labs.prob12;

import java.util.Optional;

public class MySingletonLazy {

    private static MySingletonLazy mySingletonLazy = null;

    public static  MySingletonLazy getInstance() {
        return Optional.ofNullable(mySingletonLazy).orElseGet(()-> {
            mySingletonLazy = new MySingletonLazy();
            return mySingletonLazy;
        });
    }


    public static void main(String[] args) {
        MySingletonLazy x =  MySingletonLazy.getInstance();
    }

}
