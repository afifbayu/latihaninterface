/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AFIF BAYU
 */
//interface untuk kendaraan
interface Kendaraan {
    void info();
}
class Mobil implements Kendaraan {
    private String merek;
    private String model;
    
    public Mobil(String merek, String model) {
        this.merek = merek;
        this.model = model;
}
    public String getMerek() {
        return merek;
    }
    public String getModel() {
        return model;
    }
    public void info() {
        System.out.println("Mobil: " + merek + " " + model);
    }
}

// Kelas Anak untuk Mobil Bekas
class MobilBekas extends Mobil {
    private int tahun;
    private double harga;
    
    public MobilBekas(String merek, String model, int tahun, double harga) {
        super(merek, model);
        this.tahun = tahun;
        this.harga = harga;
    }
    
    public int getTahun() {
        return tahun;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public void info() {
System.out.println("Mobil Bekas: " + getMerek() + " " + getModel() + " ("
+ tahun + ")");
    }
}

// Kelas Anak untuk Mobil Baru
class MobilBaru extends Mobil {
    private String garansi;
    
    public MobilBaru(String merek, String model, String garansi) {
        super(merek, model);
        this.garansi = garansi;
    }
    
    public String getGaransi() {
        return garansi;
    }
}

// Kelas untuk Dealer Mobil
class Dealer {
    private String nama;
    private MobilBaru mobilBaru;
    private MobilBekas mobilBekas;

    public Dealer(String nama, MobilBaru mobilBaru, MobilBekas mobilBekas) {
        this.nama = nama;
        this.mobilBaru = mobilBaru;
        this.mobilBekas = mobilBekas;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void info() {
        System.out.println("Dealer: " + nama);
        mobilBaru.info();
        mobilBekas.info();
    }
}


