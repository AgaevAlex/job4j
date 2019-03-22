package ru.job4j.condition;

/**
 * Class Point для вычисления расстояния между двумя точками в системе координат.
 *
 * @author Alex Agaev (agaevalex97@gmail.com)
 * @since 22.03.2019
 */
public class Point {
    /**
     * Method add.
     *
     * @param x1,x2,y2,y1 -args .
     * @return полученный результат вычислений.
     */
    public double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow(x2 - x1, 2);
        double second = Math.pow(y2 - y1, 2);
        return Math.sqrt(first + second);
    }
}