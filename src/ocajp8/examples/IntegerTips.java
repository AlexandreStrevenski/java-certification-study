package examples;


public class IntegerTips {

    public static void main(String[] args) {
        Integer a = new Integer(100);

        new IntegerTips().calc(a);
        new IntegerTips().calc(10.4);

    }

    public void calc(Double a){
        System.out.println("double");
    }

    public void calc(Number a){
        System.out.println("number");
    }
}
