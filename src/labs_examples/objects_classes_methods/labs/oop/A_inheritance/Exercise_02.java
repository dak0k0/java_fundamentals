package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Run the class below and study the output. What prints and why?
 *
 * Your answer:
 * It prints 10 because a is an object of type A. Even though it creates an object of type B, by declaring a as A, it typecasts it into A. The subclass cannot override the superclass' instance variable.
 */
class A {
    int i = 10;
}

class B extends A{
    int i = 20;
}

public class Exercise_02 {

    public static void main(String[] args) {
        A a = new B();

        System.out.println(a.i);

    }
}

