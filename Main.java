import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] randomArray = generateRandomArray(10, 100);
        printArray(randomArray);
        TestSuite.run(randomArray, 1);
    }

    public static int[] generateRandomArray(int size, int range) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(range);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
