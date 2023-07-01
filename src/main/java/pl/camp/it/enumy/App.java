package pl.camp.it.enumy;

public class App {
    public static void main(String[] args) {
        Person person = new Person();

        Person.Address address = new Person.Address();

        person.address = address;

        Person.Role role = Person.Role.ADMIN;

        Console ps5 = Console.PS5;
        System.out.println(ps5.getBrand());

        Console ps52 = Console.PS5;
        System.out.println(ps52.getBrand());

        ps5.setBrand("Cos");

        System.out.println(Console.valueOf("PS5").getBrand());
        System.out.println(ps52.getBrand());
        System.out.println(Console.valueOf("XBOXSX").getBrand());
        System.out.println(Console.valueOf("SWITCH").getBrand());

        System.out.println(ps5 == Console.PS5);

        Database db = Database.INSTACE;

    }
}
