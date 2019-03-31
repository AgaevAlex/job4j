package ru.job4j.array;

/**
 * Объединить два массива [#124482]
 */
public class TestSort {
    /**
     *
     * @param a,b два отсортированных массива
     * @return третий отсортированный массив
     */
    public int[] sort(int[] a, int[] b) {
        int aIndex = 0;
        int bIndex = 0;
        int cIndex = 0;
        int[] result = new int[a.length + b.length];
        while (aIndex<a.length && bIndex<b.length) {
            if (a[aIndex] > b[bIndex]) {
                result[cIndex] = b[bIndex];
                bIndex++;

            } else {
                result[cIndex] = a[aIndex];
                aIndex++;
            }
            cIndex++;
        }
            while (aIndex< a.length){
                result[cIndex++] = a[aIndex++];
            }
        while (bIndex< b.length){
            result[cIndex++] = b[bIndex++];
        }
        return result;
    }
}


