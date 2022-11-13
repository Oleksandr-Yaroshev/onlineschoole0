package models;

public class Students {
    private String model;
    private long id;
    public static long counter;

    Students() {
        id = counter++;
    }

}
