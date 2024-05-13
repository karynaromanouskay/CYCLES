import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.CalcMonthly;

public class CalcMonthTest {

    @Test
    void shouldCalculateMonthOne() {
        CalcMonthly service = new CalcMonthly();

        // данные
        int income = 10_000;        // доход
        int expenses = 3_000;      // издержки
        int threshold = 20_000;    // граница
        int expected = 3;          // количество ожидаемых месяцев отдыха

        // вызываем метод
        int actual = service.calculate(income, expenses, threshold);

        // сравниваем ожидаемый и фактический:
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthTwo() {
        CalcMonthly service = new CalcMonthly();

        // данные
        int income = 100_000;        // доход
        int expenses = 60_000;      // издержки
        int threshold = 150_000;    // граница
        int expected = 2;          // количество ожидаемых месяцев отдыха

        // вызываем метод
        int actual = service.calculate(income, expenses, threshold);

        // сравниваем ожидаемый и фактический:
        Assertions.assertEquals(expected, actual);
    }
}