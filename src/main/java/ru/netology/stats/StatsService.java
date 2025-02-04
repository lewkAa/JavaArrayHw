package ru.netology.stats;

public class StatsService {

    public int getMinSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int getMaxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public long getSumSales(long[] sales) {
        long sumSales = 0;
        for ( long i : sales) {
            sumSales += i;
        }
        return sumSales;
    }

    public long getMonthAverage(long [] sales) {
        long monthAverage = getSumSales(sales);
        return monthAverage / sales.length;
    }

    public int getBelowAverage(long [] sales) {
        long average = getMonthAverage(sales);
        int belowAverage = 0;
        for (int i = 0; i < sales.length; i++){
            if (sales[i] < average) {
                belowAverage++;
            }
        }
        return belowAverage;
    }

    public int getAboveAverage(long [] sales) {
        long average = getMonthAverage(sales);
        int aboveAverage = 0;
        for (int i = 0; i < sales.length; i++){
            if (sales[i] < average) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }
}

