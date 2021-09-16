package com.techreturners.cats;

public class DomesticCat extends CatSpecies {
    @Override
    public String getSetting() {
        return super.setting = "domestic";
    }

    @Override
    public int getAverageHeight() {
        return super.height = 23;
    }

    @Override
    public String eat() {
        return super.eatSound = "Purrrrrrr";
    }

    @Override
    public String eatComment() {
        return super.eatSound = "Purrrrrrr. It will do I suppose";
    }
}
