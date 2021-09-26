package ru.job4j.array;

/**
 * Объединить два массива [#124482]
 */
public class TestSort {
    /**
     * @param first,second два отсортированных массива
     * @return третий отсортированный массив
     */
    public int[] sort(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        int i = first.length - 1;
        int j = second.length - 1;
        int k = result.length;
        while (k > 0) {
            result[--k] = (j < 0 || (i >= 0 && first[i] >= second[j])) ? first[i--] : second[j--];
        }
        return result;
    }
}