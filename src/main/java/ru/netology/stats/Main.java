package ru.netology.stats;


public class Main {
    public static void main(String[] args) {

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        System.out.println("Total sales with stream: " + service.totalSalesWithStream(months));
        System.out.println("Total sales with cycles: " + service.totalSalesWithCycle(months));
        System.out.println("Average sales: " + service.averageSalesAmount(months));
        System.out.println("Maximum: " + service.maxSalesMonth(months));
        System.out.println("Maximum sales month, stream: " + service.maxSalesMonthWithStream_findFirst(months));
        System.out.println("Maximum sales month, stream, reverse: " + service.maxSalesMonthWithStream_findLast(months));

        System.out.println("Minimal: " + service.minSalesMonth(months));
        System.out.println("Months below average: " + service.monthsSalesBelowAverage(months));
        System.out.println("Months over average: " + service.monthsSalesOverAverage(months));
    }
}