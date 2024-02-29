package ThreeLargestNumber;

public class ThreeLargestNumber {
    public static void main(String[] args) {
        int[] array = { 7, 20, 18, 4, 20, 19, 20, 24, 3 };
        getThreeLargestValues(array);
    }

    private static void getThreeLargestValues(int[] array) {
        int firstLargest = 0;
        int firstLargestIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > firstLargest) {
                firstLargest = array[i];
                firstLargestIndex = i;

            }
        }

        System.out.println("This is first Largest " + firstLargest);
    }
}
