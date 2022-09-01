package lesson8;

public class Main {
    public static void main(String[] args) {
        Singable singable = System.out::println;

        sing(singable, "kew");
    }

    static void sing(Singable singable, String str) {
        singable.sing(str);
    }
}
