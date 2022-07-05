package com.kodilla.collections.adv.maps.homework;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> principalsInSchools = new HashMap<>();

        Principal smith = new Principal("John", "Smith");
        Principal stone = new Principal("Michael", "Stone");
        Principal brown = new Principal("David", "Brown");

        School tac = new School("The American Collage", Arrays.asList(10, 12, 11, 14, 13));
        School ace = new School("American Collage of Education", Arrays.asList(20, 18, 15, 14, 19));
        School auw = new School("American Collage in Washington", Arrays.asList(22, 30, 28, 32));

        principalsInSchools.put(smith, tac);
        principalsInSchools.put(stone, ace);
        principalsInSchools.put(brown, auw);

        for(Map.Entry<Principal, School> principalSchoolEntry: principalsInSchools.entrySet()){
            System.out.println(principalSchoolEntry.getKey().toString() +" has " +principalSchoolEntry.getValue().getAllStudentsValue()
                    + " students in " + principalSchoolEntry.getValue().getSchoolName() + " school");
        }

    }
}
