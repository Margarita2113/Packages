package ru.netology.Packages.servises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountMonthServiceTest {

    @Test
    void publicCalculateHolidays() {

        CountMonthService service = new CountMonthService();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int actual = service.calculate(income, expenses, threshold);
        int expected = 3;


        Assertions.assertEquals(expected, actual);
    }


}
