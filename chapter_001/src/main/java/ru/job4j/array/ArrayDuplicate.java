package ru.job4j.array;


import java.util.Arrays;

/**
 * 6.8. Удаление дубликатов в массиве.[#122494].
 */
public class ArrayDuplicate {
    /**
     * Drop duplicates.
     *
     * @param array input array.
     * @return array without duplicates/
     */
    public String[] remove(String[] array) {
        int unique = array.length;
        for (int out = 0; out < unique; out++) {
            for (int in = out + 1; in < unique; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[unique - 1];
                    unique--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, unique);
    }

}
