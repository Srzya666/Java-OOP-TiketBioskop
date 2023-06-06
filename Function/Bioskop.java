package Function;
import java.util.ArrayList;
import java.util.Scanner;
public class Bioskop {
    static Scanner input = new Scanner(System.in);
    public static ArrayList <Film> filmList = new ArrayList<Film>();

    public void initFilm(){
        filmList.add(new Film(35000, 20,"Pengabdi Setan 2 : Communion", "B001"));
        filmList.add(new Film(35000, 20,"The Big 4", "B002"));
        filmList.add(new Film(35000, 20,"Rumah Dara 2", "B003"));
        filmList.add(new Film(35000, 20,"Cek Toko Sebelah 2", "B004"));
        filmList.add(new Film(35000, 20,"Comic 8", "B005"));
    }
    public static void displayMenu(){
        int i = 0;
        System.out.println("======================= LIST FILM =======================");
        for (Film film : filmList) {
            i++;
            System.out.println(i+". "+film.getJudul());
            System.out.println("Jumlah Tiket :"+film.getKapasitas());
            System.out.println("");
        }
    }
    public static void initBioskop(){
        Bioskop bioskop = new Bioskop();
        bioskop.initFilm();
        String jam = "";
        int jumlah = 0;
        int harga = 35000; 
        int pilihJudul= 0;
        int pilihan = 0;
        String isContinue3 = "y";
        boolean status = false;
        
        Tiket user = new Tiket();
        System.out.println("==================== PEMESANAN TIKET BIOSKOP ====================");
        System.out.print("Masukan nama pemesan :");
        String nama = input.next();
        System.out.print("Masukan No.Telp :");
        String telp = input.next();

        user.setNama(nama);
        user.setTelp(telp);

        do{

        String isContinue = "y";
        String isContinue2 = "y";

        Film film = null;

        while (isContinue.equals("y")) {
            // user.displayfilm();
            displayMenu();
            System.out.print("Masukan Pilihan Film :");
            pilihJudul = input.nextInt();
            switch(pilihJudul) {
                case 1 : film = filmList.get(0); isContinue="n"; break;
                case 2 : film = filmList.get(1); isContinue="n"; break;
                case 3 : film = filmList.get(2); isContinue="n"; break;
                case 4 : film = filmList.get(3); isContinue="n"; break;
                case 5 : film = filmList.get(4); isContinue="n"; break;
                default : System.out.println("Pilihan Tidak Tersedia,Silahkan Pilih Kembali");
                    System.out.print("continue ? ");
                    isContinue = input.next();
            }
            clears();
        }
        while (isContinue2.equals("y")) {
            user.displayjam();
            System.out.print("Masukan Pilihan Jam :");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1 : jam = "14.30"; isContinue2="n"; break;
                case 2 : jam = "16.30"; isContinue2="n"; break;
                case 3 : jam = "18.00"; isContinue2="n"; break;
                case 4 : jam = "20.15"; isContinue2="n"; break;
                case 5 : jam = "22.10"; isContinue2="n"; break;
                default : System.out.println("Pilihan Tidak Tersedia,Silahkan Pilih Kembali");
                    System.out.print("continue ? ");
                    isContinue2 = input.next();
            }
        }
        Film selectedFilm = filmList.get(pilihJudul-1);
        do {
            System.out.print("Jumlah yang ingin dibeli :");
        jumlah = input.nextInt();
            if (selectedFilm.getKapasitas() >= jumlah ) {
                int kap = selectedFilm.getKapasitas();
                kap = selectedFilm.getKapasitas()-jumlah;
                selectedFilm.setKapasitas(kap);
                status = false;
            }else {
                System.out.println("Jumlah tiket Kurang");
                status = true;
            }
        }while(status == true);
        
        

        user.setJumlah(jumlah);
        user.setKode(film.getKode());
        user.setJam(jam);
        user.setHarga(harga);
        user.setJudul(film.getJudul());

        clears();
        user.getInvoice();

        System.out.println("Apakah ingin memesan lagi?");
        isContinue3 = input.next();
        }while(isContinue3.equals("y"));
    }
    public static void clears(){
        try{
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }catch(Exception E){
            System.out.println("Tidak bisa clear screen");
        }
    }
}
