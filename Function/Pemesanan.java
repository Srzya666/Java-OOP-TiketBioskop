package Function;
abstract class Pemesanan {
    private String nama;
    private String telp;

    public String getNama() {
        return this.nama;
    }
    public void setNama(String nama) {
        this.nama = nama;;
    }
    
    public String getTelp() {
        return this.telp;
    }
    public void setTelp(String telp) {
        this.telp = telp; 
    }
    public void ucapan(){

    }
    public abstract void displayjam(); 
}