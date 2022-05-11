public class SimpleArray {

    public static void main(String[] args) {
        String[] bookTitles = new String [6];
        bookTitles[0] = "Pierwszy";
        bookTitles[1] = "Drugi";
        bookTitles[2] = "Trzeci";
        bookTitles[3] = "Czwarty";
        bookTitles[4] = "Piąty";
        bookTitles[5] = "Szósty";

        String title = bookTitles[3];

        System.out.println(title);
        int arrayLength = bookTitles.length;
        System.out.println("Moja tablica zawiera " + arrayLength + " elementów");

    }

}
