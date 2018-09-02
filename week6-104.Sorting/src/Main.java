public class Main {
    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest)
                smallest = array[i];
        }

        return smallest;
    }


    public static int indexOfTheSmallest(int[] array) {
        int flag = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[flag])
                flag = i;
        }

        return flag;
    }



    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int flag = index;

        for (int i = index; i < array.length; i++) {
            if (array[i] < array[flag])
                flag = i;
        }

        return flag;
    }

    public static void swap(int[] array, int index1, int index2) {
        int n1 = array[index1];
        int n2 = array[index2];
        array[index1] = n2;
        array[index2] = n1;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
        }
    }
}
