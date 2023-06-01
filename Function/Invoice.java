package Function;
class Invoice {
    public Invoice (String getNama,String getTelp,String getKode,String getJudul,String getJam,int getHarga,int getJumlah) {
        this.nama = getNama;
        this.kode = getKode;
        this.judul = getJudul;
        this.jam = getJam;
        this.telp = getTelp;
        this.harga = getHarga;
        this.jumlah = getJumlah;
    }
    private String nama;
    private String telp;
    private String kode;
    private String judul;
    private String jam;
    private int harga;
    private int jumlah;
    
    public int total() {
        return harga*jumlah;
       }

    protected void show(){
        System.out.println("");
        System.out.println("");
        System.out.println("==================== INVOICE PEMESANAN TIKET ====================");
        System.out.println("Nama Pelanggan \t\t :" + nama);
        System.out.println("No.TELEPON \t\t :" + telp);
        System.out.println("=================================================================");
        System.out.println("Kode Film \t\t :" + kode);
        System.out.println("Judul Film \t\t :" + judul);
        System.out.println("Jam Tayang \t\t :" + jam);
        System.out.println("Harga \t\t\t :" + harga);
        System.out.println("Jumlah yang dibeli \t :" + jumlah);
        System.out.println("Total \t\t\t :" + total());
        System.out.println("=================================================================");
        System.out.println("\n");
    }
}
