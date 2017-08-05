package exam5.part2;

/**
 * Created by Alexandre S on 05/08/2017.
 */
public class Q27 {

    public static void main(String[] args) {
        int y = 0;
        while (y--<10){
            continue;
        }

        System.out.println(Integer.MIN_VALUE);
        System.out.println(y);
        String message = y > 10 ? "Greater than" : "Less than";
        System.out.println(message + " 10");

        //output: "Greater than 10"
    }

}
