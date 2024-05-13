package ru.netology.services;

public class CalcMonthly {
    public int calculate(int income, int expenses, int threshold) {

        int count = 0; // счетчик месяцев отдыха
        int money = 0; // количество денег
        for (int month = 0; month < 12; month++) {
            if (money < threshold) {

                money = money + income - expenses;           // зарабаток
            } else {
                money = (money - expenses) / 3;             // затраты
                count++;                                    // увеличиваем счетчик месяцев года
            }
        }
        return count;
    }
}