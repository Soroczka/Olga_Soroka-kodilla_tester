package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
        //processUsersStream();
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames =UsersRepository.getUsersList()
                .stream()
                .filter(user ->user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames;
    }

    private static void processUsersStream() {
        UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                //.map(user -> user.getUsername()) //wyrażenie lambda
                .map(UsersManager::getUserName)  //referencja do metody gdy istnieje metoda ponizej: getUserName
                .forEach(username -> System.out.println(username));
    }


    public static String getUserName(User user) {
        return user.getUsername();
    }


}
