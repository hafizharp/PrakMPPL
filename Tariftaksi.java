import java.util.Scanner;

public class Tariftaksi {
    public static void main(String[] args) {
        String waktu = "Siang";
        boolean selesai = true;
        int tarif = 8000;

        System.out.println("Program Penghitungan Tarif Taksi angkutan akhir zama");

        Scanner input = new Scanner(System.in);
        System.out.print("Jarak Tempuh (dalam KM) : ");
        int jarak = input.nextInt();

        while (selesai == true) {
            System.out.print("Waktu Perjalanan (Siang/Malam) : ");
            waktu = input.next().toLowerCase();
            if (waktu.equals("siang") 
				|| waktu.equals("malam")) {
                selesai = false;
            } 
			else {
                System.out.println("Anda memasukkan input yang salah");
            }
        }
		
        if (waktu.equals("siang")) {
            tarif += (6000 * jarak);
            System.out.println("Total Tarif Anda : " + tarif);
        } 
		else if (waktu.equals("malam")) {
            tarif += (8000 * jarak);
            System.out.println("Total Tarif Anda : " + tarif);
        }
        System.out.println("Terima Kasih Telah Menggunakan Layanan Taksi XYZ");
    }
}