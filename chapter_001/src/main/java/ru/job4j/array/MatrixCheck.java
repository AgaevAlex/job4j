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
        boolean result = true;
        for (int count = 0; count < data.length; count++) {
            if (data[0][0] != data[count][count] || (data[data.length - count - 1][count] != data[0][data.length - 1])) {
                result = false;
                break;
            }


        }


        return result;
    }
}