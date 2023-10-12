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
