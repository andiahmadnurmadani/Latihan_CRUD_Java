import java.util.ArrayList;
import java.util.Scanner;

public class App {
    String nim;
    String nama;
    String jurusan;

    ArrayList<App> list = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    App(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    void menu() {
        System.out.println("1. Tambah data \n2. Tampilkan data \n3. Ubah data \n4. Hapus data \n5. Keluar \n");
        System.out.print("Pilihan anda : ");
    }

    void tambah() {
        System.out.println("===== INPUT DATA =====");
        input.nextLine();

        System.out.print("Masukkan nim : ");
        String nim = input.nextLine();

        System.out.print("Masukkan nama : ");
        String nama = input.nextLine();

        System.out.print("Masukkan jurusan : ");
        String jurusan = input.nextLine();

        System.out.println("===== INPUT DATA =====");

        list.add(new App(nim, nama, jurusan));

        System.out.println("Data berhasil di tambahkan!");
    }

    void tampilkan() {
        System.out.println("1. Cari berdasarkan nim\n2. Tampilkan semua");
        String pilihTampil = input.next();
        if (pilihTampil.equalsIgnoreCase("1")){
            System.out.print("Masukkan nim :");
            String cariNim = input.next();

            for (App a : list) {
                if (cariNim.equalsIgnoreCase(a.nim)) {
                    System.out.println("===== Data Ditemukan! =====");
                    System.out.println("NIM : " + a.nim + "\nNama : " + a.nama + "\nJurusan : " + a.jurusan);
                    System.out.println("===== Data Ditemukan! =====");

                    return;
                }
            }
            if (true) {
                System.out.println("Data tidak ditemukan!");
            }
        } else if (pilihTampil.equalsIgnoreCase("2")) {
            System.out.println("===== Data Ditemukan! =====");
            for (App b : list) {
                System.out.println("\nNIM : " + b.nim + "\nNama : " + b.nama + "\nJurusan : " + b.jurusan + "\n \n");
            }
            System.out.println("===== Data Ditemukan! =====");
        } else {
            System.out.println("Masukkan input dengan benar!");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Kelola Data Mahasiswa ===");
        App crud = new App(null, null, null);
        while (true) {
            crud.menu();
            int pilihMenu = input.nextInt();
            switch (pilihMenu) {
                case 1:
                    crud.tambah();
                    break;
                case 2:
                    crud.tampilkan();
                    break;

                default:
                    break;
            }
        }
    }
}
