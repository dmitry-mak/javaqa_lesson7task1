package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {


    @Test
    void totalSalesWithCycleTest() {

        int[] monthlyIncomeArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        StatsService service = new StatsService();
        Assertions.assertEquals(expected, service.totalSalesWithCycle(monthlyIncomeArray));
    }

    @Test
    void averageSalesAmountTest() {

        int[] monthlyIncomeArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        StatsService service = new StatsService();
        Assertions.assertEquals(expected, service.averageSalesAmount(monthlyIncomeArray));
    }

    @Test
    void maxSalesMonthTest() {

        int[] monthlyIncomeArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        StatsService service = new StatsService();
        Assertions.assertEquals(expected, service.maxSalesMonth(monthlyIncomeArray));
    }


    @Test
    void minSalesMonth() {

        int[] monthlyIncomeArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        StatsService service = new StatsService();
        Assertions.assertEquals(expected, service.minSalesMonth(monthlyIncomeArray));
    }

    @Test
    void monthsSalesBelowAverage() {

        int[] monthlyIncomeArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        StatsService service = new StatsService();
        Assertions.assertEquals(expected, service.monthsSalesBelowAverage(monthlyIncomeArray));
    }

    @Test
    void monthsSalesOverAverage() {

        int[] monthlyIncomeArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        StatsService service = new StatsService();
        Assertions.assertEquals(expected, service.monthsSalesOverAverage(monthlyIncomeArray));
    }
}