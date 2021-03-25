package org.iesfm.highschool.comparators;

import org.iesfm.highschool.Student;

import java.util.Comparator;

public class StudentBySurnameAndNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int compare = o1.getSurnames().compareTo(o2.getSurnames());
        if(compare == 0) {
            compare = o1.getName().compareTo(o2.getName());
        }
        return compare;
    }
}
