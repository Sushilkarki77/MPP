package prob1.Practice;

public interface A {
    abstract void method();
}

interface B extends A {
     void method();
}

interface C extends A {
     void method();
}

class D implements A, B, C{


    public void method() {

    }
}