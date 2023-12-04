package DesignPattern.OrderManagementSystem;

import java.util.List;

public class OderManagementService {
    private static List<User> userList;
    public static void main(String[] args) {
        OrderManager orderManager=new OrderManager();
        orderManager.addCart(0);
        orderManager.addCart(0);
        orderManager.addCart(1);
        orderManager.addToCart(0,0,new Item(ItemType.cold_drinks,10),5);
        orderManager.addToCart(0,0, new Item(ItemType.chips,5),20);
        orderManager.addToCart(1,0,new Item(ItemType.supplements,1000),3);
        orderManager.placeOrder(0,1);
    }
}
