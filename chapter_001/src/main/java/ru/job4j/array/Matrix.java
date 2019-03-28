package ru.job4j.array;

/**
 * 6.6. Двухмерный массив. Таблица умножения.[#122488].
 */
public class Matrix {
    /**
     * 6.6. Двухмерный массив. Таблица умножения.[#122488]
     *
     * @param size- размерность массива.
     * @return полученный двумерный массив
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int out = 1; out <= size; out++) {
            for (int in = 1; in <= size; in++) {
                table[out - 1][in - 1] = in * out;
            }
        }
        return table;
    }
}