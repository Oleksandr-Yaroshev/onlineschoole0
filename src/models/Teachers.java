package models;

public class Teachers {
    private String model;
    private long id;
    public static long counter;

    public Teachers() {
        id = counter++;
    }

}
