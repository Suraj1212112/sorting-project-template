public class BubbleSort implements Sorter {

    public void sort(int[] input) {
        for (int outer = 0; outer < input.length - 1; outer++) {
            for (int inner = 0; inner < input.length - outer - 1; inner++) {
                if (input[inner] > input[inner + 1]) {
                    int temp = input[inner];
                    input[inner] = input[inner + 1];
                    input[inner + 1] = temp;
                }
            }
        }
    }
}
