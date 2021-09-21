package com.techreturners.cats;

import java.util.Random;

public abstract class CatSpecies implements Cat {
    protected boolean asleep = false;
    protected String setting;
    protected int height;
    protected String eatSound;

    public CatSpecies(int height, String setting, String eatSound) {
        this.height = height;
        this.setting = setting;
        this.eatSound = eatSound;
    }


    public boolean isAsleep() {
        return this.asleep;
    }

    public boolean goToSleep() {
        return this.asleep = true;
    }

    public boolean wakeUp() {
        return this.asleep = false;
    }

    public String getSetting() {
        return this.setting;
    }

    public int getAverageHeight() {
        return this.height;
    }

    public String eat() {
        return this.eatSound;
    }

    //eatComment method is only inherited by domestic cats, so is not a method in the interface
    public String eatRandomComment(Random randomNumber) {
        return this.eatSound;
    }

}
