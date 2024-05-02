package parent;

public class Person {
    protected String name;
    protected String address;
    protected String hobby;
    
    public Person(String name, String address, String hobby) {
        this.name = name;
        this.address = address;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getHobby() {
        return hobby;
    }

    public void identity() {
        System.out.println("Nama : " + name);
        System.out.println("Alamat : " + address);
        System.out.println("Hobi : " + hobby);
    }
}