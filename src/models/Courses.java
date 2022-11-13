package models;

public class Courses {
    private String model;
    private long id;
    public static long counter;
    private Teachers teachers;
    private Students students;
    private Lectures lectures;

    public Courses() {
        id = counter++;

    }


}
