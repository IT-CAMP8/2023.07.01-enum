package pl.camp.it.enumy;

import java.util.ArrayList;
import java.util.List;

public enum Database {
    INSTACE;

    private final List<Person> persons = new ArrayList<>();

    Database() {
        this.persons.add(new Person());
        this.persons.add(new Person());
        this.persons.add(new Person());
        this.persons.add(new Person());
    }
}
