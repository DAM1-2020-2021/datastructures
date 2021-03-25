package org.iesfm.highschool.comparators;

import org.iesfm.highschool.Student;

import java.util.Comparator;

public class StudentByBirthDateComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getBirthDate().compareTo(o2.getBirthDate());
    }
}
