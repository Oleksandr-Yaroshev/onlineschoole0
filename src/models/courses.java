package models;

public class courses {
    private String model;
    private long id;
    public static long counter;
    private teachers teachers;
    private students students;
    private lectures lectures;

    public courses () {
        id = counter++;

    }


}
