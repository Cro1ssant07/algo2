// Program untuk menyimpan dan menampilkan data gaji karyawan

// Mendefinisikan kelas Karyawan
class Karyawan {
    String nama;
    int id;
    float gaji;

    // Konstruktor untuk inisialisasi objek Karyawan
    public Karyawan(String nama, int id, float gaji) {
        this.nama = nama;
        this.id = id;
        this.gaji = gaji;
    }

    // Metode untuk menampilkan informasi karyawan
    public void tampilkanInfo() {
        System.out.println("ID: " + id + ", Nama: " + nama + ", Gaji: Rp " + gaji);
    }
}

// Kelas utama untuk menjalankan program
public class DataGajiKaryawan {
    public static void main(String[] args) {
        // Menyimpan data karyawan secara manual
        Karyawan[] daftarKaryawan = {
            new Karyawan("Andi", 101, 5000000),
            new Karyawan("Budi", 102, 6000000),
            new Karyawan("Citra", 103, 7000000)
        };

        // Menampilkan data karyawan
        System.out.println("=== Data Gaji Karyawan ===");
        for (Karyawan k : daftarKaryawan) {
            k.tampilkanInfo();
        }
    }
}
