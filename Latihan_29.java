import java.util.Scanner;

public class Latihan_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menampilkan judul program
        System.out.println("YUK CEK KEPRIBADIANMU DARI WARNA FAVORITMU");
        System.out.println("\nPILIH WARNA FAVORITMU:");
        System.out.println("MERAH");
        System.out.println("HIJAU");
        System.out.println("KUNING");
        System.out.println("BIRU");
        System.out.println("UNGU");

        // Meminta input warna favorit dan nama
        System.out.print("\nPILIH WARNA FAVORITMU: ");
        String warnaFavorit = input.nextLine().toUpperCase();
        System.out.print("NAMA KAMU: ");
        String nama = input.nextLine();

        // Menampilkan hasil kepribadian berdasarkan warna
        System.out.println("\n===HASIL TEST KEPRIBADIAN " + nama.toUpperCase() + "===");
        System.out.println("Warna Favoritmu adalah " + warnaFavorit);

        switch (warnaFavorit) {
            case "MERAH":
                System.out.println("1. Periang,");
                System.out.println("2. Berani,");
                System.out.println("3. Bersemangat,");
                System.out.println("4. Berani mengambil risiko dalam setiap langkah,");
                System.out.println("5. Menyukai tantangan,");
                System.out.println("6. Kurang sabar,");
                System.out.println("7. Dapat menahan amarah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol,");
                System.out.println("8. Memiliki energi kehangatan dan cinta.");
                break;

            case "HIJAU":
                System.out.println("1. Romantis,");
                System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
                System.out.println("3. Teguh pada prinsip,");
                System.out.println("4. Menginginkan kesempurnaan,");
                System.out.println("5. Mudah cemburu,");
                System.out.println("6. Mudah merasa iri,");
                System.out.println("7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.");
                break;

            case "KUNING":
                System.out.println("1. Optimis,");
                System.out.println("2. Suka bergaul,");
                System.out.println("3. Periang,");
                System.out.println("4. Senang menolong,");
                System.out.println("5. Lincah dan aktif,");
                System.out.println("6. Tidak suka meremehkan kekurangan orang lain,");
                System.out.println("7. Loyal,");
                System.out.println("8. Hangat,");
                System.out.println("9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil,");
                System.out.println("10. Cenderung penakut.");
                break;

            case "BIRU":
                System.out.println("1. Menyenangkan,");
                System.out.println("2. Bijaksana,");
                System.out.println("3. Pembawaan diri tenang saat menghadapi masalah,");
                System.out.println("4. Dinamis,");
                System.out.println("5. Senang berbagi,");
                System.out.println("6. Bersahabat,");
                System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang,");
                System.out.println("8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai.");
                break;

            case "UNGU":
                System.out.println("1. Optimis,");
                System.out.println("2. Tidak pernah ragu,");
                System.out.println("3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,");
                System.out.println("4. Memiliki ambisi yang besar,");
                System.out.println("5. Memiliki empati yang besar,");
                System.out.println("6. Memiliki sisi misterius sebab seringkali menutupi perasaannya,");
                System.out.println("7. Terkadang bersikap keras kepala dan angkuh.");
                break;

            default:
                System.out.println("Oops... Belum teridentifikasi.");
                break;
        }

        input.close();
    }
}
