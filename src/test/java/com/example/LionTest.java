package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionTest {
    private Lion lion;

    @Before
    public void setUp() {
        Feline feline = new Feline();
        try {
            lion = new Lion("Самец", feline);
        } catch (Exception exception) {
            String textException = "Используйте допустимые значения пола животного - самец или самка";
            Assert.assertEquals(textException, exception.getMessage());
        }
    }

    @Test
    public void checkGetKittensReturnsValueOne() {
        int actualResult = lion.getKittens();
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkDoesHaveManeThrowsException() {
        Feline feline = new Feline();
        try {
            lion = new Lion("Не опознан", feline);
        } catch (Exception exception) {
            String textException = "Используйте допустимые значения пола животного - самец или самка";
            Assert.assertEquals(textException, exception.getMessage());
        }
    }

    @Test
    public void checkGetFoodReturnsLionFoodList() throws Exception {
        List<String> actualResult = lion.getFood();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedResult, actualResult);
    }
}
