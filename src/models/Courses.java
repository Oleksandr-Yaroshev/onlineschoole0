package models;

public class Courses {
    private String model;
    public long Id;
    public static long counter;
    private Teachers teachers;
    private Students students;
    private Lectures lectures;


    public Courses(long Id) {
        this.Id = Id;
        Id = counter++;
//second variable if private
    }
    public long getId() {
        return Id;
    }





}
