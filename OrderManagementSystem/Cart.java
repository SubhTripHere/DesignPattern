package DesignPattern.OrderManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    static int ind=0;
    int cart_id;
    Map<ItemType,Integer> productCountMap;

    public Cart(){
        this.cart_id=ind++;
        productCountMap=new HashMap<>();
    }

//    public void addToCart(Item item, int quantity){
//        if(productCountMap.containsKey(item)){
//            productCountMap.put(item,productCountMap.get(item)+quantity);
//        }else{
//            productCountMap.put(item,1);
//        }
//    }
//
//    public void removeFromCart(Item item,Integer quantity){
//        if(productCountMap.containsKey(item)){
//            productCountMap.put(item,productCountMap.get(item)-quantity);
//        }else{
//            System.out.println("Illegal try, no item found to remove");
//        }
//    }
//
//    public int getTotalCartValue(Integer id){
//        Integer price=0;
//        for(Map.Entry<Item,Integer> m: productCountMap.entrySet()){
//            int count=m.getValue();
//            int pricePerItem=m.getKey().price;
//            price+=count*pricePerItem;
//        }
//
//        return price;
//    }
}
