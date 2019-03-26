package ru.job4j.array;

/**
 * 6.2. Перевернуть массив.[#122496].
 */
public class Turn {
    /**
     * Класс, переворачивающий массив.
     *
     * @param array - передаваемый массив.
     * @return перевернутый массив чисел.
     */
    public int[] back(int[] array) {
        for (int count = 0; count < array.length / 2; count++) {
            int a = array[count];
            array[count] = array[array.length - count - 1];
            array[array.length - count - 1] = a;

        }
        return array;
    }
}
