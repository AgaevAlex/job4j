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

        for (int out = 0; out < array.length - 1; out++) {
            for (int in = 0; in < array.length - out - 1; in++) {
                if (array[in] > array[in + 1]) {
                    int swap = array[in];
                    array[in] = array[in + 1];
                    array[in + 1] = swap;
                }
            }
        }
        return array;
    }
}
