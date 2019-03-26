package ru.job4j.array;


/**
 * 6.5. Создать программу для сортировки массива методом перестановки.[#122493].
 */
public class BubbleSort {
    /**
     * Метод, принимающий массив и сортирующий его методом перестановки.
     *
     * @param array массив чисел.
     * @return отсортированный массив.
     */
    public int[] sort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int y = 0; y < array.length - i - 1; y++) {
                if (array[y] > array[y + 1]) {
                    int swap = array[y];
                    array[y] = array[y + 1];
                    array[y + 1] = swap;
                }
            }


        }
        return array;
    }
}
