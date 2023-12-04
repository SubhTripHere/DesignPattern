package DesignPattern.OrderManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OrderManager {
    List<User> userList=new ArrayList<>();

    OrderManager(){
        userList=getUserList();
    }
    public List<User> getUserList() {
        userList.add(new User("Henry"));
        userList.add(new User("Sakshi"));
        userList.add(new User("Vedika"));
        return userList;
    }
    public void addCart(Integer userId){
        User user=userList.get(userId);
        user.cartList.add(new Cart());
    }
    public void addToCart(Integer userId, Integer cartId, Item item, Integer quantity){
        User user=userList.get(userId);
        Cart userCart=user.cartList.get(cartId);
        Map<ItemType,Integer> map=userCart.productCountMap;
        if(map.containsKey(item.itemType)){
            map.put(item.itemType,map.get(item.itemType)+quantity);
        }else{
            map.put(item.itemType,quantity);
        }
    }

    public  void removeFromCart(Integer userId, Integer cartId, Item item, Integer quantity) {
        User user = userList.get(userId);
        Cart cart = user.getCart(cartId);
        Map<ItemType, Integer> productMap = cart.productCountMap;
        if (productMap.containsKey(item.itemType)){
            productMap.put(item.itemType,productMap.get(item)-quantity);
        }else {
            System.out.println("Illegal, no product found in the cart,"+cartId);
        }
    }

    private int getTotalCartValue(Integer userId, Integer cartId){
        User user = userList.get(userId);
        int price=0;
        Cart cart=user.getCart(cartId);
        for(Map.Entry<ItemType,Integer> m: cart.productCountMap.entrySet()){
            //int itemPrice=m.getKey();
            int quantity=m.getValue();
            price+=quantity;
        }
        return price;
    }
    public void placeOrder(Integer userId, Integer cartId){
        Integer cartValue=getTotalCartValue(userId,cartId);
        System.out.println("Placed an order worth : "+cartValue+"$");
        //place order call payment Service
    }
}
