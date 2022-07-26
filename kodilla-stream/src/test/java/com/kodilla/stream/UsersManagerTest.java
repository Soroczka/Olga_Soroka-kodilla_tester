package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UsersManagerTest {
    @Test
    void testValueOfMembersAfterUsedFilterChemistGroupUsernames() {
        //Given
        List<User> chemistGroupUsernames = new ArrayList<>();
        chemistGroupUsernames.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        chemistGroupUsernames.add(new User("Walter White", 50, 7, "Chemists"));
        //When
        List<String> result = UsersManager.filterChemistGroupUsernames();
        //Then
        assertEquals(chemistGroupUsernames.size(), result.size());
    }

    @Test
    void checkAreUsernamesAreCorrectForChemists() {
        //Given
        User user1 = new User("Walter White", 50, 7, "Chemists");
        User user2 = new User("Gale Boetticher", 44, 2, "Chemists");
        String userName1 = user1.getUsername();
        String userName2 = user2.getUsername();
        //When
        List<String> result = UsersManager.filterChemistGroupUsernames();
        String chemist1 = result.get(0);
        String chemist2 = result.get(1);
        //Then
        assertEquals(userName1, chemist1);
        assertEquals(userName2, chemist2);
    }

    @Test
    void testIsReturnListOfUsersOlderAndEqual49(){
        //Given
        //When
        List<User> result = UsersManager.filterUsersOlderThan(49);
        int value = result.size();
        //Then
        assertEquals(3, value);
    }

    @Test
    void testIsEachReturnedUserIsOlderOrEqual49(){
        //Given
        int expectedAge = 49;
        //When
        List<User> result = UsersManager.filterUsersOlderThan(expectedAge);
        int value = result.size();
        //Then
        for (User user: result){
            int age = user.getAge();
            assertTrue(age >= expectedAge);
        }

    }
}