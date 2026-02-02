package com.rikkeiedu.management;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    private static final List<Student> students = new ArrayList<>();

    public static void addStudent(Student s) {
        students.add(s);
    }

    public static void showAll() {
        for (Student s : students) {
            s.displayInfo();
        }
    }

    public static double calculateAverageScore() {
        double sum = 0;
        for (Student s : students) {
            sum += s.getScore();
        }
        return sum / students.size();
    }
}
