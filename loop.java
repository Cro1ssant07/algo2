//Nama: Muhammad Abyaz Khairullah
//NPM: 50424761
//Kelas: 1IA20

public class loop {
    public static void main(String[] args) {
        // 1. Variabel tipe string
        String kalimat = "Gunadarma adalah salah satu universitas di indonesia";

        // 2. Print string dan panjang string
        System.out.println("String: " + kalimat);
        System.out.println("Panjang string: " + kalimat.length());

        // 3. Loop sebanyak 5 kali
        for (int iterasi = 0; iterasi < 5; iterasi++) {
            System.out.println("Iterasi ke-" + (iterasi + 1));

            if (iterasi < 2) {
                // Print uppercase string
                System.out.println("Uppercase: " + kalimat.toUpperCase());
            } else if (iterasi >= 2 && iterasi < 4) {
                // Print lowercase string
                System.out.println("Lowercase: " + kalimat.toLowerCase());
            } else if (iterasi == 4) {
                // Print posisi kata 'gunadarma' pada string
                int posisi = kalimat.toLowerCase().indexOf("gunadarma");
                System.out.println("Posisi kata 'gunadarma': " + posisi);
            }
        }
    }
}