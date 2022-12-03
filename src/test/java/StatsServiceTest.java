package ru.netology.stats.Statics.sevices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void countSells() {
        StatsService service = new StatsService();
        int[] sells = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expectedCount = 180;
        int actualCount = service.getCountSells(sells);

        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void maxSeles(){
        StatsService service = new StatsService();
        long[] sells = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expectedMaxDay = 8;
        int actualMaxDay = service.maxSales(sells);

        Assertions.assertEquals(expectedMaxDay, actualMaxDay);
    }

    @Test
    public void minSeles() {
        StatsService service = new StatsService();
        long[] sells = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expectedMinDay = 9;
        int actualMinDay = service.minSales(sells);

        Assertions.assertEquals(expectedMinDay, actualMinDay);


    }

    @Test
    public  void averageSeles() {
        StatsService service = new StatsService();
        long[] sells = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expectedAverage = 15;
        int actualAverage = service.averageSells(sells);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void minAverageSells() {
        StatsService service = new StatsService();
        long[] sells = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expectedMinAverage = 5;
        int actualMinAverage = service.minAverageSells(sells);

        Assertions.assertEquals(expectedMinAverage, actualMinAverage);
    }

    @Test
    public void maxAverageSells() {
        StatsService service = new StatsService();
        long[] sells = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expectedMaxAverage = 5;
        int actualMaxAverage = service.maxAverageSells(sells);

        Assertions.assertEquals(expectedMaxAverage, actualMaxAverage);
    }




}
