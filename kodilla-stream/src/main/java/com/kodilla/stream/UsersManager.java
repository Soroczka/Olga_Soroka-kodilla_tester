package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
//        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
//        System.out.println(chemistGroupUsernames);
        List <User> users = filterUsersOlderThan(40);
        System.out.println(users);
        List <String> posts = filterPostsSmallerThan(5);
        System.out.println(posts);
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

    public static List<User> filterUsersOlderThan(int age){
        List<User> users = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() >= age)
                .collect(Collectors.toList());
        return users;
    }

    public static List<String> filterPostsSmallerThan(int number){
        List<String> usersPosts = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() > number)
                .map(UsersManager::getUserAndPost)
                .collect(Collectors.toList());
        return usersPosts;
    }



    public static String getUserName(User user) {
        return user.getUsername();
    }


    public static String getUserAndPost(User user) {
        return user.getUsername() + "has " + user.getNumberOfPost() + " posts";
    }

}
