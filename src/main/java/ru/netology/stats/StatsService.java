package ru.netology.stats;


public class StatsService {

    //      нахождение суммы всех элементов массива с помощью цикла
    public int totalSalesWithCycle(int[] months) {

        int sum = 0;
        for (int i : months) {
            sum += i;
        }
        return sum;
    }

    //  нахождение средней суммы продаж за месяц
    public int averageSalesAmount(int[] months) {

        return totalSalesWithCycle(months) / months.length;
    }

    //   нахождение номера месяца с максимальными продажами
    public int maxSalesMonth(int[] months) {

        int monthWithMaxSales = 0;
        for (int i = 0; i < months.length; i++) {
            if (months[i] >= months[monthWithMaxSales]) {
                monthWithMaxSales = i;
            }
        }
        return monthWithMaxSales + 1;
    }


    //    нахождение номера месяца с минимальными продажами
    public int minSalesMonth(int[] months) {

        int monthWithMinSales = 0;
        for (int i = 0; i < months.length; i++) {
            if (months[i] <= months[monthWithMinSales]) {
                monthWithMinSales = i;
            }
        }
        return monthWithMinSales + 1;
    }

    //    нахождения количества месяцев с продажами ниже среднего
    public int monthsSalesBelowAverage(int[] months) {
        int count = 0;
        for (int x : months) {
            if (x < averageSalesAmount(months)) {
                count++;
            }
        }
        return count;
    }

    //    нахождение количества месяцев с продажами выше среднего
    public int monthsSalesOverAverage(int[] months) {
        int count = 0;
        for (int x : months) {
            if (x > averageSalesAmount(months)) {
                count++;
            }
        }
        return count;
    }
}
