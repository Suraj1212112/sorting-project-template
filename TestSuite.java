import java.util.Arrays;

public class TestSuite {

    public static void run(int[] testInput, int loops) {
        boolean pass = true;

        System.out.println("Running test with input: " + Arrays.toString(testInput));

        BubbleSort b = new BubbleSort();
        pass &= basicTest(b, testInput, loops);

        MergeSort m = new MergeSort();
        pass &= basicTest(m, testInput, loops);

        SelectionSort s = new SelectionSort();
        pass &= basicTest(s, testInput, loops);

        InsertionSort i = new InsertionSort();
        pass &= basicTest(i, testInput, loops);

        if (pass) {
            System.out.println("--- TEST PASSED! Congrats! ---");
        } else {
            System.out.println("--- TEST FAILED! :( ---");
        }
    }

    public static boolean basicTest(Sorter s, int[] unsorted, int loops) {
        boolean result = false;
        String className = s.getClass().getSimpleName();
        System.out.println("\n--- Testing: " + className + " ---");

        long startTime = System.nanoTime();
        for (int x = 0; x < loops; x++) {
            int[] test = unsorted.clone();
            s.sort(test);
            result = checkResults(test);
        }
        long endTime = System.nanoTime();

        double duration = (endTime - startTime) / 1000000000.0;
        System.out.println(className + " took: " + duration + " seconds for " + loops + " loops.");

        return result;
    }

    public static boolean checkResults(int[] sorted) {
        for (int i = 0; i < sorted.length - 1; i++) {
            if (sorted[i] > sorted[i + 1]) {
                System.out.println("Error at index " + i + ": " + sorted[i] + " > " + sorted[i + 1]);
                return false;
            }
        }
        return true;
    }
}
