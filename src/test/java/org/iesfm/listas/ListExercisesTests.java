package org.iesfm.listas;

import org.iesfm.highschool.Student;
import org.iesfm.highschool.comparators.StudentByBirthDateComparator;
import org.iesfm.highschool.comparators.StudentBySurnameAndNameComparator;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class ListExercisesTests {

    @Test
    public void sortTest() {
        List<Student> students = new LinkedList<>();
        students.add(new Student("a", "a", LocalDateTime.now().minusDays(1)));
        students.add(new Student("a", "c", LocalDateTime.now().minusDays(2)));
        students.add(new Student("b", "a", LocalDateTime.now().minusDays(0)));

        students.sort(new StudentBySurnameAndNameComparator());

        students.add(new Student("a", "a", LocalDateTime.now().minusDays(0)));

        students.sort(new StudentBySurnameAndNameComparator());

        for(Student student: students) {
            System.out.println(student);
        }

    }
}
