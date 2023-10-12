package Toko_Parfum;

import Entitas.Parfum;
import Entitas.Staff;
import Entitas.Pembeli;

import java.util.ArrayList;
import java.util.Scanner;

public class Toko_Parfum {
    private final ArrayList<Parfum> parfums = new ArrayList<>();
    private final ArrayList<Staff> staffs = new ArrayList<>();
    private final ArrayList<Pembeli> pembelis = new ArrayList<>();
    private int parfumIdCounter = 1;
    private int staffIdCounter = 1;
    private int pembeliIdCounter = 1;

    public void tambahParfum(String aroma, double harga) {
        Parfum parfum = new Parfum(parfumIdCounter, aroma, harga);
        parfumIdCounter++;
        parfums.add(parfum);
    }

    public void tampilkanParfum() {
        System.out.println("Data Parfum:");
        for (Parfum parfum : parfums) {
            System.out.println("ID: " + parfum.getId() + ", Aroma: " + parfum.getAroma() + ", Harga: " + parfum.getHarga());
        }
    }

    public void editParfum(int id, String aroma, double harga) {
        for (Parfum parfum : parfums) {
            if (parfum.getId() == id) {
                parfum.setAroma(aroma);
                parfum.setHarga(harga);
                break;
            }
        }
    }

    public void hapusParfum(int id) {
        parfums.removeIf(parfum -> parfum.getId() == id);
    }

    public void tambahStaff(String nama, double gaji) {
        Staff staff = new Staff(staffIdCounter, nama, gaji);
        staffIdCounter++;
        staffs.add(staff);
    }

    public void tampilkanStaff() {
        System.out.println("Data Staff:");
        for (Staff staff : staffs) {
            System.out.println("ID: " + staff.getId() + ", Nama: " + staff.getNama() + ", Gaji: " + staff.getGaji());
        }
    }

    public void editStaff(int id, String nama, double gaji) {
        for (Staff staff : staffs) {
            if (staff.getId() == id) {
                staff.setNama(nama);
                staff.setGaji(gaji);
                break;
            }
        }
    }

    public void hapusStaff(int id) {
        staffs.removeIf(staff -> staff.getId() == id);
    }

    public void tambahPembeli(String nama, String alamat) {
        Pembeli pembeli = new Pembeli(pembeliIdCounter, nama, alamat);
        pembeliIdCounter++;
        pembelis.add(pembeli);
    }

    public void tampilkanPembeli() {
        System.out.println("Data Pembeli:");
        for (Pembeli pembeli : pembelis) {
            System.out.println("ID: " + pembeli.getId() + ", Nama: " + pembeli.getNama() + ", Alamat: " + pembeli.getAlamat());
        }
    }

    public void editPembeli(int id, String nama, String alamat) {
        for (Pembeli pembeli : pembelis) {
            if (pembeli.getId() == id) {
                pembeli.setNama(nama);
                pembeli.setAlamat(alamat);
                break;
            }
        }
    }

    public void hapusPembeli(int id) {
        pembelis.removeIf(pembeli -> pembeli.getId() == id);
    }

    public static void main(String[] args) {
        Toko_Parfum toko = new Toko_Parfum();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("``WELCOME TO ANGEL'S PERFUME``");
            System.out.println("======================");
            System.out.println("|      Menu Utama     |");
            System.out.println("======================");
            System.out.println("| 1. Kelola Parfum    |");
            System.out.println("| 2. Kelola Staff     |");
            System.out.println("| 3. Kelola Pembeli   |");
            System.out.println("| 4. Keluar           |");
            System.out.println("======================");
            System.out.print("Pilihan Anda: ");

            int pilihanUtama = scanner.nextInt();
            scanner.nextLine();

            switch (pilihanUtama) {
                case 1:
                    kelolaParfum(toko, scanner);
                    break;
                case 2:
                    kelolaStaff(toko, scanner);
                    break;
                case 3:
                    kelolaPembeli(toko, scanner);
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void kelolaParfum(Toko_Parfum toko, Scanner scanner) {
        while (true) {
            System.out.println("=============================");
            System.out.println("|        Menu Parfum        |");
            System.out.println("=============================");
            System.out.println("| 1. Tambah Parfum          |");
            System.out.println("| 2. Tampilkan Parfum       |");
            System.out.println("| 3. Edit Parfum            |");
            System.out.println("| 4. Hapus Parfum           |");
            System.out.println("| 5. Kembali ke Menu Utama  |");
            System.out.println("=============================");
            System.out.print("Pilihan Anda: ");

            int pilihanParfum = scanner.nextInt();
            scanner.nextLine();

            switch (pilihanParfum) {
                case 1 -> {
                    System.out.print("Aroma Parfum: ");
                    String aroma = scanner.nextLine();
                    System.out.print("Harga Parfum: ");
                    double harga = scanner.nextDouble();
                    toko.tambahParfum(aroma, harga);
                }
                case 2 -> toko.tampilkanParfum();
                case 3 -> {
                    toko.tampilkanParfum();
                    System.out.print("ID Parfum yang ingin diubah: ");
                    int idParfum = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Aroma Baru: ");
                    String aromaBaru = scanner.nextLine();
                    System.out.print("Harga Baru: ");
                    double hargaBaru = scanner.nextDouble();
                    toko.editParfum(idParfum, aromaBaru, hargaBaru);
                }
                case 4 -> {
                    toko.tampilkanParfum();
                    System.out.print("ID Parfum yang ingin dihapus: ");
                    int idHapusParfum = scanner.nextInt();
                    toko.hapusParfum(idHapusParfum);
                }
                case 5 -> {
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void kelolaStaff(Toko_Parfum toko, Scanner scanner) {
        while (true) {
            System.out.println("=============================");
            System.out.println("|         Menu Staff        |");
            System.out.println("=============================");
            System.out.println("| 1. Tambah Staff           |");
            System.out.println("| 2. Tampilkan Staff        |");
            System.out.println("| 3. Edit Staff             |");
            System.out.println("| 4. Hapus Staff            |");
            System.out.println("| 5. Kembali ke Menu Utama  |");
            System.out.println("=============================");
            System.out.print("Pilihan Anda: ");

            int pilihanStaff = scanner.nextInt();
            scanner.nextLine();

            switch (pilihanStaff) {
                case 1 -> {
                    System.out.print("Nama Staff: ");
                    String nama = scanner.nextLine();
                    System.out.print("Gaji Staff: ");
                    double gaji = scanner.nextDouble();
                    toko.tambahStaff(nama, gaji);
                }
                case 2 -> toko.tampilkanStaff();
                case 3 -> {
                    toko.tampilkanStaff();
                    System.out.print("ID Staff yang ingin diubah: ");
                    int idStaff = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nama Baru: ");
                    String namaBaru = scanner.nextLine();
                    System.out.print("Gaji Baru: ");
                    double gajiBaru = scanner.nextDouble();
                    toko.editStaff(idStaff, namaBaru, gajiBaru);
                }
                case 4 -> {
                    toko.tampilkanStaff();
                    System.out.print("ID Staff yang ingin dihapus: ");
                    int idHapusStaff = scanner.nextInt();
                    toko.hapusStaff(idHapusStaff);
                }
                case 5 -> {
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void kelolaPembeli(Toko_Parfum toko, Scanner scanner) {
        while (true) {
            System.out.println("=============================");
            System.out.println("|        Menu Pembeli       |");
            System.out.println("=============================");
            System.out.println("| 1. Tambah Pembeli         |");
            System.out.println("| 2. Tampilkan Pembeli      |");
            System.out.println("| 3. Edit Pembeli           |");
            System.out.println("| 4. Hapus Pembeli          |");
            System.out.println("| 5. Kembali ke Menu Utama  |");
            System.out.println("=============================");
            System.out.print("Pilihan Anda: ");

            int pilihanPembeli = scanner.nextInt();
            scanner.nextLine();

            switch (pilihanPembeli) {
                case 1 -> {
                    System.out.print("Nama Pembeli: ");
                    String nama = scanner.nextLine();
                    System.out.print("Alamat Pembeli: ");
                    String alamat = scanner.nextLine();
                    toko.tambahPembeli(nama, alamat);
                }
                case 2 -> toko.tampilkanPembeli();
                case 3 -> {
                    toko.tampilkanPembeli();
                    System.out.print("ID Pembeli yang ingin diubah: ");
                    int idPembeli = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nama Baru: ");
                    String namaBaru = scanner.nextLine();
                    System.out.print("Alamat Baru: ");
                    String alamatBaru = scanner.nextLine();
                    toko.editPembeli(idPembeli, namaBaru, alamatBaru);
                }
                case 4 -> {
                    toko.tampilkanPembeli();
                    System.out.print("ID Pembeli yang ingin dihapus: ");
                    int idHapusPembeli = scanner.nextInt();
                    toko.hapusPembeli(idHapusPembeli);
                }
                case 5 -> {
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }
}

