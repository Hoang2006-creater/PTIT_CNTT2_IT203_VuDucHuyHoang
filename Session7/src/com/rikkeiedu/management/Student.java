package com.rikkeiedu.management;


public class Student {

    public static final String SCHOOL_NAME = "Rikkei Education";

    private static int autoId = 0;

    private final int id;
    private String fullName;
    private double score;
    private String className;

    public Student(String fullName, double score, String className) {
        this.id = ++autoId;
        this.fullName = fullName;
        this.score = score;
        this.className = className;
    }

    public double getScore() {
        return score;
    }

    public void displayInfo() {
        System.out.println(
                "ID: " + id +
                        " | Ten: " + fullName +
                        " | Diem: " + score +
                        " | Lop: " + className +
                        " | Truong: " + SCHOOL_NAME
        );
    }
}
