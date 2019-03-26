package ru.job4j.array;

/**
 * 6.7. Квадратный массив заполнен true или false по диагоналям.[#122491].
 */
public class MatrixCheck {
    /**
     * 6.7. Квадратный массив заполнен true или false по диагоналям.[#122491].
     *
     * @param data- двумерная матрица.
     * @return true или false в зависимости от диагоналей матрицы
     */
    public boolean mono(boolean[][] data) {
        boolean result;
        for (int count = 0; count < data.length - 1; count++) {
            result = data[count][count] == data[count + 1][count + 1];
            if (!result) {
                return false;
            }
        }
        for (int count1 = 0; count1 < data.length; count1++) {
            result = data[data.length - count1 - 1][count1] == data[data.length - 1][data.length - 1];
            if (!result) {
                return false;
            }

        }


        return true;
    }
}