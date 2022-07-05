package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {
    private List<Integer> studentsInClassValue = new ArrayList<>();
    private String schoolName;

    public School(String schoolName, List<Integer> studentsInClassValue) {
        this.studentsInClassValue = studentsInClassValue;
        this.schoolName = schoolName;
    }

    public int getAllStudentsValue(){
        int sum = 0;
        for(Integer student: studentsInClassValue){
            sum += student;
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(studentsInClassValue, school.studentsInClassValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentsInClassValue);
    }


    public String getSchoolName() {
        return schoolName;
    }
}
