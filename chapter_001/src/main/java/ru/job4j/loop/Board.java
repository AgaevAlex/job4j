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
        for (int i = 0; i < height; i++) {
            for (int y = 0; y < width; y++) {
                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X
                if (((i + y) % 2) == 0) {
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