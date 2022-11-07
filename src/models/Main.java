package models;

public class Main {
    public static void main(String[] args) {
        courses firstCourse = new courses ();
        courses secondCourse = new courses ();
        courses thirdCourse = new courses ();
        System.out.println(courses.counter);

        teachers firstTeacher = new teachers();
        teachers secondTeacher = new teachers();
        teachers thirdTeacher = new teachers();
        System.out.println(teachers.counter);

        students firstStudents = new students();
        students secondStudents = new students();
        students thirdStudents = new students();
        students fifthStudents = new students();
        students sixthStudents = new students();
        System.out.println(students.counter);

        lectures firstLecture = new lectures();
        lectures secondLectures = new lectures();
        lectures thirdLectures = new lectures();
        System.out.println(lectures.counter);

        homeworks firstHomework = new homeworks();
        homeworks secondHomework = new homeworks();
        homeworks thirdHomework = new homeworks();
        System.out.println(homeworks.counter);

        addmaterials firstAddmaterials = new addmaterials();
        addmaterials secondAddmaterials = new addmaterials();
        addmaterials thirdAddmaterials = new addmaterials();
        System.out.println(addmaterials.counter);


    }
}
