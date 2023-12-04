package DesignPattern.OrderManagementSystem;

public class Item {
    ItemType itemType;
    Integer price;

    public Item(ItemType itemType,Integer price) {
        this.itemType = itemType;
        this.price = price;
    }
}
