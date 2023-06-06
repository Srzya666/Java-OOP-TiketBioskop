package Function;
public class Film {
    private int harga;
    private String judul;
    private String kode;
    private int kapasitas;
    public Film (int harga,int kapasitas, String judul,String kode) {
        this.harga = harga;
        this.kapasitas = kapasitas;
        this.kode = kode;
        this.judul = judul;
    }
    public int getHarga() {
        return this.harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getKapasitas() {
        return this.kapasitas;
    }
    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getJudul() {
        return this.judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getKode() {
        return this.kode;
    }
    public void setKode(String kode) {
        this.kode = kode;
    }  
}