package examples;


public class StringTips {
    public static void main(String[] args) {
        String s = "Hello";
        String t = new String(s);
        if ("Hello".equals(s)) System.out.println("one");
        if (t == s) System.out.println("two");
        if (t.equals(s)) System.out.println("three");
        if ("Hello" == s) System.out.println("four");
        if ("Hello" == t) System.out.println("five");
    }
}

/*
*  Which are true statements? (Choose all that apply)
    A. An immutable object can be modified.
v    B. An immutable object cannot be modified.
v    C. An immutable object can be garbage collected.
    D. An immutable object cannot be garbage collected.
v    E. String is immutable.
    F. StringBuffer is immutable.
    G. StringBuilder is immutable
*/


/*
B. abbaccca

 */
