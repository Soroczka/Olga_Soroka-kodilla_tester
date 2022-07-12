package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {
    @Test
    void testFilterChemistGroupUsernames() {
        //Given
        UsersRepository usersRepository = new UsersRepository();
        List<User> chemistGroupUsernames = usersRepository.getUsersList();
        //When

        //Then

    }
}