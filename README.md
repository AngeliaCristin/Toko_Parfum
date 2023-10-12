# Angel's Perfume

# Penjelasan Program
Project ini dibuat dengan nama **PostTest2** yang memiliki 2 Package yaitu **Package Toko_Parfum** dan **package Entitas**
- **Package Toko_Parfum**
  memiliki class: **Toko_Parfum**
- **package Entitas**
  memiliki 3 class yaitu: **Parfum**, **Pembeli** dan **Staff**
  
![Package dan Class](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/9d6b2823-46fa-4e7b-8431-607eeb3866be)

### Package Toko_Parfum
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

#### Class Toko_Parfum
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
##### method untuk Parfum
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

##### method untuk Staff
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

##### method untuk pembeli
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

- Pilihan 2: Kelola Staff
```java
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
```
Fungsi kelolaStaff adalah bagian dari program yang mengatur operasi terkait staff (karyawan). Ini adalah loop tak terbatas yang memberi pengguna opsi untuk menambah, menampilkan, mengedit, atau menghapus staff.

Program mencetak staff menu ke layar dan meminta pengguna untuk memilih dengan nomor. Program akan mengeksekusi tindakan sesuai dengan pilihan pengguna menggunakan switch. Pilihan termasuk menambahkan staff baru, menampilkan daftar staff, mengedit staff yang ada, menghapus staff, atau kembali ke menu utama. Bergantung pada pilihan pengguna, program akan meminta masukan tambahan, seperti nama, gaji, ID staf, nama baru, dan gaji baru, lalu Jika pengguna memasukkan nomor yang tidak valid, program memberi tahu pengguna bahwa pilihannya tidak valid.

- Pilihan 3: Kelola Pembeli
```java
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
```
Fungsi kelolaPembeli adalah bagian dari program yang mengatur operasi terkait pembeli. Ini adalah loop tak terbatas yang memberi pengguna opsi untuk menambah, menampilkan, mengedit, atau menghapus pembeli. Penjelasan singkatnya adalah:

Program mencetak menu pembeli ke layar dan meminta pengguna untuk memilih dengan nomor. Program akan mengeksekusi tindakan sesuai dengan pilihan pengguna menggunakan switch. Pilihannya termasuk menambahkan pembeli baru, menampilkan daftar pembeli, mengedit pembeli yang ada, menghapus pembeli, atau kembali ke menu utama. Bergantung pada pilihan pengguna, program akan meminta masukan tambahan, seperti nama, alamat, ID pembeli, nama baru, alamat baru, lalu menjalankan operasi yang sesuai pada daftar pembeli. Jika pengguna memasukkan nomor yang tidak valid, program memberi tahu pengguna bahwa pilihannya tidak valid.

### Package Entitas
Package Entitas adalah tempat di mana entitas utama dalam sistem toko parfum didefinisikan yang berisi kelas-kelas yang merepresentasikan Parfum, Staff, dan Pembeli. didalam package utama ada 3 class yaitu:

#### Class Parfum
Parfum: kelas yang merepresentasikan objek parfum. Ini memiliki atribut seperti ID, aroma, dan harga. Kelas ini juga memiliki metode getter dan setter untuk mengakses dan memperbarui atribut-atribut tersebut.

```java
package Entitas;

public class Parfum {
    private final int id;
    private String aroma;
    private double harga;

    public Parfum(int id, String aroma, double harga) {
        this.id = id;
        this.aroma = aroma;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public String getAroma() {
        return aroma;
    }

    public double getHarga() {
        return harga;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
```

#### Class Staff
Staff: Kelas ini mewakili objek staf atau karyawan toko parfum yang memiliki atribut seperti ID, nama, dan gaji. Seperti Parfum, kelas ini juga menyediakan metode untuk mengakses dan mengubah atribut-atribut tersebut.

```java
package Entitas;

public class Staff {
    private final int id;
    private String nama;
    private double gaji;

    public Staff(int id, String nama, double gaji) {
        this.id = id;
        this.nama = nama;
        this.gaji = gaji;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public double getGaji() {
        return gaji;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
}
```

#### CLass Pembeli
Pembeli: Kelas ini digunakan untuk merepresentasikan pembeli yang mengunjungi toko parfum. class ini memiliki atribut seperti ID, nama, dan alamat. Seperti kelas lainnya, Pembeli juga menyediakan metode untuk mengelola atribut-atributnya.

```java
package Entitas;

public class Pembeli {
    private final int id;
    private String nama;
    private String alamat;

    public Pembeli(int id, String nama, String alamat) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}

```

## Alur Program Beserta SS Output
program ini di awali dengan tampilan menu utama saat di run. pada menu utama terdapat 4 menu.

![Menu Utama](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/f1338d18-aade-4b94-8baa-211afee21a36)

### 1. kelola parfum

apabila pengguna menginput 1, maka akan masuk ke menu parfum. pada menu parfum terdapat 5 menu.
  
![Menu Parfum](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/1fa10589-90a8-4069-9fd3-0d8666a2f253)

#### 1. Tambah Parfum
1. apabila memilih 1, maka masuk ke program tambah parfum
2. pengguna akan diminta untuk menginput Aroma parfum dan Harga Parfum
3. setelah klik enter maka data prfum akan otomatis ditambah.
4. setelah itu akan di looping ke menu parfum kembali, dan pengguna bisa memilih menu sesuai kebutuhan.

berikut ini dokumentasi menu 1, yaitu tambah parfum

![tambah parfum1](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/27c5d71d-8d46-473d-a1e8-096ef91af36f)
![tambah parfum2](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/71ba0d67-2255-479b-bf01-0c3ad5f591ba)
![tambah parfum3](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/6be7e1f6-1f83-4cff-9acd-1f1daa90959d)

#### 2. Tampilkan Parfum
1. setelah menambah data parfum, kita bisa melihat data tersebut dengan memilih menu 2 yaitu menu tampilan
2. ID produk akan muncul secara otomatis sesuai penginputan data parfum.
3. data akan ditampilkan dan kembali looping ke menu parfum

![tampilkan parfum](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/ad15a4ad-4be6-4c4c-a1e2-aaf37a4facec)

#### 3. Edit Parfum
1. input pilihan 3 untuk mengedit data parfum yang sudah ada
2. setelah di enter, data parfum akan ditampilkan agar pengguna lebih mudah untuk memilih id data man yang akan di edit tau diupdate
3. pengguna akan disuruh untuk menginput ID parfum yanng ingin diubah sesuai data yang sudah ditampilkan
4. setelah itu menginput aroma baru kemudian harga baru untuk mengganti data aroma dan harga parfum sebelumnya
5. setelah itu akan disimpan secara otomatis dan kembali ke menu parfum

![edit parfum](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/95688a54-82c8-40fa-9dbf-187c68ae8f4d)

6. untuk membuktikan program sukses dapat memilih kembali pilihan 2 untuk menampilkan dan mengecek apakah data sudah di edit atau di update.
7. gambar dibawah dapat dilihat baha data parfum aroma Taylor Swift dengan harga 750000 sudah diedit menjadi parfum aroma Midnight dengan harga 500000

![menampilkan data yang sudah diedit](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/a7e3b4ec-3ad8-48af-956e-598c85b2bffa)

#### 4. Hapus Parfum
1. pada perintah input pilihan, pengguna dapat menginput 4 untuk menjalankan method hapus parfum
2. data akan ditampilkan kemudian pengguna akan diminta untuk menginput ID parfum yang ingin dihapus
3. setelah klik enter, mak data akan dihapus secara otomatis oleh program

![hapus parfum](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/2b69e31c-9dcd-4973-bda0-bce098a097e1)

4. untuk membuktikan, maka lakukan pengecekan dengan menginput pilihan 2 kembali
5. pada gambar dibawah, dilkukan penghapusan parfum dengan ID 1, maka dapat dilihat bahwa ID 1 sudah dihapus dari data parfum.
6. ID pada parfum tidak akan berubah, meskipun data diatasnya dihapus, data yang dibawah akan tetap dengan ID nya yang masing - masing, artinya ID yang dihapus akan tetap terhapus dan tidak dapat menjadi ID data yang lain karena Property ID menggunakan Final Property, jadi nilainya tidk dapat berpindah ke produk lain.

![tampilan data baru setelah dihapus](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/594475b3-01f7-4514-95e0-315f069f680f)

#### Kembali ke menu utama
1. pilihan 5 dalah pilihan untuk kembali ke menu utama atau menu awal

![menu utama](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/b91fc3c2-5559-46df-92dc-7a5b58eed8f2)

### 2. Kelola Staff
apabila pengguna menginput 2, maka akan masuk ke menu staff. pada menu parfum terdapat 5 menu.
  
![Menu Staff](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/1c83f842-ec31-4ba1-bbdb-da8970f42c92)


#### 1. Tambah Staff
1. apabila memilih 1, maka masuk ke program tambah Staff
2. pengguna akan diminta untuk menginput Nama staff dan gaji staff
3. setelah klik enter maka data staff akan otomatis ditambah.
4. setelah itu akan di looping ke menu staff kembali, dan pengguna bisa memilih menu sesuai kebutuhan.

berikut ini dokumentasi menu 1, yaitu tambah staff

![tambah staff1](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/7603b1e9-149b-4046-a717-dd8b5a270775)
![tambah staff2](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/6d91770f-8ce1-4b3b-a44c-f267a19a66da)


#### 2. Tampilkan Staff
1. setelah menambah data Staff, kita bisa melihat data tersebut dengan memilih menu 2 yaitu menu tampilan
2. ID staff akan muncul secara otomatis sesuai penginputan data staff.
3. data akan ditampilkan dan kembali looping ke menu staff

![tampilkan staff](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/4fbb560b-a712-4fec-9467-6f1d21ae8994)


#### 3. Edit Staff
1. input pilihan 3 untuk mengedit data Staff yang sudah ada
2. setelah di enter, data staff akan ditampilkan agar pengguna lebih mudah untuk memilih id data mana yang akan di edit atau diupdate
3. pengguna akan disuruh untuk menginput ID staff yanng ingin diubah sesuai data yang sudah ditampilkan
4. setelah itu menginput nama baru kemudian gaji baru untuk mengganti data nama dan gaji Staff sebelumnya
5. setelah itu akan disimpan secara otomatis dan kembali ke menu staff

!![Edit staff](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/7087e047-3dd4-4a5f-9973-8cc351335ca8)

6. untuk membuktikan program sukses dapat memilih kembali pilihan 2 untuk menampilkan dan mengecek apakah data sudah di edit atau di update.
7. gambar dibawah dapat dilihat bahwa data staff  nama Cristin dengan gaji 3000000 sudah diedit menjadi staff dengan nama Cristin dan gaji 3500000. logikanya staff Cristin naik gaji.

![tampilan data yang sudah diedit](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/2fc77c89-e098-46cf-bd82-15c3ded07e1f)


#### 4. Hapus Staff
1. pada perintah input pilihan, pengguna dapat menginput 4 untuk menjalankan method hapus staff
2. data akan ditampilkan kemudian pengguna akan diminta untuk menginput ID staff yang ingin dihapus
3. setelah klik enter, mak data akan dihapus secara otomatis oleh program

![hapus staff](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/f452a3ec-b7f0-46a3-b50c-17c3e0f8d007)

4. untuk membuktikan, maka lakukan pengecekan dengan menginput pilihan 2 kembali
5. pada gambar dibawah, dilkukan penghapusan Staff dengan ID 2, maka dapat dilihat bahwa ID 2 sudah dihapus dari data staff.
6. Property ID menggunakan Final Property, jadi nilainya tidak dapat berpindah ke staff lain.

![setelah penghapusan data](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/0beca964-2424-4018-8ab3-77fb0fecde0b)

#### Kembali ke menu utama
1. pilihan 5 dalah pilihan untuk kembali ke menu utama atau menu awal

![menu utama](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/b91fc3c2-5559-46df-92dc-7a5b58eed8f2)

### 3. Kelola Pembeli
apabila pengguna menginput 2, maka akan masuk ke menu staff. pada menu parfum terdapat 5 menu.
  
![Menu Staff](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/1c83f842-ec31-4ba1-bbdb-da8970f42c92)


#### 1. Tambah Staff
1. apabila memilih 1, maka masuk ke program tambah Staff
2. pengguna akan diminta untuk menginput Nama staff dan gaji staff
3. setelah klik enter maka data staff akan otomatis ditambah.
4. setelah itu akan di looping ke menu staff kembali, dan pengguna bisa memilih menu sesuai kebutuhan.

berikut ini dokumentasi menu 1, yaitu tambah staff

![tambah staff1](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/7603b1e9-149b-4046-a717-dd8b5a270775)
![tambah staff2](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/6d91770f-8ce1-4b3b-a44c-f267a19a66da)


#### 2. Tampilkan Staff
1. setelah menambah data Staff, kita bisa melihat data tersebut dengan memilih menu 2 yaitu menu tampilan
2. ID staff akan muncul secara otomatis sesuai penginputan data staff.
3. data akan ditampilkan dan kembali looping ke menu staff

![tampilkan staff](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/4fbb560b-a712-4fec-9467-6f1d21ae8994)


#### 3. Edit Staff
1. input pilihan 3 untuk mengedit data Staff yang sudah ada
2. setelah di enter, data staff akan ditampilkan agar pengguna lebih mudah untuk memilih id data mana yang akan di edit atau diupdate
3. pengguna akan disuruh untuk menginput ID staff yanng ingin diubah sesuai data yang sudah ditampilkan
4. setelah itu menginput nama baru kemudian gaji baru untuk mengganti data nama dan gaji Staff sebelumnya
5. setelah itu akan disimpan secara otomatis dan kembali ke menu staff

!![Edit staff](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/7087e047-3dd4-4a5f-9973-8cc351335ca8)

6. untuk membuktikan program sukses dapat memilih kembali pilihan 2 untuk menampilkan dan mengecek apakah data sudah di edit atau di update.
7. gambar dibawah dapat dilihat bahwa data staff  nama Cristin dengan gaji 3000000 sudah diedit menjadi staff dengan nama Cristin dan gaji 3500000. logikanya staff Cristin naik gaji.

![tampilan data yang sudah diedit](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/2fc77c89-e098-46cf-bd82-15c3ded07e1f)


#### 4. Hapus Staff
1. pada perintah input pilihan, pengguna dapat menginput 4 untuk menjalankan method hapus staff
2. data akan ditampilkan kemudian pengguna akan diminta untuk menginput ID staff yang ingin dihapus
3. setelah klik enter, mak data akan dihapus secara otomatis oleh program

![hapus staff](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/f452a3ec-b7f0-46a3-b50c-17c3e0f8d007)

4. untuk membuktikan, maka lakukan pengecekan dengan menginput pilihan 2 kembali
5. pada gambar dibawah, dilkukan penghapusan Staff dengan ID 2, maka dapat dilihat bahwa ID 2 sudah dihapus dari data staff.
6. Property ID menggunakan Final Property, jadi nilainya tidak dapat berpindah ke staff lain.

![setelah penghapusan data](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/0beca964-2424-4018-8ab3-77fb0fecde0b)

#### Kembali ke menu utama
apabila pengguna menginput 2, maka akan masuk ke menu staff. pada menu parfum terdapat 5 menu.
  
![Menu Staff](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/1c83f842-ec31-4ba1-bbdb-da8970f42c92)


#### 1. Tambah Staff
1. apabila memilih 1, maka masuk ke program tambah Staff
2. pengguna akan diminta untuk menginput Nama staff dan gaji staff
3. setelah klik enter maka data staff akan otomatis ditambah.
4. setelah itu akan di looping ke menu staff kembali, dan pengguna bisa memilih menu sesuai kebutuhan.

berikut ini dokumentasi menu 1, yaitu tambah staff

![tambah staff1](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/7603b1e9-149b-4046-a717-dd8b5a270775)
![tambah staff2](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/6d91770f-8ce1-4b3b-a44c-f267a19a66da)


#### 2. Tampilkan Staff
1. setelah menambah data Staff, kita bisa melihat data tersebut dengan memilih menu 2 yaitu menu tampilan
2. ID staff akan muncul secara otomatis sesuai penginputan data staff.
3. data akan ditampilkan dan kembali looping ke menu staff

![tampilkan staff](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/4fbb560b-a712-4fec-9467-6f1d21ae8994)


#### 3. Edit Staff
1. input pilihan 3 untuk mengedit data Staff yang sudah ada
2. setelah di enter, data staff akan ditampilkan agar pengguna lebih mudah untuk memilih id data mana yang akan di edit atau diupdate
3. pengguna akan disuruh untuk menginput ID staff yanng ingin diubah sesuai data yang sudah ditampilkan
4. setelah itu menginput nama baru kemudian gaji baru untuk mengganti data nama dan gaji Staff sebelumnya
5. setelah itu akan disimpan secara otomatis dan kembali ke menu staff

!![Edit staff](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/7087e047-3dd4-4a5f-9973-8cc351335ca8)

6. untuk membuktikan program sukses dapat memilih kembali pilihan 2 untuk menampilkan dan mengecek apakah data sudah di edit atau di update.
7. gambar dibawah dapat dilihat bahwa data staff  nama Cristin dengan gaji 3000000 sudah diedit menjadi staff dengan nama Cristin dan gaji 3500000. logikanya staff Cristin naik gaji.

![tampilan data yang sudah diedit](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/2fc77c89-e098-46cf-bd82-15c3ded07e1f)


#### 4. Hapus Staff
1. pada perintah input pilihan, pengguna dapat menginput 4 untuk menjalankan method hapus staff
2. data akan ditampilkan kemudian pengguna akan diminta untuk menginput ID staff yang ingin dihapus
3. setelah klik enter, mak data akan dihapus secara otomatis oleh program

![hapus staff](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/f452a3ec-b7f0-46a3-b50c-17c3e0f8d007)

4. untuk membuktikan, maka lakukan pengecekan dengan menginput pilihan 2 kembali
5. pada gambar dibawah, dilkukan penghapusan Staff dengan ID 2, maka dapat dilihat bahwa ID 2 sudah dihapus dari data staff.
6. Property ID menggunakan Final Property, jadi nilainya tidak dapat berpindah ke staff lain.

![setelah penghapusan data](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/0beca964-2424-4018-8ab3-77fb0fecde0b)

#### Kembali ke menu utama
1. pilihan 5 dalah pilihan untuk kembali ke menu utama atau menu awal

![menu utama](https://github.com/AngeliaCristin/Toko_Parfum/assets/126650418/b91fc3c2-5559-46df-92dc-7a5b58eed8f2)

