package models;

import services.MainForServices;

public class Main {
    public static void main(String[] args) {
        Courses firstCourse = new Courses(1);
        Courses secondCourse = new Courses(2);
        Courses thirdCourse = new Courses(3);
        Courses fourthCourse = new Courses(4);
        Courses fifthCourse = new Courses(5);



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


        Lectures firstLecture = new Lectures(1, firstCourse.Id);
        Lectures secondLectures = new Lectures(2, secondCourse.Id);
        Lectures thirdLectures = new Lectures(3, thirdCourse.Id);
        Lectures fifthLectures = new Lectures(4, firstCourse.getId());
        Lectures sixthLectures = new Lectures(5, secondCourse.getId());
        Lectures seventhLecture = new Lectures(6, thirdCourse.getId());
        Lectures eighth = new Lectures(7, fourthCourse.Id);
        Lectures ninth = new Lectures(8, fifthCourse.Id);
        System.out.println(Lectures.counter);


        Homeworks firstHomework = new Homeworks();
        Homeworks secondHomework = new Homeworks();
        Homeworks thirdHomework = new Homeworks();
        System.out.println(Homeworks.counter);

        //Addmaterials firstAddmaterials = new Addmaterials();
        //Addmaterials secondAddmaterials = new Addmaterials();
        //Addmaterials thirdAddmaterials = new Addmaterials();
        //System.out.println(Addmaterials.counter);//


    }
}
