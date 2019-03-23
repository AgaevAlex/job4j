package ru.job4j.condition;

import static org.hamcrest.Matchers.is;
import org.junit.Test;


import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;


public class TriangleTest {
    /**
     * Проверка, когда треугольник можно построить.
     */
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        // Создаем объект треугольник.
        Triangle triangle = new Triangle();
        // Вычисляем площадь.
        double result = triangle.area(0, 0, 0, 2, 2, 0);
        // Задаем ожидаемый результат.
        double expected = 2D;
        //Проверяем результат и ожидаемое значение.
        assertThat(result, closeTo(expected, 0.1));
    }

    /**
     * Тест, когда треугольник не может быть построен.
     */
    @Test
    public void whenTriangleCanNotBeBuilt() {
        // Создаем объект треугольник.
        Triangle triangle = new Triangle();
        // Вычисляем площадь.
        double result = triangle.area(0, 0, 2, 2, 2, 2);
        // Задаем ожидаемый результат.
        double expected = -1D;
        //Проверяем результат и ожидаемое значение.
        assertThat(result, is(expected));
    }
}
