import java.util.Scanner;

interface Detail {
    void nama();
    void nim();
}

class Mahasiswa implements Detail {
    Scanner scanner = new Scanner(System.in);
    String name;
    String nim;

    @Override
    public void nama() {
        System.out.print("Masukkan nama anda: ");
        name = scanner.nextLine();
    }

    @Override
    public void nim() {
        System.out.print("Masukkan NIM anda: ");
        nim = scanner.nextLine();
    }

    public void tampilkanInfo() {
        System.out.println("Nama anda adalah: " + name);
        System.out.println("NIM anda adalah: " + nim);
    }
}

public class Prak12 {
    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();
        m.nama();
        m.nim();
        m.tampilkanInfo();
    }
}