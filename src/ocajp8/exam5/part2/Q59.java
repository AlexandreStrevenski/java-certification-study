package exam5.part2;


public class Q59 {

    public static void main(String[] args) {

    }

}

abstract class Person {
    protected String name;
    Person (String name){
        name = name;
    }

    public abstract String getName();
}

class Student extends Person {

    Student(String s) {
        super(s); // can't compile without call super();
    }

    public String getName(){
        return name;
    }
}
