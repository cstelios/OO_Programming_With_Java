import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] values = {6, 5, 8, 7, 11, -3, 10, 4, -1, 10, 7, 2, 1};
        System.out.println("smallest: " + smallest(values));
        System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values, 6));
        System.out.println(indexOfTheSmallestStartingFrom(values, 10));

        int[] values2 = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(values2));

        swap(values2, 1, 0);
        System.out.println(Arrays.toString(values2));

        swap(values2, 0, 3);
        System.out.println(Arrays.toString(values2));
        
        int[] values3 = {5, 7, 3, 8, 2, 9, 6, 1, 4, 10, 0, 12, 11};
        System.out.println("");
        System.out.println(Arrays.toString(values3));
        sort(values3);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int indexOut = index;
        for (int i = index; i < array.length; i++) {
            if (array[i] < array[indexOut]) {
                indexOut = i;
            }
        }
        return indexOut;
    }

    public static void swap(int[] array, int index1, int index2) {
        int valueAtIndex1 = array[index1];

        array[index1] = array[index2];
        array[index2] = valueAtIndex1;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
    }
}
