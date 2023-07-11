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
            System.out.println("Harga Tiket :"+film.getHarga());
            System.out.println("");
        }
    }
    public static void menu(){
        String isContinue1 = "y";
        do{
        System.out.println("=============================================================");
        System.out.println("=                     1.Pilihan Film                        =");
        System.out.println("=                     2.Pesan Tiket                         ="); 
        System.out.println("=                     3.End Program                         =");    
        System.out.println("=============================================================");  
        System.out.print("Masukan Pilihan (1-3) :");
        int pilihMenu = input.nextInt();
            switch(pilihMenu){
            case 1 : 
                    Display.displayMenu();
                    input.nextLine();
                    try {
                      System.out.println("Kembali ke Menu (y/n) :");
                      isContinue1 = input.nextLine();  
                    } catch (Exception e) {
                        System.out.println("error");
                    }
                break;
                case 2 : Bioskop.initBioskop();break;
                case 3 : return;
                default : System.out.println("Pilihan salah");
            }
        }while(isContinue1.equals("y"));
    }
    public static void clears(){
        try{
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }catch(Exception E){
            System.out.println("Tidak bisa clear screen");
        }
    }
}
