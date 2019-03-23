package ru.job4j.condition;

/**
 * Class MultiMax для вычисления максимума из трех чисел
 *
 * @author Alex Agaev (agaevalex97@gmail.com)
 * @since 22.03.2019
 */
public class MultiMax {
    /**
     * Method max.
     *
     * @param first,second,third - Три числа.
     * @return Большее из трех чисел
     */
    public int max(int first, int second, int third) {
        int result = first > second ? first : second;

        return result > third ? result : third;
    }
}