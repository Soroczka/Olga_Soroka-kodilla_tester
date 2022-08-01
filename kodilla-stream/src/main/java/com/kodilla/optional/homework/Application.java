package com.kodilla.optional.homework;

import com.kodilla.stream.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kasia Bialek", new Teacher("Krzysztof Kolumb")));
        students.add(new Student("Wojtek Marczynski", new Teacher("Wacław Kurzępa")));
        students.add(new Student("Marek Wrona", null));
        students.add(new Student("Małgorzata Wielbłąd", null));

        List<Student> second = Application.showAllStudentsWithTeachersList(students);
        for (Student student: second){
            System.out.println("Uczeń: "+student.getName() + ", nauczyciel: "+student.getTeacher().getName());
        }
        //showAllStudentsWithTeachers(students);
    }

    public static void showAllStudentsWithTeachers(List<Student> students){
        for(Student student: students){
            Optional <Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            String teacher = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
            System.out.println("Uczeń: "+student.getName() + ", nauczyciel: "+teacher);
        }
    }

    public static List<Student> showAllStudentsWithTeachersList(List<Student> students){
        List<Student> newStudentsList = new ArrayList<>();
        for(Student s: students){
            Optional <Teacher> optionalTeacher = Optional.ofNullable(s.getTeacher());
            String teacher = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
            newStudentsList.add(new Student(s.getName(), new Teacher(teacher)));
        }
        return newStudentsList;
    }
}
