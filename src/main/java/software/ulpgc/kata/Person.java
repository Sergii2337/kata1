package software.ulpgc.kata;

import java.time.LocalDate;

public class Person {
    private final String name;
    private final LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String name() {
        return name;
    }

    public LocalDate birthDate() {
        return birthDate;
    }

    public int age() {
        return toYears(LocalDate.now().toEpochDay() - this.birthDate.toEpochDay());
    }

    private int toYears(long days) {
        return (int) (days/365.25);
    }
}
