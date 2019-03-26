package ru.job4j.array;
/**
 * 6.3. Массив заполнен true или false[#122490].
 */
public class Check {
    /**
     * Класс, проверяющий все элементы в массиве на true или false.
     *
     * @param data- передаваемый массив.
     * @return Если все элементы массива являются true, то результат будет true, иначе false.
     */
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (boolean aData : data)
            if (!aData) {
                result = false;
                return result;
            } else result = true;
        return result;
    }
}