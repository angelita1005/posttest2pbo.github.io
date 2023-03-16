package tokohewandream;


import java.util.ArrayList;
import java.util.Scanner;

public class TokoHewanDream {
    static ArrayList<Data> dataList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== >>> Menu <<< =====");
            System.out.println("| 1. Tambah Data Hewan     | ");
            System.out.println("| 2. Lihat Data Hewan      | ");
            System.out.println("| 3. Ubah Data Hewan       | ");
            System.out.println("| 4. Hapus Data Hewan      | ");
            System.out.println("| 5. Keluar Program        | ");
                

            System.out.print("Pilihan: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addData();
                    break;
                case 2:
                    showData();
                    break;
                case 3:
                    updateData();
                    break;
                case 4:
                    deleteData();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program Pengadopsian Hewan ini!");
                    System.exit(0);
                default:
                    System.out.println("Maaf, Pilihan tidak valid!");
            }
        }
    }

    static void addData() {
        System.out.print("Masukkan Nama Hewan : ");
        scanner.nextLine(); // utk membuang newline (enter)
        String name = scanner.next();
        System.out.print("Masukkan Tanggal Adopsi (DD/MM/YYYY): ");
        scanner.nextLine();
        String tanggalAdopsi = scanner.next();
        System.out.print("Masukkan Jenis Hewan :  ");
        scanner.nextLine(); 
        String JenisHewan = scanner.next();
        System.out.print("Tinggi : ");
        int tinggi = scanner.nextInt();
        System.out.print("Berat: ");
        double berat = scanner.nextDouble();

        Data data = new Data(name, tanggalAdopsi, JenisHewan, tinggi, berat);
        dataList.add(data);
        System.out.println("Oke, Data berhasil ditambahkan!");
    }

    static void showData() {
        if (dataList.isEmpty()) {
            System.out.println("\nData Hewan Toko DREAM\n");
            System.out.println("\nMohon maaf, Belum ada data!");
        } else {
            System.out.println("===== DATA =====");
            for (int i = 0; i < dataList.size(); i++) {
                System.out.println("Data ke-" + (i + 1));
                System.out.println("Nama           : " + dataList.get(i).getName());
                System.out.println("Tanggal Adposi : " + dataList.get(i).getTanggalAdopsi());
                System.out.println("Jenis Hewan    : " + dataList.get(i).getJenisHewan());
                System.out.println("Tinggi         : " + dataList.get(i).getTinggi());
                System.out.println("Berat          : " + dataList.get(i).getBerat());
                System.out.println();
            }
        }
    }

    static void updateData() {
        if (dataList.isEmpty()) {
            System.out.println("Mohon maaf, Belum ada data!");
        } else {
            System.out.print("Pilih nomor data yang akan diupdate: ");
            int index = scanner.nextInt() - 1;

            if (index < 0 || index >= dataList.size()) {
                System.out.println("Maaf, Nomor data tidak valid!");
            } else {
                System.out.print("Masukkan Nama baru : ");
                String name = scanner.next();

                System.out.print("Masukkan Tanggal Adopsi baru : ");
                String tanggalAdopsi = scanner.next();

                System.out.print("Masukkan Jenis Hewan baru : ");
                String JenisHewan = scanner.next();
                
                System.out.print("Masukkan Tinggi/Lebar Hewan baru : ");
                int tinggi = scanner.nextInt();

                System.out.print("Masukkan Berat Hewan baru : ");
                double berat = scanner.nextDouble();

                Data data = new Data(name, tanggalAdopsi, JenisHewan, tinggi, berat);
                dataList.set(index, data);

                System.out.println("Terima Kasih, Data berhasil diupdate!");
            }
        }
    }

    static void deleteData() {
        if (dataList.isEmpty()) {
            System.out.println("Mohon Maaf, Belum ada data!");
        } else {
            System.out.print("Pilih nomor data yang akan dihapus: ");
            int index = scanner.nextInt() - 1;

            if (index < 0 || index >= dataList.size()) {
                System.out.println("Maaf, Nomor data tidak valid!");
            } else {
                dataList.remove(index);
                System.out.println("Oke, Data berhasil dihapus!");
                }
           }
    }
}

class Data {
    private String name;
    private String tanggalAdopsi;
    private String JenisHewan;
    private int tinggi;
    private final double berat;
    
public Data(String name, String tanggalAdopsi, String JenisHewan, int tinggi, double berat) {
        this.name = name;
        this.tanggalAdopsi = tanggalAdopsi;
        this.JenisHewan = JenisHewan;
        this.tinggi = tinggi;
        this.berat = berat;
}

public String getName() {
    return name;
}

public String getTanggalAdopsi() {
    return tanggalAdopsi;
}

public String getJenisHewan() {
    return JenisHewan;
}

public int getTinggi() {
    return tinggi;
    }

public double getBerat() {
    return berat;
    }
}