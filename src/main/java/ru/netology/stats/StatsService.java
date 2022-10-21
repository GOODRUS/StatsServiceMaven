package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int averageSales(long[] sales) {
        int average = 0;
        if (sales.length > 0) {
            int sum = 0;
            for (int i = 0; i < sales.length; i++) {
                sum += sales[i];
            }
            average = sum / sales.length;
        }
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int belowAverage(long[] sales) {
        long average = 0;
        if (sales.length > 0) {
            int sum = 0;
            for (int i = 0; i < sales.length; i++) {
                sum += sales[i];
            }
            average = sum / sales.length;
        }

        int monthNumber = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale < average) {
                monthNumber = month;
                month = month + 1;
                /*
                Для вывода значений продаж ниже среднего:
                System.out.println("Продажи были ниже среднего: " + sale);
                 */
                monthNumber++;
            }
        }
        return monthNumber;
    }

    public int aboveAverage(long[] sales) {
        long average = 0;
        if (sales.length > 0) {
            int sum = 0;
            for (int i = 0; i < sales.length; i++) {
                sum += sales[i];
            }
            average = sum / sales.length;
        }

        int monthNumber = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale > average) {
                monthNumber = month;
                month = month + 1;
                /*
                Для вывода значений продаж выше среднего:
                System.out.println("Продажи были выше среднего: " + sale);
                 */
                monthNumber++;
            }
        }
        return monthNumber;
    }
}