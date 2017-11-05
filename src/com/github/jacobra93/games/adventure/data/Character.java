package com.github.jacobra93.games.adventure.data;

import com.github.jacobra93.games.adventure.enums.Speciality;

import java.util.ArrayList;
import java.util.List;

public class Character {

    private String name;
    private List<Item> itemList = new ArrayList<>();

    // Should these be ints, or can you be level '1.5'?

    private double level = 1;
    private double magicLevel = 0;
    private double strengthLevel = 0;

    public Character (String name) {
        this.name = name;
    }

    public void levelUp() {
        level++;
    }

    public void increaseSpecialty(Speciality specialty) {
        if (specialty == Speciality.MAGIC) {
            magicLevel++;
        } else if (specialty == Speciality.STRENGTH) {
            strengthLevel++;
        }
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void loseItem(Item item) {
        itemList.remove(item);
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", itemList=" + itemList +
                ", level=" + level +
                ", magicLevel=" + magicLevel +
                ", strengthLevel=" + strengthLevel +
                '}';
    }
}
