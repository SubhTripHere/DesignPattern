package DesignPattern.StateDesignPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
    int aisleCount;
    Map<Integer, List<Product>> aisleToProduct=new HashMap<>();

    Inventory(Integer aisle){
        this.aisleCount=aisle;
        for(int i=0;i<aisleCount;i++){
            aisleToProduct.put(i,new ArrayList<>());
        }
    }

    public void addProduct(Integer aisleNumber, ProductType productType){
        aisleToProduct.get(aisleNumber).add(new Product());
    }

    public void getProduct(Integer aisleNumber){
        if(aisleToProduct.containsKey(aisleNumber)){
            aisleToProduct.get(aisleNumber).remove(aisleToProduct.get(aisleNumber).size()-1);
            System.out.println("Dispensed Product successfully");
        }else{
            System.out.println("Illegal Operation, dont have a product on the aisle");
        }
    }

}
