package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertEquals(result.size(), chemistGroupUsernames.size());
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
        assertEquals(chemist1, userName1);
        assertEquals(chemist2, userName2);
    }
}