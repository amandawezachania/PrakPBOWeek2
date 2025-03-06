import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        
        System.out.print("Masukkan Usia: ");
        int usia = scanner.nextInt();
        
        System.out.print("Masukkan Tinggi Badan: ");
        double tinggiBadan = scanner.nextDouble();

        System.out.println("\n=== Informasi Pengguna ===");
        System.out.println("Nama        : " + nama);
        System.out.println("NIM         : " + nim);
        System.out.println("Usia        : " + usia);
        System.out.println("Tinggi Badan: " + tinggiBadan);

        double hasilAritmatika = (usia * 2) + 10 / 5.0 - 3;
        System.out.println("\nHasil operasi aritmatika: " + hasilAritmatika);

        boolean lebihDari18 = usia > 18;
        System.out.println("Apakah usia lebih dari 18? " + lebihDari18);

        boolean usiaLebihDari18DanTinggiLebihDari160 = (usia > 18) && (tinggiBadan > 160);
        System.out.println("Apakah usia lebih dari 18 dan tinggi badan lebih dari 160 cm? " + usiaLebihDari18DanTinggiLebihDari160);

        double usiaDouble = (double) usia;
        int tinggiBadanInt = (int) tinggiBadan;

        System.out.println("\nHasil konversi tipe data:");
        System.out.println("Usia sebagai double: " + usiaDouble);
        System.out.println("Tinggi badan sebagai int: " + tinggiBadanInt);

        scanner.close();
    }
}