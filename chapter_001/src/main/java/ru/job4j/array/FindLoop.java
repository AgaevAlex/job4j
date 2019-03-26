package ru.job4j.array;

/**
 * 6.1. Классический поиск перебором.[#122487].
 */
public class FindLoop {
    /**
     * Класс, заполняющий массив числами, возведенными в квадрат.
     *
     * @param data,int - передаваемый массив, искомое число в массиве.
     * @return индекс найденного элемента массива.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
