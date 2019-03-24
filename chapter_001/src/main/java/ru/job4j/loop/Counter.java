package ru.job4j.loop;

/**
 * Подсчет суммы чётных чисел в диапазоне[#122480].
 */
public class Counter {
    /**
     * Посчитываем сумму всех четных чисел в диапазоне.
     *
     * @param start,finish диапазон чисел.
     * @return сумма всех четных чисел в диапазоне.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int count = start; count <= finish; count++) {
            if ((count % 2) == 0)
                sum += count;
        }

        return sum;
    }
}

