package ru.netology.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationCalculatorTest {
    @Test
    public void testCalculateMonthsOfVacation() {
        VacationCalculator calculator = new VacationCalculator();

        // Пример 1
        assertEquals(3, calculator.calculateMonthsOfVacation(10000, 3000, 20000));

        // Пример 2
        assertEquals(2, calculator.calculateMonthsOfVacation(100000, 60000, 150000));
    }
}

