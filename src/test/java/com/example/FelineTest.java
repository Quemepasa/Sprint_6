package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy // шпион для объекта
    private Feline feline;

    @Test
    public void eatMeatTest() throws Exception {
        List<String> actualResult = feline.eatMeat();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void getFamilyTest() {
        String actualResult = feline.getFamily();
        String expectedResult = "Кошачьи";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getKittensWithParametersTest() {
        int actualResult = feline.getKittens(2);
        int expectedResult = 2;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getKittensWithoutParametersTest() {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }
}