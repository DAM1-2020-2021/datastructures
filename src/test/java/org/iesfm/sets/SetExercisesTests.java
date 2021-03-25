package org.iesfm.sets;

import org.iesfm.highschool.Student;
import org.iesfm.highschool.comparators.StudentByBirthDateComparator;
import org.iesfm.highschool.comparators.StudentBySurnameAndNameComparator;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.TreeSet;

public class SetExercisesTests {
    @Test
    public void testSortBySurname() {
        TreeSet<Student> students = new TreeSet<>(new StudentBySurnameAndNameComparator());

        students.add(new Student("a", "a", LocalDateTime.now().minusDays(1)));
        students.add(new Student("a", "c", LocalDateTime.now().minusDays(2)));
        students.add(new Student("b", "a", LocalDateTime.now().minusDays(0)));

        for(Student s: students) {
            System.out.println(s);
        }
    }

    @Test
    public void testSortByBirthDate() {
        TreeSet<Student> students = new TreeSet<>(new StudentByBirthDateComparator());

        students.add(new Student("a", "a", LocalDateTime.now().minusDays(1)));
        students.add(new Student("a", "c", LocalDateTime.now().minusDays(2)));
        students.add(new Student("b", "a", LocalDateTime.now().minusDays(0)));

        for(Student s: students) {
            System.out.println(s);
        }
    }
}
