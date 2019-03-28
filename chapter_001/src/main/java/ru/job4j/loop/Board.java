package ru.job4j.loop;

/**
 * 5.3. Построить шахматную доску в псевдографике.[#122484].
 */
public class Board {
    /**
     * Класс, формирующий доску определенной размерности.
     *
     * @param width,height ширина и высота доски.
     * @return доска.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int out = 0; out < height; out++) {
            for (int in = 0; in < width; in++) {
                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X
                if (((out + in) % 2) == 0) {
                    screen.append("x");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();
    }
}