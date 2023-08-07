package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    private Feline feline;

    @Test
    public void checkEatMeatReturnsFelineFoodList() throws Exception {
        List<String> actualResult = feline.eatMeat();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void checkGetFamilyReturnsTypeFeline() {
        String actualResult = feline.getFamily();
        String expectedResult = "Кошачьи";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkGetKittensReturnsValueOfParameter() {
        int actualResult = feline.getKittens(2);
        int expectedResult = 2;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkGetKittensReturnsValueOne() {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }
}