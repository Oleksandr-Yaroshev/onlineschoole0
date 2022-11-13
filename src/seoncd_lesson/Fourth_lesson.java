package seoncd_lesson;

public class Fourth_lesson {
    public static void main(String[] args) {
        int radius = 5;
        double pi = 3.14;
        double square = pi * radius * radius;
        // correctly
        double correctSquare = Math.PI * Math.pow(radius, 2);
        System.out.println(square);
        System.out.println(correctSquare);

    }
}
