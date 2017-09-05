import pojo.Profession;
import pojo.Student;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EntryPoint {

    public static void main(String[] args) {

        Student student1 = new Student(2, "Alex", 89);
        Student student2 = new Student(1, "Piter", 40);
        Student student3 = new Student(2, "Max", 55);
        Student student4 = new Student(3, "Serg", 49);
        Student student5 = new Student(2, "Ivan", 70);
        Student student6 = new Student(1, "Pavel", 30);
        Student student7 = new Student(3, "Oleg", 72);
        Student student8 = new Student(1, "Olga", 64);

        ArrayList<Student> students = addStudents(student1, student2, student3, student4, student5, student6, student7, student8);

        System.out.printf("Task#1"+"\n");
        System.out.printf("===================="+"\n");

        students.stream()
                .filter(student -> student.getGroupNumber()==3).forEach(System.out::println); //task #1

        System.out.printf("Task#2"+"\n");
        System.out.printf("===================="+"\n");

        students.stream()
                .filter(student -> student.getGroupNumber()==2&& student.getPointOfstudy()>80)
        .forEach(System.out::println); //task #2

        System.out.printf("Task#3"+"\n");
        System.out.printf("===================="+"\n");

        students.stream()
                .filter(student ->student.getPointOfstudy()>80)
                .map(student -> new Profession(student.getStudentName()))
                .forEach(System.out::println);

        //.map(Student::getStudentName).forEach(System.out::println); //вывести весь лист

    }

    private static ArrayList<Student> addStudents(Student student1, Student student2, Student student3, Student student4, Student student5, Student student6, Student student7, Student student8) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        return students;
    }
}
