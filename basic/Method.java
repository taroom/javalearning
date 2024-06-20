package basic;

public class Method {
    public static void main(String[] args) {
        panggilAku();
        panggilAku();
        panggilAku();

        panggilNama("Joko");
        panggilNama("Timbul");
        panggilNama("Marsha");

        int total = jumlah(3, 2);
        System.out.println(total);
        System.out.println(jumlah(4, 5));

        int[] nilaiEla = {
                88, 89, 80, 56, 85, 60
        };

        kelulusan("Ela", nilaiEla);
        kelulusanDenganArgumen("Taroom", 100, 50, 30, 55, 60, 88, 90);
    }

    static void panggilAku() {
        System.out.println("Hallo");
    }

    // with parameter
    static void panggilNama(String nama) {
        System.out.println("Hallo Nama " + nama);
    }

    // with parameter + return value
    static int jumlah(int angka1, int angka2) {
        return angka1 + angka2;
    }

    // without variable arguments
    static void kelulusan(String nama, int[] nilai) {
        var total = 0;
        for (var n : nilai) {
            total += n;
        }

        total = total / nilai.length;

        if (total >= 75) {
            System.out.println("Selamat " + nama + ", nilai anda " + total + ". Anda Lulus");
        } else {
            System.out.println("Maaf " + nama + ", nilai Anda " + total + ", Anda tidak lulus");
        }
    }

    // without variable arguments
    static void kelulusanDenganArgumen(String nama, int... nilai) {
        var total = 0;
        for (var n : nilai) {
            total += n;
        }

        total = total / nilai.length;

        if (total >= 75) {
            System.out.println("Selamat " + nama + ", nilai anda " + total + ". Anda Lulus");
        } else {
            System.out.println("Maaf " + nama + ", nilai Anda " + total + ", Anda tidak lulus");
        }
    }
}
