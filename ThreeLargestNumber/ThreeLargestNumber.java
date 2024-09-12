package ThreeLargestNumber;

public class ThreeLargestNumber {
    public static void main(String[] args) {
        int[] array = { 7, 20, 18, 4, 20, 19, 20, 24, 3 };
        getThreeLargestValues(array);
    }

    private static void getThreeLargestValues(int[] array) {
        int firstLargest = array[0];
        int firstLargestIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > firstLargest) {
                firstLargest = array[i];
                firstLargestIndex = i;

            }
        }

        int secondLargest = array[0];
        int secondLargestIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > secondLargest && (array[i] <= firstLargest && firstLargestIndex != i)) {
                secondLargest = array[i];
                secondLargestIndex = i;
            }
        }

        int thirdLargest = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > thirdLargest
                    && (array[i] <= secondLargest && array[i] <= firstLargest && secondLargestIndex != i
                            && firstLargestIndex != i)) {
                thirdLargest = array[i];
            }
        }

        System.out.println("This is first Largest " + firstLargest);
        System.out.println("This is second Largest " + secondLargest);
        System.out.println("This is third Largest " + thirdLargest);
    }
}
