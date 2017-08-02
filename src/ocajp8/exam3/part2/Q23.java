package exam3.part2;

/**
 * Created by Alexandre S on 01/08/2017.
 */
public class Q23 {
    //final static int i; // can't compile
    final int i; // ok, if you set a value (could be inside constructor)

    public Q23(){
        i = 2;
    }

    public static void main(String[] args) {
        Q23 s = new Q23();
        System.out.println(s.i);
    }
}
