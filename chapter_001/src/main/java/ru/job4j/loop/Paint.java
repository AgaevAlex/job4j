package ru.job4j.loop;

import java.util.function.BiPredicate;

/**
 * @author Agaev Alex (agaevalex97@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Paint {
    /**
     * Рисуем правую часть пирамиды.
     *
     * @param height высота = ширина пирамиды.
     * @return правая часть пирамиды.
     */
    public String rightTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= column
        );
    }

    /**
     * Рисуем левую часть пирамиды.
     *
     * @param height высота = ширина пирамиды.
     * @return левую часть пирамиды.
     */
    public String leftTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1
        );
    }

    /**
     * Рисуем пирамиду целиком.
     *
     * @param height высота = ширина пирамиды.
     * @return конечный результат пирамиды.
     */
    public String pyramid(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column
        );
    }

    private String loopBy(int height, int widht, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != widht; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}
