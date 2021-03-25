package org.iesfm.highschool;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

public class Student {

    private String name;
    private String surnames;
    private LocalDateTime birthDate;

    public Student(String name, String surnames, LocalDateTime birthDate) {
        this.name = name;
        this.surnames = surnames;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(getName(), student.getName()) && Objects.equals(getSurnames(), student.getSurnames()) && Objects.equals(getBirthDate(), student.getBirthDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurnames(), getBirthDate());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surnames='" + surnames + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
