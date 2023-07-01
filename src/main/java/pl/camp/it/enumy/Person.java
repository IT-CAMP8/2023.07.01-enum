package pl.camp.it.enumy;

public class Person {
    Address address;
    Role role;

    public static class Address {
        String street;
    }

    public enum Role {
        ADMIN,
        USER
    }
}
