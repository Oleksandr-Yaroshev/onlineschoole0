package models;

public class Homeworks {
    private long id;
    public static long counter;

    public Homeworks() {
        id = counter++;
    }
}
