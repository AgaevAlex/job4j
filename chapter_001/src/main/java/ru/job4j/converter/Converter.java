package ru.job4j.converter;

/**
 * Корвертор валюты.
 */
public class Converter {

    private int euro = 70;
    private int dollar = 60;

    /**
     * Конвертируем рубли в евро.
     *
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        return value / euro;
    }

    /**
     * Конвертируем рубли в доллары.
     *
     * @param value рубли.
     * @return доллары.
     */
    public int rubleToDollar(int value) {
        return value / dollar;
    }

    /**
     * Конвертируем доллары в рубли
     *
     * @param value доллары.
     * @return Рубли.
     */
    public int dollarToRuble(int value) {
        return value * dollar;
    }

    /**
     * Конвертируем евро в рубли.
     *
     * @param value евро.
     * @return Рубли.
     */
    public int euroToRuble(int value) {
        return value * euro;
    }
}
