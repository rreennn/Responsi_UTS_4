package child;
import java.util.*;

class InheritMain {
  public static void main (String[] args) {
    Scanner inp = new Scanner(System.in);

    System.out.println("Enter your name");
    String name = inp.nextLine();

    System.out.println("Enter your address");
    String address = inp.nextLine();

    System.out.println("Enter your hobby");
    String hobby = inp.nextLine();

    System.out.println("Enter your NIM");
    String nim = inp.nextLine();

    Student mahasiswa = new Student(name, address, hobby, nim);
    mahasiswa.identity();
    System.out.println("Total pembayaran Anda adalah : Rp" + mahasiswa.hitungPembayaran());

    }  
}
