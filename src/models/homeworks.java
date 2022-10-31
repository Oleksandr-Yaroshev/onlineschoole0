package models;

public class homeworks {
    private long id;
    public static long counter;

    public homeworks () {
        id = counter++;
    }
}
