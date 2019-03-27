package ru.job4j.array;

/**
 * 6.3. Массив заполнен true или false[#122490].
 */
public class Check {
    /**
     * Метод, проверяющий все элементы в массиве на true или false.
     *
     * @param data- передаваемый массив.
     * @return Если все элементы массива являются либо true, либо false, то результат будет true, иначе false.
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int count = 1; count < data.length ; count++) {
            if (data[0] !=data[count]){
                result = false;
                break;
            }

        }
        return result;
    }
}