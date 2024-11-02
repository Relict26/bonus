package ru.netology.services;

public class VacationCalculator {
    public int calculateMonthsOfVacation(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money -= expenses; // тратим на обязательные расходы
                money -= money / 3; // тратим на отдых (уменьшаем на треть)
            } else {
                money += income; // зарабатываем
                money -= expenses; // тратим на обязательные расходы
            }
        }
        return count; // возвращаем количество месяцев отдыха
    }
}