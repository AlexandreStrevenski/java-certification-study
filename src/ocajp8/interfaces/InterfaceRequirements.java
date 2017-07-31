package interfaces;

interface InterfaceRequirements {

    //Can't compile:
    /*
        default void method(); // Must have a implementation when it's a 'default'
        private void method(); // Can't be a private, must be a public
        protected void method(); // Can't be a protected, must be a public
        final void method(); // Can't be final
     */

    /* Can't compile
    static {
        System.out.println("here");
    }
    */


    //Can compile
    Integer number = 0;
    Long variable = number.longValue();

    public abstract void method1(); //It's ok
    void method2(); // I'ts the same as above

    int MAX = 10; // public static final implicit
    public static final int LIMIT = 10; // same as above

    static int getMax(){
        return MAX;
    }
}
