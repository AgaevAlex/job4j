package ru.job4j.calculate;

/**
 * Class Calculator для расчета арифметических операций
 *
 * @author Alex Agaev (agaevalex97@gmail.com)
 * @since 22.03.2019
 */
public class Calculator {
    /**
     * Method add.
     *
     * @param first  - First arg.
     * @param second - Second arg
     * @return Sum first and second
     */
    public double add(double first, double second) {
        return first + second;
    }

    /**
     * Method subrtract.
     *
     * @param first  - First arg.
     * @param second - Second arg
     * @return Subtract from first second
     */
    public double subtract(double first, double second) {
        return first - second;
    }

    /**
     * Method div.
     *
     * @param first  - First arg.
     * @param second - Second arg
     * @return share the first to the second
     */
    public double div(double first, double second) {
        return first / second;
    }

    /**
     * Method multiple.
     *
     * @param first  - First arg.
     * @param second - Second arg
     * @return multiple first and second
     */
    public double multiple(double first, double second) {
        return first * second;
    }
}
