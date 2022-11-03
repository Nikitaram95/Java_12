package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManagerTest {
    @Test
    void findAll() {
        String movie1 = "BloodShot";
        String movie2 = "Onward";
        String movie3 = "HotelBelgrad";
        String movie4 = "TheGentlemen";
        String movie5 = "TheInvisibleMan";
        String movie6 = "Trolls";
        String movie7 = "NumberOne";
        String movie8 = "TheLastOfUs";
        String movie9 = "Terminator";
        String movie10 = "KingKong";

        Manager manager = new Manager();
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        String[] expected = {
                movie1,
                movie2,
                movie3,
                movie4,
                movie5,
                movie6,
                movie7,
                movie8,
                movie9,
                movie10,
        };
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findLast() {
        String movie1 = "BloodShot";
        String movie2 = "Onward";
        String movie3 = "HotelBelgrad";
        String movie4 = "TheGentlemen";
        String movie5 = "TheInvisibleMan";
        String movie6 = "Trolls";
        String movie7 = "NumberOne";
        String movie8 = "TheLastOfUs";
        String movie9 = "Terminator";
        String movie10 = "KingKong";
        ;

        Manager manager = new Manager();
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        String[] expected = {
                movie10,
                movie9,
                movie8,
                movie7,
                movie6,
                movie5,
                movie4,
                movie3,
                movie2,
                movie1,
        };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}



