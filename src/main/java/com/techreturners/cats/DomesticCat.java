package com.techreturners.cats;

import java.util.Random;

public class DomesticCat extends CatSpecies {


    public DomesticCat() {
        super(23, "domestic", "Purrrrrrr");
    }



    @Override
    //created another eat method that will take a random number and change the eat comment if the number is even
    public String eatRandomComment(Random randomNumber) {
        //Overriden the method eat so that if passed a random even number, it will change the eat comment
        if (randomNumber.nextInt(1) % 2 == 0) {
            this.eatSound = "Purrrrrrr. It will do I suppose";
        }
        return this.eatSound;
    }
}
