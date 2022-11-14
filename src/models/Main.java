package models;

public class Main {
    public static void main(String[] args) {
        Courses firstCourse = new Courses();
        Courses secondCourse = new Courses();
        Courses thirdCourse = new Courses();
        System.out.println(Courses.counter);

        Teachers firstTeacher = new Teachers();
        Teachers secondTeacher = new Teachers();
        Teachers thirdTeacher = new Teachers();
        System.out.println(Teachers.counter);

        Students firstStudents = new Students();
        Students secondStudents = new Students();
        Students thirdStudents = new Students();
        Students fifthStudents = new Students();
        Students sixthStudents = new Students();
        System.out.println(Students.counter);


        Lectures firstLecture = new Lectures();
        Lectures secondLectures = new Lectures();
        Lectures thirdLectures = new Lectures();
        Lectures fifthLectures = new Lectures();
        Lectures sixthLectures = new Lectures();
        Lectures seventhLecture = new Lectures();
        Lectures eightLecture = new Lectures();
        Lectures ninthLecture = new Lectures();
        Lectures tenthLecture = new Lectures();
        System.out.println(Lectures.counter);



        System.out.println(Lectures.counter);

        Homeworks firstHomework = new Homeworks();
        Homeworks secondHomework = new Homeworks();
        Homeworks thirdHomework = new Homeworks();
        System.out.println(Homeworks.counter);

        Addmaterials firstAddmaterials = new Addmaterials();
        Addmaterials secondAddmaterials = new Addmaterials();
        Addmaterials thirdAddmaterials = new Addmaterials();
        System.out.println(Addmaterials.counter);
    }
}
