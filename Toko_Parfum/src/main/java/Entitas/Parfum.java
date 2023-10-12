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
