package com.techreturners.cats;

public abstract class CatSpecies implements Cat {
    protected boolean asleep = false;
    protected String setting = "wild";
    protected int height = 0;
    protected String eatSound = "";

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
    public String eatComment() {
        return this.eatSound;
    }

}
