# Angel Perfume

Project ini dibuat dengan nama **PostTest2** yang memiliki 2 Package yaitu **Package Toko_Parfum** dan **package Entitas**
- **Package Toko_Parfum**
  memiliki class: **Toko_Parfum**
- **package Entitas**
  memiliki 3 class yaitu: **Parfum**, **Pembeli** dan **Staff**
  
![Package dan Class](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/9d6b2823-46fa-4e7b-8431-607eeb3866be)

## Package Toko_Parfum
Package Toko_Parfum adalah package utama yang digunakan untuk mengorganisasi semua kelas dan komponen yang berhubungan dengan manajemen toko parfum. 
Di dalam package ini, ada kelas Toko_Parfum, yang merupakan kelas utama program yang memiliki fungsi utama untuk mengelola parfum, staff, dan pembeli dalam toko parfum.
Package ini berisi metode-metode untuk menambah, menampilkan, mengedit, dan menghapus parfum, staff, dan pembeli di dalam toko parfum.

```java
package Toko_Parfum;

import Entitas.Parfum;
import Entitas.Staff;
import Entitas.Pembeli;

import java.util.ArrayList;
import java.util.Scanner;
```

package Toko_Parfum adalah deklarasi package yang digunakan untuk mengelompokkan kelas-kelas dan komponen-komponen terkait dengan manajemen toko parfum dalam package Toko_Parfum. Package memungkinkan Anda untuk mengorganisir dan mengelompokkan kode program dengan lebih baik.
import Entitas.Parfum, import Entitas.Staff, import Entitas.Pembeli merupakan Pernyataan import digunakan untuk mengimpor (mengakses) kelas-kelas yang berada dalam package Entitas. 

### Class Toko_Parfum
```java
public class Toko_Parfum {
    private final ArrayList<Parfum> parfums = new ArrayList<>();
    private final ArrayList<Staff> staffs = new ArrayList<>();
    private final ArrayList<Pembeli> pembelis = new ArrayList<>();
    private int parfumIdCounter = 1;
    private int staffIdCounter = 1;
    private int pembeliIdCounter = 1;
```

**ArrayList<Parfum> parfums = new ArrayList<>()** adalah ArrayList yang digunakan untuk menyimpan objek-objek Parfum. ArrayList ini akan berisi daftar parfum yang dijual di toko.
**ArrayList<Staff> staffs = new ArrayList<>()** adalah ArrayList yang digunakan untuk menyimpan objek-objek Staff. ArrayList ini berfungsi untuk mencatat data staf atau karyawan di toko parfum.
**ArrayList<Pembeli> pembelis = new ArrayList<>()** Ini adalah ArrayList yang digunakan untuk menyimpan objek-objek Pembeli. ArrayList ini digunakan untuk mencatat informasi pembeli yang datang ke toko.
**int parfumIdCounter = 1** merupakan Variabel yang digunakan sebagai penghitung ID untuk objek-objek Parfum. Setiap kali objek Parfum baru dibuat, nilai ini akan digunakan untuk memberikan ID unik ke objek tersebut.
**int staffIdCounter = 1**, Variabel ini mirip dengan parfumIdCounter, tetapi digunakan untuk objek-objek Staff. Ini memberikan ID unik kepada setiap staf yang bekerja di toko.
**int pembeliIdCounter = 1** digunakan untuk objek-objek Pembeli. Ini memberikan ID unik kepada setiap data pembeli yang direkam di toko.

Dalam class ini ada beberapa method, yaitu
#### method untuk Parfum
- Tambah Parfum
  
method ini digunakan untuk menambah parfum yang akan dijual, yang memiliki atribut id, aroma dan harga

```java
    public void tambahParfum(String aroma, double harga) {
        Parfum parfum = new Parfum(parfumIdCounter, aroma, harga);
        parfumIdCounter++;
        parfums.add(parfum);
    }
```

- Tampilkan Parfum

Method ini digunakan untuk menampilkan data parfum yang sudah diinput terlebih dahulu.

```java
    public void tampilkanParfum() {
        System.out.println("Data Parfum:");
        for (Parfum parfum : parfums) {
            System.out.println("ID: " + parfum.getId() + ", Aroma: " + parfum.getAroma() + ", Harga: " + parfum.getHarga());
        }
    }
```

- Edit Parfum

Method ini digunakan untuk mengedit data parfum yang sudah ada.

```java
    public void editParfum(int id, String aroma, double harga) {
        for (Parfum parfum : parfums) {
            if (parfum.getId() == id) {
                parfum.setAroma(aroma);
                parfum.setHarga(harga);
                break;
            }
        }
    }
```

- Hapus Parfum

Method ini digunakan untuk menghapus data parfum yang ada, penghapusan dilakukan sesuai ID parfum.

```java
    public void hapusParfum(int id) {
        parfums.removeIf(parfum -> parfum.getId() == id);
    }
```

#### method untuk Staff
- Tambah Staff

method ini digunakan untuk menambah Staff dengan data yang akan diinput berupa nama dan gaji.

```java
    public void tambahStaff(String nama, double gaji) {
        Staff staff = new Staff(staffIdCounter, nama, gaji);
        staffIdCounter++;
        staffs.add(staff);
    }
```

- Tampilkan Staff

Method ini digunakan untuk menampilkan data Staff yang sudah ditambah terlebih dahulu.

```java
    public void tampilkanStaff() {
        System.out.println("Data Staff:");
        for (Staff staff : staffs) {
            System.out.println("ID: " + staff.getId() + ", Nama: " + staff.getNama() + ", Gaji: " + staff.getGaji());
        }
    }
```

- Edit Staff

Method ini digunakan untuk mengedit data Staff yang sudah ada menjadi data staff yang baru.

```java
    public void editStaff(int id, String nama, double gaji) {
        for (Staff staff : staffs) {
            if (staff.getId() == id) {
                staff.setNama(nama);
                staff.setGaji(gaji);
                break;
            }
        }
    }
```

- Hapus Staff

Method ini digunakan untuk menghapus data staff yang ada, penghapusan dilakukan sesuai ID Staff.

```java
    public void hapusStaff(int id) {
        staffs.removeIf(staff -> staff.getId() == id);
    }
```

#### method untuk pembeli
- Tambah Pembeli

method ini digunakan untuk menambah Pembeli dengan data yang akan diinput berupa nama dan alamat.

```java
    public void tambahPembeli(String nama, String alamat) {
        Pembeli pembeli = new Pembeli(pembeliIdCounter, nama, alamat);
        pembeliIdCounter++;
        pembelis.add(pembeli);
    }
```

- Tampilkan Pembeli

Method ini digunakan untuk menampilkan data Pembeli yang sudah ditambah terlebih dahulu.

```java
    public void tampilkanPembeli() {
        System.out.println("Data Pembeli:");
        for (Pembeli pembeli : pembelis) {
            System.out.println("ID: " + pembeli.getId() + ", Nama: " + pembeli.getNama() + ", Alamat: " + pembeli.getAlamat());
        }
    }
```

- Edit Pembeli

Method ini digunakan untuk mengedit data Pembeli/member yang sudah ada menjadi data Pembeli/member yang baru.

```java
    public void editPembeli(int id, String nama, String alamat) {
        for (Pembeli pembeli : pembelis) {
            if (pembeli.getId() == id) {
                pembeli.setNama(nama);
                pembeli.setAlamat(alamat);
                break;
            }
        }
    }
```

- Hapus Pembeli

Method ini digunakan untuk menghapus data Pembeli yang ada, penghapusan dilakukan sesuai ID Pembeli.

```java
    public void hapusPembeli(int id) {
        pembelis.removeIf(pembeli -> pembeli.getId() == id);
    }
```

Toko_Parfum toko = new Toko_Parfum(): untuk membuat objek toko dari kelas Toko_Parfum untuk mengakses semua fitur dan data yang terkait dengan toko.

Scanner scanner = new Scanner(System.in): Membuat objek scanner yang digunakan untuk menerima masukan dari pengguna melalui keyboard. 

Program ini berjalan dalam loop while (true) yang berarti akan terus berjalan kecuali pengguna memilih untuk keluar. Program mencetak pesan selamat datang (welcome) dan menu utama ke layar, lalu meminta pengguna untuk memilih dengan menginputkan nomor pilihan. Pengguna memasukkan nomor pilihan, dan program akan mengeksekusi perintah sesuai dengan pilihan pengguna menggunakan pernyataan switch. Pilihanya adalah kelola parfum, kelola staf, kelola pembeli, atau keluar dari program. Terkait dengan pilihan pengguna, program akan memanggil metode kelolaParfum, kelolaStaff, atau kelolaPembeli untuk melakukan tugas yang sesuai. Jika pengguna memilih untuk keluar (pilihan 4), program mencetak pesan terima kasih dan kemudian keluar dari program dengan System.exit(0).

```java
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

```

- Pilihan 1: Kelola Parfum
```java
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
```
Fungsi kelolaParfum adalah bagian dari program yang mengatur operasi terkait parfum. Ini adalah loop tak terbatas yang memberi pengguna opsi untuk menambah, menampilkan, mengedit, atau menghapus parfum. 

Program mencetak menu parfum ke layar dan meminta pengguna untuk memilih dengan nomor.
Program akan mengeksekusi tindakan sesuai dengan pilihan pengguna menggunakan switch.
Pilihan termasuk menambahkan parfum baru, menampilkan daftar parfum, mengedit parfum yang ada, menghapus parfum, atau kembali ke menu utama.
Bergantung pada pilihan pengguna, program akan meminta masukan tambahan, seperti aroma, harga, ID, aroma baru, dan harga baru, lalu menjalankan operasi yang sesuai pada daftar parfum.
Jika pengguna memasukkan nomor yang tidak valid, program memberi tahu pengguna bahwa pilihannya tidak valid.




![image](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/f1338d18-aade-4b94-8baa-211afee21a36)


