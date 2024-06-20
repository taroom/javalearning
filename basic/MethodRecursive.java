package basic;

public class MethodRecursive {
    public static void main(String[] args) {
        System.out.println(factorialPakaiLoop(3));
        System.out.println(factorialPakaiRecursive(3));
    }

    static int factorialPakaiLoop(int angka) {
        var result = 1;

        for (var c = 1; c <= angka; c++) {
            result *= c;
        }

        return result;
    }

    static int factorialPakaiRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialPakaiRecursive(value - 1);
        }
    }
}
