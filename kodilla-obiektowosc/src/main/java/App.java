public class App {
    public static void main(String[] args) {
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

    }
}
