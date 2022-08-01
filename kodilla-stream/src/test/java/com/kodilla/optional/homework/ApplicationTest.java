package com.kodilla.optional.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ApplicationTest {


    @Test
    public void testIsNewStudentsListHasTheSameNumberOfElements(){
        //Given
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kasia Bialek", new Teacher("Krzysztof Kolumb")));
        students.add(new Student("Wojtek Marczynski", new Teacher("Wacław Kurzępa")));
        //When
        List<Student> newList = (Application.showAllStudentsWithTeachersList(students));
        //Then
        Assertions.assertEquals(students.size(), newList.size());


    }

    @Test //spr czy na pewno żaden teacher nie jest nullem
    public void testThereAreNoNullValueInTeacherName(){
        //Given
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kasia Bialek", new Teacher("Krzysztof Kolumb")));
        students.add(new Student("Wojtek Marczynski", new Teacher("Wacław Kurzępa")));
        students.add(new Student("Marek Wrona", null));
        students.add(new Student("Małgorzata Wielbłąd", null));
        //When
        List<Student> newList = (Application.showAllStudentsWithTeachersList(students));
        //Then
        for (Student s: newList){
            Assertions.assertNotNull(s.getTeacher().getName());
        }
    }

   @Test //spr czy jeżeli teacher jest nullem to zostanie zastapiony na inny string
    public void testTeacherHasNullValueThenNullWillBeReplaced(){
        //Given
       List<Student> students = new ArrayList<>();
       students.add(new Student("Marek Wrona", null));
       students.add(new Student("Małgorzata Wielbłąd", null));
       String expectedString = "<undefined>";
       //When
       List<Student> newList = (Application.showAllStudentsWithTeachersList(students));
       //Then
       for (Student s: newList){
           Assertions.assertEquals(expectedString, s.getTeacher().getName());
       }
    }
}
