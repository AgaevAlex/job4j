package ru.job4j.array;

/**
 * Обертка над строкой.
 */
public class ArrayChar {
    private char[] data;

    /**
     * Метод, принимающий строку и записывающий ее в массив data.
     *
     * @param line принимаемое слово.
     */
    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Проверяет, что слово начинается с префикса.
     * проверяет, что массив data имеет первые элементы, одинаковые с value
     * @param prefix префикс.
     * @return если слово начинается с префикса
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        for (int count = 0; count < value.length; count++) {
            if (value[count] != this.data[count]) {
                result = false;
                break;
            }
        }
        return result;
    }
}