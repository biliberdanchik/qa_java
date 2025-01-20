package com.example;

import java.util.List;

public class LionAlex extends Lion {

    public LionAlex(Feline feline) {
        this.feline = feline;
        this.hasMane = true;
    }

    public List<String> getFriends() {
        return List.of("зебра Марти", "бегемотиха Глории", "жираф Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return feline.getKittens(0);
    }
}
