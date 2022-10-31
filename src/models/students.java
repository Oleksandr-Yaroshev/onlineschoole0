package models;

public class students {
    private String model;
    private long id;
    public static long counter;

    students () {
        id = counter++;
    }

}
