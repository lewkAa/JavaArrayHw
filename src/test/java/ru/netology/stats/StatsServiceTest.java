package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {

    @Test
    public void getMinSalesTest() {
        StatsService service = new StatsService();
        long[] sales = {45, 52, 21, 77, 38, 45, 11, 69, 51, 73, 47, 55};
        int expectedMonth = 7;
        int actual = service.getMinSales(sales);
        Assertions.assertEquals(expectedMonth, actual);

    }

    @Test
    public void getMaxSalesTest() {
        StatsService service = new StatsService();
        long[] sales = {1, 52, 21, 77, 38, 45, 11, 69, 51, 73, 47, 99};
        int expectedMonth = 12;
        int actual = service.getMaxSales(sales);
        Assertions.assertEquals(expectedMonth, actual);

    }

    @Test
    public void getSumSalesTest() {
        StatsService service = new StatsService();
        long[] sales = {76, 54, 84, 31, 90, 43, 11, 37, 34, 77, 29, 14};
        long expectedSum = 580;
        long actual = service.getSumSales(sales);
        Assertions.assertEquals(expectedSum, actual);

    }

    @Test
    public void getMonthAverageTest() {
        StatsService service = new StatsService();
        long[] sales = {12, 34, 87, 66, 31, 19, 27, 83, 72, 16, 61, 88};
        long expectedAverage = 49;
        long actual = service.getMonthAverage(sales);
        Assertions.assertEquals(expectedAverage, actual);

    }

    @Test
    public void getBelowAverageTest() {
        StatsService service = new StatsService();
        long[] sales = {12, 34, 87, 66, 31, 19, 27, 83, 72, 16, 61, 88};
        int expectedBelow = 6;
        int actual = service.getBelowAverage(sales);
        Assertions.assertEquals(expectedBelow, actual);

    }

    @Test
    public void getAboveAverageTest() {
        StatsService service = new StatsService();
        long[] sales = {12, 34, 87, 66, 31, 19, 27, 83, 72, 16, 61, 88};
        int expectedAbove = 6;
        int actual = service.getAboveAverage(sales);
        Assertions.assertEquals(expectedAbove, actual);

    }
}
