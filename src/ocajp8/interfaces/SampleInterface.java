package interfaces;

public interface SampleInterface {

    void someMethod();

    default void someDefaultMethod(){
        System.out.println("default someDefaultMethod");
    }
}