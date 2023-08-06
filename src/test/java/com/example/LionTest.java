package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTest {
    private Lion lion;

    private final String sex;
    private final Object expectedResult;

    public LionTest(String sex, boolean expectedResult) {
        this.sex = sex;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
   public static Object[][] getTestData() {
       return new Object[][]{
               {"Самец", true},
               {"Самка", false},
       };
   }

    @Before
    public void setUp() {
        Feline feline = new Feline();
        try {
            lion = new Lion(sex, feline);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void getKittensTest() {
        int actualResult = lion.getKittens();
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void doesHaveManeTest() {
        boolean actualResult = lion.doesHaveMane();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> actualResult = lion.getFood();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedResult, actualResult);
    }
}