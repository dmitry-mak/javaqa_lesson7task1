package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {


    @Test
    void totalSalesWithCycleTest() {

        long[] monthlyIncomeArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        StatsService service = new StatsService();
        Assertions.assertEquals(expected, service.totalSalesWithCycle(monthlyIncomeArray));
    }

    @Test
    void averageSalesAmountTest() {

        long[] monthlyIncomeArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        StatsService service = new StatsService();
        Assertions.assertEquals(expected, service.averageSalesAmount(monthlyIncomeArray));
    }

    @Test
    void maxSalesMonthTest() {

        long[] monthlyIncomeArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        StatsService service = new StatsService();
        Assertions.assertEquals(expected, service.maxSalesMonth(monthlyIncomeArray));
    }


    @Test
    void minSalesMonth() {

        long[] monthlyIncomeArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        StatsService service = new StatsService();
        Assertions.assertEquals(expected, service.minSalesMonth(monthlyIncomeArray));
    }

    @Test
    void monthsSalesBelowAverage() {

        long[] monthlyIncomeArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        StatsService service = new StatsService();
        Assertions.assertEquals(expected, service.monthsSalesBelowAverage(monthlyIncomeArray));
    }

    @Test
    void monthsSalesOverAverage() {

        long[] monthlyIncomeArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        StatsService service = new StatsService();
        Assertions.assertEquals(expected, service.monthsSalesOverAverage(monthlyIncomeArray));
    }
}