import java.util.ArrayList;
import java.util.Random;

public class RandomNumbers {
    private int sum;
    private int number;
    private Random random = new Random();
    private ArrayList<Integer> numberList = new ArrayList();

    public void generateRandomNumber(){
        number = 0;
        sum = 0;
        do {
            number = random.nextInt(31);
            numberList.add(number);
            sum+=number;

        } while (sum < 5000);

        System.out.println("Sum: "+sum);

    }

    public int getFirstNumber(){
        return numberList.get(0);
    }

    public int getLastNumber(){
        return numberList.get(numberList.size()-1);
    }





}
