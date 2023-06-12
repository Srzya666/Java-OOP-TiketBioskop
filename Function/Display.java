package Function;
import java.util.Scanner;
public class Display {
    static Scanner input = new Scanner(System.in);
    
    public static void displayMenu(){
        int i = 0;
        System.out.println("======================= LIST FILM =======================");
        for (Film film : Bioskop.filmList) {
            i++;
            System.out.println(i+". "+film.getJudul());
            System.out.println("Jumlah Tiket :"+film.getKapasitas());
            System.out.println("");
        }
    }

    public static void menu(){
        boolean status = true;
        do{
        System.out.println("=============================================================");
        System.out.println("=                     1.Pilihan Film                        =");
        System.out.println("=                     2.Pesan Tiket                         ="); 
        System.out.println("=                     3.End Program                         =");    
        System.out.println("=============================================================");  
        System.out.print("Masukan Pilihan :");
        int pilihMenu = input.nextInt();
            switch(pilihMenu){
            case 1 : 
                Display.displayMenu();
                System.out.println("Kembali ke Menu (true/false) :");
                status = input.nextBoolean();
                break;
                case 2 : Bioskop.initBioskop();break;
                case 3 : return;
                default : System.out.println("Pilihan salah");
            }
        }while(status == true);
    }

    public static void clears(){
        try{
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }catch(Exception E){
            System.out.println("Tidak bisa clear screen");
        }
    }
}