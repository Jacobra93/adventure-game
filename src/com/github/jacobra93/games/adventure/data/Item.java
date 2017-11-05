package com.github.jacobra93.games.adventure.data;

public class Item {

    // Hide your private parts ;)
    private String itemName;
    private String itemDescription;
    private String itemType;
    private double itemBonus;

    public Item(String name, String desc, String type, double bonus){
        this.itemName = name;
        this.itemDescription = desc;
        this.itemType = type;
        this.itemBonus = bonus;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public String getItemType() {
        return itemType;
    }

    public double getItemBonus() {
        return itemBonus;
    }


    // Not sure what this is?
    public static void items(String[] args) {
        Item woodenSword = new Item("Wooden Sword", "A flimsy wooden sword.", "Strength", .05);
    }
}
