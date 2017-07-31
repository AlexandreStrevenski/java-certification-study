package interfaces;

public interface SampleInterface {

    public void someMethod();

    public default void someDefaultMethod(){
        System.out.println("default someDefaultMethod");
    }
}