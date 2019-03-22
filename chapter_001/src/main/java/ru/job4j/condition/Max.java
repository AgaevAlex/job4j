package ru.job4j.condition;

/**
 * Class Max для вычисления максимума из двух чисел
 *
 * @author Alex Agaev (agaevalex97@gmail.com)
 * @since 22.03.2019
 */
public class Max {
    /**
     * Method max.
     *
     * @param left,right - Два числа.
     * @return Большее из двух чисел
     */
    public int max(int left, int right) {
        return left > right ? left : right;
    }
}
