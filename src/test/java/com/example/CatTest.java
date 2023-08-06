package com.example;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CatTest {
    private Cat cat;

    @Before
    public void setUpTest() {
        Feline feline = new Feline();
        cat = new Cat(feline);
    }

    @Test
    public void getSoundTest() {
        String actualResult = cat.getSound();
        String expectedResult = "Мяу";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> actualResult = cat.getFood();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedResult, actualResult);
    }
}