package ru.job4j.loop;

/**
 * 5.2. Создать программу, вычисляющую факториал.[#122481].
 */
public class Factorial {
    /**
     * Вычисляет факториал числа.
     *
     * @param n факториал какого числа требуется посчитать.
     * @return факториал числа.
     */
    public int calc(int n) {
        int result = 1;
        for (int count = 1; count <= n; count++) {
            result *= count;
        }
        return result;
    }
}
