package basic;

public class VariableSection {
    public static void main(String[] args) {
        byte namaVariable = 1;
        byte NAMABELAKANG = 1;
        // byte 1salam = 1; // tidak boleh diawali dengan angka
        // dalam perjalanannya ketika sudah ditentukan byte maka selamanya harus byte
        // tidak boleh diganti menjadi boolean/string
        // byte nama belakang = 1; //tidak boleh ada spasi
        // byte 1111 = 1; //tidak boleh angka semua
        System.out.println(namaVariable);
        System.out.println(NAMABELAKANG);

        // bisa menggunakan var keyword namun harus diisikan langsung nilainya
        // var namaVariable; //tidak boleh
        var namaVariable2 = 1;
        System.out.println(namaVariable2);

        final byte countdown = 1;
        // countdown = 1;// tidak boleh diisikan ulang kalau di php namanya constanta
        System.out.println(countdown);
    }
}
