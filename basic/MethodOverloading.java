package basic;

public class MethodOverloading {
    public static void main(String[] args) {
        katakanHallo();
        katakanHallo("Janoko");
        katakanHallo("Janoko", "Mulyadi");
    }

    static void katakanHallo() {
        System.out.println("Hallo");
    }

    static void katakanHallo(String nama) {
        System.out.println("Hallo " + nama);
    }

    static void katakanHallo(String namaDepan, String namaBelakang) {
        System.out.println("Hallo, " + namaDepan + " " + namaBelakang);
    }
}
