package com.techreturners.cats.testhelper;

import java.util.Random;

public class RandomStub extends Random {
    //This class is used to set a value for random number so we can make a deterministic test. This is for use in  CatTest feedTheCatRandomComment
    private int value;

    public RandomStub(int value) {
        this.value = value;
    }

    //has same method signature as Random.nextInt to provide a RandomStub.nextInt implementation
    @Override
    public int nextInt(int value) {
        return this.value;
    }

}