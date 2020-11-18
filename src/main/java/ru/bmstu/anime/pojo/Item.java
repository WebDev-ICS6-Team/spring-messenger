package ru.bmstu.anime.pojo;

public abstract class Item {
    private String itemName;
    private int itemPrice;

    Item(String itemName, int itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public int getPrice() {
        return itemPrice;
    }

    public void setPrice(int price) {
        this.itemPrice = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String name) {
        this.itemName = name;
    }
}
