package models;

public class Lectures {
    private long Id;
    public long courseId;
    public static long counter;
    private Homeworks homeworks;
    //private Addmaterials addmaterials;

    //first variable if public
    public Lectures(long Id, long courseId) {
        this. Id = Id;
        this.courseId = courseId;
        counter++;

    }




}


