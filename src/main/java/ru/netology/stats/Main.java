package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        System.out.println("Сумма всех продаж: " + service.sumSales(sales));
        System.out.println("Средня сумма продаж в месяц: " + service.averageSales(sales));
        System.out.println("Номер месяца, в котором был пик продаж: " + service.maxSales(sales));
        System.out.println("Номер месяца, в котором был минимум продаж: " + service.minSales(sales));
        System.out.println("Количество месяцев, в которых продажи были ниже среднего: " + service.belowAverage(sales));
        System.out.println("Количество месяцев, в которых продажи были выше среднего: " + service.aboveAverage(sales));
    }
}