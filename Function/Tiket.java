package Function;
public class Tiket extends Pemesanan {
    private String kode;
    private String jam;
    private int harga;
    private int jumlah;
    private String judul;
    private int jumlahtiket;

    public String getKode(){
        return this.kode;
    }
    public void setKode(String kode){
        this.kode = kode;
    }
    public String getJudul(){
        return this.judul;
    }
    public void setJudul(String judul){
        this.judul = judul;
    }
    public String getJam(){
        return this.jam;
    }
    public void setJam(String jam){
        this.jam = jam;
    }
    public int getHarga(){
        return this.harga;
    }
    public void setHarga(int harga){
        this.harga = harga;
    }
    public int getJumlah(){
        return this.jumlah;
    }
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    public int getJumlahtiket() {
        return this.jumlahtiket;
    }
    public void setJumlahtiket(int jumlahtiket) {
        this.jumlahtiket = jumlahtiket;
    }

    public void displayjam(){
        System.out.println("==================== JAM PEMESANAN ====================");
        System.out.println("1. 14.30");
        System.out.println("2. 16.30");
        System.out.println("3. 18.00");
        System.out.println("4. 20.15");
        System.out.println("5. 22.10");
    }

   public void getInvoice() {
        Invoice invoice = new Invoice(getNama(), getTelp(), kode, judul, jam, harga,jumlah);
        invoice.show();
   }
}
