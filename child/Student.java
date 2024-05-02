package child;
import parent.Person;
import java.util.*;

public class Student extends Person {
    String nim;
    int spp, sks, modul;
    Scanner inp = new Scanner(System.in);

    public Student(String name, String address, String hobby, String nim) {
        super(name, address, hobby);
        this.nim = nim;
    }
    public String getNim() {
        return nim;
    }

    public int hitungPembayaran() {
        System.out.println("Masukkan total SPP!");
        spp = inp.nextInt();
        System.out.println("Masukkan total SKS!");
        sks = inp.nextInt();
        System.out.println("Masukkan total Modul!");
        modul = inp.nextInt();

        int total = spp + sks + modul;
        return total;
    }

    @Override
    public void identity() {
        System.out.println("Nama : " + super.getName());
        System.out.println("Alamat : " + super.getAddress());
        System.out.println("Hobi : " + super.getHobby());
        System.out.println("NIM : " + getNim());
    }


}