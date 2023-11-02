import java.util.Scanner;

public class BioskopWithScanner23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int baris, kolom;
        String next, nama;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int pilihanMenu = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (pilihanMenu) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    nama = sc.nextLine();
                    
                    boolean dataKursi = true;
                    do {
                        System.out.print("Masukkan Baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan Kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine();
                        
                        if (baris >= penonton.length) {
                            System.out.println("Nomor baris atau kolom kursi tidak tersedia. Silakan coba lagi.");
                            continue;
                            
                        } else  if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi ini sudah terisi. Silakan pilih kursi lain.");
                            
                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                            dataKursi = false;
                        }
                    } while (dataKursi);

                    break;

                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < 2; j++) {
                            if (penonton[i][j] != null) {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                            } else {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***");
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih!.");
                    break;

            }

            System.out.print("Lanjutkan (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}