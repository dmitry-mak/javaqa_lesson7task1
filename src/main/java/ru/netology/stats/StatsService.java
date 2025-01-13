package ru.netology.stats;


public class StatsService {

    //      нахождение суммы всех элементов массива
    public long totalSales(long[] months) {

        long sum = 0;
        for (long i : months) {
            sum += i;
        }
        return sum;
    }

    //  нахождение средней суммы продаж за месяц
    public long averageSalesAmount(long[] months) {

        return totalSales(months) / months.length;
    }

    //   нахождение номера месяца с максимальными продажами
    public int maxSalesMonth(long[] months) {

        int monthWithMaxSales = 0;
        for (int i = 0; i < months.length; i++) {
            if (months[i] >= months[monthWithMaxSales]) {
                monthWithMaxSales = i;
            }
        }
        return monthWithMaxSales + 1;
    }


    //    нахождение номера месяца с минимальными продажами
    public int minSalesMonth(long[] months) {

        int monthWithMinSales = 0;
        for (int i = 0; i < months.length; i++) {
            if (months[i] <= months[monthWithMinSales]) {
                monthWithMinSales = i;
            }
        }
        return monthWithMinSales + 1;
    }

    //    нахождения количества месяцев с продажами ниже среднего
    public int monthsSalesBelowAverage(long[] months) {
        int count = 0;
        long averageSale = averageSalesAmount(months);
        for (long x : months) {
            if (x < averageSale) {
                count++;
            }
        }
        return count;
    }

    //    нахождение количества месяцев с продажами выше среднего
    public int monthsSalesOverAverage(long[] months) {
        int count = 0;
        long averageSale = averageSalesAmount(months);
        for (long x : months) {
            if (x > averageSale) {
                count++;
            }
        }
        return count;
    }
}
