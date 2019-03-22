package ru.job4j.calculator;

/**
 * Программа расчета идеального веса.
 */
public class Fit {
    /**
     * Коэффициент для вычисления идеального веса
     */
    private double i = 1.15;

    /**
     * Идеальный вес для мужщины.
     *
     * @param height Рост.
     * @return идеальный вес.
     */
    public double manWeight(double height) {
        return (height - 100) * i;
    }

    /**
     * Идеальный вес для женщины.
     *
     * @param height Рост.
     * @return идеальный вес.
     */
    public double womanWeight(double height) {
        return (height - 110) * i;
    }
}