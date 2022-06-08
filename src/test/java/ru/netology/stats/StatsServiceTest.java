package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sumSalesTest() {
        StatsService service = new StatsService();
        double[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        double expected = 180;
        double actual = service.sumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void avgSalesTest() {
        StatsService service = new StatsService();
        double[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        double expected = 15;
        double actual = service.avgSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSalesMonthTest() {
        StatsService service = new StatsService();
        double[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        double expected = 8;
        double actual = service.maxSalesMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSalesMonthTest() {
        StatsService service = new StatsService();
        double[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        double expected = 9;
        double actual = service.minSalesMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countMonthWithSalesBelowAverageTest() {
        StatsService service = new StatsService();
        double[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        double expected = 5;
        double actual = service.countMonthWithSalesBelowAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countMonthWithSalesAboveAverageTest() {
        StatsService service = new StatsService();
        double[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        double expected = 5;
        double actual = service.countMonthWithSalesAboveAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}
