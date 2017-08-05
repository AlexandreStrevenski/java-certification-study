package exam5.part2;


public class Q29 {

    public static void main(String[] args) {
        int a = 1;
        int b = 1;

        if (a++ == 1){
            System.out.println("a equals");
        }

        if (++b == 1){
            System.out.println("b equals");
        }

        System.out.println("first for:");
        for (int i = 0; i++ < 10;){
            System.out.println(i);
        }

        System.out.println("second for:");
        for (int i = 0; ++i < 10;){
            System.out.println(i);
        }

    }
}
