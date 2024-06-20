package basic;

public class ArraySection {
        public static void main(String[] args) {
                String[] namaMurid;
                namaMurid = new String[3];

                namaMurid[0] = "Joko Anwar";
                namaMurid[1] = "Makdum Ibrahim";
                namaMurid[2] = "Anas Maliki";

                System.out.println(namaMurid[0]);
                System.out.println(namaMurid[1]);
                System.out.println(namaMurid[2]);

                // bisa juga seperti ini
                String[] namaGuru = new String[3];
                namaGuru[0] = "Mulyani";
                namaGuru[1] = "Rani";
                namaGuru[2] = "Suryadi";

                // array initializer
                int[] arrayInt = new int[] {
                                1, 2, 3, 4, 5, 6, 7
                };

                // atau
                long[] arrayLong = {
                                2, 3, 4, 5, 6, 7
                };

                String[] namaSekolah = {
                                "SDN 1 Mojokerto",
                                "SDN 4 Malang"
                };

                System.out.println(arrayInt[4]);
                System.out.println(arrayLong[3]);
                System.out.println(arrayLong.length);
                System.out.println(namaSekolah[1]);
                System.out.println(namaSekolah[1].length());

                // tidak ada unset dalam java

                // array in array (multidimension)
                String[][] memberTimFutsal = {
                                { "Tim 1 Kapten Adi", "Nugroho", "Lasmadi" },
                                { "Tim 2 Kapten Jonhson", "Agus", "Badrun" },
                                { "Tim 3 Kapten Aris", "Asep", "Anies" }
                };

                // cara memanggil Agus
                System.out.println(memberTimFutsal[1][1]);
                // cara memanggil Asep
                System.out.println(memberTimFutsal[2][1]);
        }
}
