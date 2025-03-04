import java.util.Scanner; // Mengimpor kelas Scanner dari paket java.util untuk mengambil input dari pengguna.
import java.time.LocalDate; // Mengimpor kelas LocalDate dari paket java.time untuk mengambil tanggal saat ini.

public class Main { // Deklarasi kelas Main.
    public static void main(String[] args) { // Metode utama yang akan dijalankan saat program dijalankan.

        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk mengambil input dari pengguna.

        System.out.print("Masukkan Nama: "); // Menampilkan teks untuk meminta pengguna memasukkan nama.
        String nama = scanner.nextLine(); // Mengambil input nama dari pengguna dan menyimpannya dalam variabel 'nama'.

        System.out.print("Masukkan Jenis Kelamin (P/L): "); // Menampilkan teks untuk meminta pengguna memasukkan jenis kelamin.
        char jenisKelamin = scanner.next().charAt(0); // Mengambil input jenis kelamin dari pengguna sebagai karakter.

        System.out.print("Masukkan Tahun Lahir: "); // Menampilkan teks untuk meminta pengguna memasukkan tahun lahir.
        int tahunLahir = scanner.nextInt(); // Mengambil input tahun lahir dari pengguna dan menyimpannya dalam variabel 'tahunLahir'.

        int tahunSekarang = LocalDate.now().getYear(); // Mengambil tahun saat ini dari sistem dan menyimpannya dalam variabel 'tahunSekarang'.

        int umur = tahunSekarang - tahunLahir; // Menghitung umur pengguna dengan mengurangkan tahun lahir dari tahun sekarang.

        String jenisKelaminStr = ""; // Deklarasi variabel untuk menyimpan string jenis kelamin.
        if (jenisKelamin == 'L' || jenisKelamin == 'l') { // Jika jenis kelamin adalah 'L' atau 'l'.
            jenisKelaminStr = "Laki-laki"; // Set nilai 'jenisKelaminStr' menjadi "Laki-laki".
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') { // Jika jenis kelamin adalah 'P' atau 'p'.
            jenisKelaminStr = "Perempuan"; // Set nilai 'jenisKelaminStr' menjadi "Perempuan".
        } else { // Jika input jenis kelamin tidak valid.
            System.out.println("Input jenis kelamin tidak valid!"); // Menampilkan pesan error.

        }

        System.out.println("\nData Diri:"); // Menampilkan header "Data Diri".
        System.out.println("Nama \t\t  : " + nama); // Menampilkan nama pengguna.
        System.out.println("Jenis Kelamin : " + jenisKelaminStr); // Menampilkan jenis kelamin pengguna.
        System.out.println("Umur \t\t  : " + umur + " tahun"); // Menampilkan umur pengguna.


    }
}
