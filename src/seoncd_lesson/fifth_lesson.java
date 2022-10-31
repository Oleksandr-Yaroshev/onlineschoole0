package seoncd_lesson;

public class fifth_lesson {
    public static void main(String[] args) {
        int firstVariable = 4;
        int secondVariable = 2;
        System.out.println(firstVariable);
        System.out.println(secondVariable);
        System.out.println("___");
        System.out.println(firstVariable == secondVariable);




        if(firstVariable > secondVariable) {
            secondVariable = secondVariable - firstVariable;
            firstVariable = firstVariable + secondVariable;
            secondVariable = Math.abs(secondVariable) + firstVariable;
        } else {
            // решение в случае, если secondVariable > firstVariable

        }



        System.out.println(firstVariable);
        System.out.println(secondVariable);
        System.out.println("___");
        System.out.println(firstVariable == secondVariable);
    }
}
