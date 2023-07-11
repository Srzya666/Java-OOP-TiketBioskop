package Function;
import java.util.ArrayList;
import java.util.Scanner;
public class Bioskop {
    static Scanner input = new Scanner(System.in);
    public static ArrayList <Film> filmList = new ArrayList<Film>();

    public static void initFilm(){
        filmList.add(new Film(35000, 20,"Pengabdi Setan 2 : Communion", "B001"));
        filmList.add(new Film(35000, 20,"The Big 4", "B002"));
        filmList.add(new Film(35000, 20,"Rumah Dara 2", "B003"));
        filmList.add(new Film(35000, 20,"Cek Toko Sebelah 2", "B004"));
        filmList.add(new Film(35000, 20,"Comic 8", "B005"));
        filmList.add(new Film());
    }
    
    public static void initBioskop(){
        String jam = "";
        int jumlah = 0;
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

            //Revisi UAS memanggil display dengan FOR
            Display.displayMenu();
            
            System.out.print("Masukan Pilihan Film :");
            pilihJudul = input.nextInt();

            //revisi UAS memilih yang ada di display
            if(pilihJudul <= filmList.size() && pilihJudul != 0){
                film = filmList.get(pilihJudul-1);
                isContinue="n";
            }else{
                System.out.println("PIlihan Tidak Tersedia");
            }
            System.out.println("Silahkan pilih kembali Y/N :");
            isContinue = input.next();
            

            // switch(pilihJudul) {
            //     case 1 : film = filmList.get(0); isContinue="n"; break;
            //     case 2 : film = filmList.get(1); isContinue="n"; break;
            //     case 3 : film = filmList.get(2); isContinue="n"; break;
            //     case 4 : film = filmList.get(3); isContinue="n"; break;
            //     case 5 : film = filmList.get(4); isContinue="n"; break;
            //     default : System.out.println("Pilihan Tidak Tersedia,Silahkan Pilih Kembali");
            //         System.out.print("continue ? ");
            //         isContinue = input.next();
            // }
            Display.clears();
        }

        while (isContinue2.equals("y")) {
            user.displayjam();
            System.out.print("Masukan Pilihan Sesi :");
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
            if (jumlah < 1){
                System.out.println("Jumlah tiket tidak valid");
                status = true;
            }else if (selectedFilm.getKapasitas() >= jumlah ) {
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
        user.setHarga(film.getHarga());
        user.setJudul(film.getJudul());
        Display.clears();
        user.getInvoice();

        
        System.out.println("Apakah ingin memesan lagi? (y/n)");
        isContinue3 = input.next();
        }while(isContinue3.equals("y"));
        user.ucapan();
    }
    
}