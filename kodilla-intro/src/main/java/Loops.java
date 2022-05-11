import java.util.Random;

public class Loops {

    int [] numbers = new int[] {1, 2, 3, 4, 5, 5, 9, 0, -1};

    //metoda dla pętli For
    public int sum(){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }

    public int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(10);
            sum = sum + temp;
            result++;
        }
        return result;
    }


        public static void main(String[] args) {

        //ćwiczenie pętla For
        String[] names = new String[] {"Zygfryd", "Gwidon", "Florentyna"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }

        // Rozwiązanie zadania dla pętli For
        Loops loops = new Loops();
        int sum = loops.sum();
        System.out.println(sum);

        //ćwiczenie pętla While
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        int result = loops.getCountOfRandomNumber(100);
        System.out.println(result);

    }
}
