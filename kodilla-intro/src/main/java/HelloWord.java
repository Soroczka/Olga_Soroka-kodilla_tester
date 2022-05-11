public class HelloWord {

    private String name;
    private int age;
    private char firstLetterOfSurname;
    private double height;
    private boolean isGoodProgrammer;

    public HelloWord(String name, int age, char firstLetterOfSurname){
        this.name = name;
        this.age = age;
        this.firstLetterOfSurname = firstLetterOfSurname;
    }


    public void displayData(String imie, int age, char firstLetterOfSurname){
        System.out.println("Hello Word!");
        System.out.println("Mam na imię "+imie);
        System.out.println("Mam " + age + " lat");
        System.out.println("Pierwsza litera mojego nazwiska to: "+firstLetterOfSurname);
    }
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public char getFirstLetterOfSurname() {
        return this.firstLetterOfSurname;
    }


}

class AppHelloWord {

    public static void main(String[] args) {
        HelloWord hw = new HelloWord("Olga", 28, 'S');
        hw.displayData(hw.getName(), hw.getAge(), hw.getFirstLetterOfSurname());
    }

}