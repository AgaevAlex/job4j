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
        for (int i = 1; i <= size; i++) {
            for (int y = 1; y <= size; y++) {
                table[i - 1][y - 1] = y * i;
            }
        }
        return table;
    }
}