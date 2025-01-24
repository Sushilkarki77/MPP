package Question1;

import java.util.function.Supplier;

public class B {
    public static void main(String[] args){
        Supplier<Double> supplier = new Supplier<>() {
            @Override
            public Double get() {
                return Math.random();
            }
        };
        System.out.println(supplier.get());
    }
}
