public class App {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000);
        Notebook heavyNotebook = new Notebook(2000, 1500);
        Notebook oldNotebook = new Notebook(1200, 500);
        notebook.checkPrice();
        heavyNotebook.checkPrice();
        oldNotebook.checkPrice();
    }
}
