package ru.job4j.array;

/**
 * 6.0. Заполнить массив степенями чисел.[#122486].
 */
public class Square {

    /**
     * Класс, заполняющий массив числами, возведенными в квадрат.
     *
     * @param bound размерность массива.
     * @return заполненный массив.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int count = 1; count <= bound; count++) {
            rst[count - 1] = count * count;
        }
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        return rst;
    }
}