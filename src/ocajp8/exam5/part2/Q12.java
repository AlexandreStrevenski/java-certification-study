package exam5.part2;


public class Q12 {

    public static void main(String[] args) {
        Integer a = new Integer("127");
        Integer b = new Integer("127");
        Integer c = 127;
        Integer d = 127;
        Integer e = new Integer("200");
        Integer f = new Integer("200");
        Integer g = 200;
        Integer h = 200;

        System.out.println(a==b); // false
        System.out.println(c==d); // true
        System.out.println(e==f); // false
        System.out.println(g==h); // false

        //Integer class caches values between -128 to 127

    }

}
