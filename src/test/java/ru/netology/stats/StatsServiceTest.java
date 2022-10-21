package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class StatsServiceTest {


    @Test
    void shouldSumAllSales() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long expected = 180;

        // вызываем целевой метод:
        long actual = service.sumSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldAverageAllSales() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long expected = 15;

        // вызываем целевой метод:
        long actual = service.averageSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthWithMaxSales() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long expected = 8;

        // вызываем целевой метод:
        long actual = service.maxSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthWithMixSales() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long expected = 9;

        // вызываем целевой метод:
        long actual = service.minSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountMonthWithSalesBelowAverage() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long expected = 5;

        // вызываем целевой метод:
        long actual = service.belowAverage(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountMonthWithSalesAboveAverage() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long expected = 5;

        // вызываем целевой метод:
        long actual = service.aboveAverage(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}