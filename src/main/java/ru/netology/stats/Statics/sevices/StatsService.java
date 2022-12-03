package ru.netology.stats.Statics.sevices;

public class StatsService {
    public int getCountSells(int[] sells){
        int countSells = 0;
        for (int i = 0; i < sells.length; i++){
            countSells = countSells + sells[i];

        }

        return countSells;
    }

    public int maxSales(long[] sells) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sells) {
            if (sale >= sells[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sells) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sells) {
            if (sale <= sells[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int averageSells(long[] sells) {
        int averageSeles = 0;
        int allCount = 0;
        for (int i = 0; i < sells.length; i++) {
            allCount = (int) (allCount + sells[i]);

        }
        averageSeles = allCount / sells.length;
        return averageSeles;
    }

    public int minAverageSells(long[] sells) {
        int minCount = 0;
        int averageSels = averageSells(sells);
        for (int i = 0; i < sells.length; i++){
            if (sells[i] < averageSels){
                minCount++;
            }
        }
        return minCount;
    }

    public int maxAverageSells(long[] sells) {
        int maxCount = 0;
        int averageSels = averageSells(sells);
        for (int i = 0; i < sells.length; i++){
            if (sells[i] > averageSels){
                maxCount++;
            }
        }
        return maxCount;
    }


}
