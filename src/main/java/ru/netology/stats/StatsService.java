package ru.netology.stats;

public class StatsService {
    public double sumSales(double[] sales) {
        double sum = 0;
        for (double t : sales) sum = sum + t;
        return sum;
    }

    public double avgSales(double[] sales) {
//        double sum = 0;
//        for (double t : sales) sum = sum + t;
//        return sum/sales.length;

        return Math.round(sumSales(sales) * 100 / sales.length) / 100;   //округление для случая, если будут данные с цифрами после запятой
    }

    public double maxSalesMonth(double[] sales) {
        int maxMonth = 0;
        for (int i = 0; i <= sales.length - 1; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public double minSalesMonth(double[] sales) {
        int minMonth = 0;
        for (int i = 0; i <= sales.length - 1; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public double countMonthWithSalesBelowAverage(double[] sales) {
        int countMonth = 0;
        for (int i = 0; i <= sales.length - 1; i++) {
            if (sales[i] < avgSales(sales)) {
                countMonth++;
            }
        }
        return countMonth;
    }

    public double countMonthWithSalesAboveAverage(double[] sales) {
        int countMonth = 0;
        for (int i = 0; i <= sales.length - 1; i++) {
            if (sales[i] > avgSales(sales)) {
                countMonth++;
            }
        }
        return countMonth;
    }
}