package oop;

public class PersonApp {
    public static void main(String[] args) {
        // membuat object dari kelas person
        var person1 = new Person();
        person1.name = "Agus";
        person1.address = "Jombang";
        // person1.country = "Jombang";//tidak bisa diubah

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        Person person2 = new Person();
        person2.name = "Rudi";
        person2.address = "Mojokerto";

        System.out.println(person2.name);
        System.out.println(person2.address);
        System.out.println(person2.country);

        Person person3;

        person3 = new Person();

        person3.name = "Iman";
        person3.address = "Jakarta";

        System.out.println(person3.name);
        System.out.println(person3.address);
        System.out.println(person3.country);
    }
}
