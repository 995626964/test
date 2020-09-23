public class SortUtils {
    /**
     * 冒泡排序
     * 稳定
     * 时间复杂度O(n^2)，原本有序的话是O(n)
     *
     * @param array
     */
    static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean sorted = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    sorted = false;
                }
            }
            if (sorted) break;
        }
    }

    /**
     * 选择排序
     * 不稳定
     * 时间复杂度O(n^2)
     *
     * @param array
     */
    static void selectionSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int maxIndex = 0;
            for (int j = 1; j <= i; j++) {
                //判断条件为 >= 以此增加稳定性
                if (array[j] >= array[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = array[maxIndex];
            array[maxIndex] = array[i];
            array[i] = temp;
        }
    }

    /**
     * 插入排序
     * 稳定
     * 时间复杂度O(n^2)
     *
     * @param array
     */
    static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentIndex = i;
            int value = array[currentIndex];
            while (currentIndex > 0 && value < array[currentIndex - 1]) {
                array[currentIndex] = array[currentIndex - 1];
                currentIndex--;
            }
            array[currentIndex] = value;
        }
    }


}
