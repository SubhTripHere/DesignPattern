package DesignPattern.OrderManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class User {
    static int ind=0;
    int userId;
    String name;
    List<Cart> cartList;
    List<Order> orderList;

    User(String name){
        this.name=name;
        this.userId=ind++;
        this.cartList=new ArrayList<>();
        this.orderList=new ArrayList<>();
    }

    public Cart getCart(Integer cartId){
        return cartList.get(cartId);
    }

}
