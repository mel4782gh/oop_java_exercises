package com.techreturners.cats;

import com.techreturners.cats.testhelper.RandomStub;
import org.junit.Test;

import java.util.Random;


import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void checkCatIsAwake() {
        Cat domesticCat = new DomesticCat();
        assertFalse("Cat should be awake by default", domesticCat.isAsleep());
    }

    @Test
    public void checkCatCanGoToSleep() {
        Cat domesticCat = new DomesticCat();
        domesticCat.goToSleep();
        assertTrue("Cat should be snoozing ", domesticCat.isAsleep());
    }


    @Test
    public void checkCatCanWakep() {
        Cat domesticCat = new DomesticCat();
        domesticCat.goToSleep();
        domesticCat.wakeUp();
        assertFalse("Cat should be awake now", domesticCat.isAsleep());
    }


    @Test
    public void checkCatSetting() {
        Cat domesticCat = new DomesticCat();
        assertEquals("domestic", domesticCat.getSetting());
    }


    @Test
    public void checkCatHeight() {
        Cat domesticCat = new DomesticCat();
        assertEquals(23, domesticCat.getAverageHeight());
    }


    @Test
    public void checkLionHeight() {
        Cat lionCat = new LionCat();
        assertEquals(1100, lionCat.getAverageHeight());
    }


    @Test
    public void feedTheLion() {
        Cat lionCat = new LionCat();
        assertEquals("Roar!!!!", lionCat.eat());
    }


    @Test
    public void feedTheCheetah() {
        Cat cheetahCat = new CheetahCat();
        assertEquals("Zzzzzzz", cheetahCat.eat());
    }

    @Test
    public void feedTheCat() {
        Cat domesticCat = new DomesticCat();
        assertEquals("Purrrrrrr", domesticCat.eat());
    }

    @Test
    public void feedTheCatRandomComment() {
        //Arrange test - this test is set up with a testing double - a stub for Random class. The stub sets a random number to a specific value so we can use it in a deterministic test.
        Random randomStub = new RandomStub(2);
        DomesticCat domesticCat = new DomesticCat();

        //Act - call the eatRandomComment method that passes a 'determined' random number so can test will amend the comment if the number is even
        //Assert that the comment is amended
        assertEquals("Purrrrrrr. It will do I suppose", domesticCat.eatRandomComment(randomStub));
    }
}
