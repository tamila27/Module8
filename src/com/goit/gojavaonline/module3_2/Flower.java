package com.goit.gojavaonline.module3_2;

import com.goit.gojavaonline.Printable;

public abstract class Flower implements Printable {
    private FlowerColor flowerColor;

    public Flower(FlowerColor flowerColor){
        setFlowerColor(flowerColor);
    }

    public FlowerColor getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(FlowerColor flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String print(){
        String result = String.format("%-10s | %-10s |", getFlowerSpecies(), getFlowerColor() );
        return result;
    }

    public abstract FlowerSpecies getFlowerSpecies();
}
