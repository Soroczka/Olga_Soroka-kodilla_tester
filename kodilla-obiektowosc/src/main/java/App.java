public class App {
    public static void main(String[] args) {
        //notebook
        Notebook notebook = new Notebook(600, 1000, 2020);
        Notebook heavyNotebook = new Notebook(2000, 1500, 2022);
        Notebook oldNotebook = new Notebook(1200, 500, 2016);
        notebook.checkPrice();
        notebook.checkWeight();
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();

        notebook.checkYearAndPrice();
        heavyNotebook.checkYearAndPrice();
        oldNotebook.checkYearAndPrice();

        //grades
        Grades grades = new Grades();
        grades.add(6);
        grades.add(1);
        grades.add(4);
        grades.add(6);
        grades.add(1);
        grades.add(4);
        grades.add(6);
        grades.add(1);
        grades.add(4);
        grades.add(6);
        grades.add(1);
        grades.add(4);

        System.out.println(grades.returnLastGrade());
        System.out.println(grades.returnGradesAverage());

        // user

        System.out.println("adding users");
        User user1 = new User("Kasia", 15);
        User user2 = new User("Zosia", 20);
        User user3 = new User("Krystian", 18);
        User user4 = new User("Zbyszek", 33);
        User user5 = new User("Zygfryd", 55);
        User[] users = {user1, user2, user3, user4, user5};

        for (int i = 0; i < users.length; i++){
            System.out.println("Name: "+users[i].getName()+", age:"+users[i].getAge());
        }

        //random

        System.out.println("Random numbers");

        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.generateRandomNumber();
        System.out.println(randomNumbers.getFirstNumber());
        System.out.println(randomNumbers.getLastNumber());

    }
}
