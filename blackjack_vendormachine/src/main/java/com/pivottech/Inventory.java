package com.pivottech;

import java.util.HashMap;

public class Inventory {
    HashMap<ProductItem, Integer> productItemMap = new HashMap<>();
    HashMap<Slot, ProductItem> productItemLocation = new HashMap<>();

    public void refill(ProductItem productItem, int quantity) {
        productItemMap.put(productItem, productItemMap.getOrDefault(productItem, 0) + quantity);
    }

    public boolean dispense(ProductItem productItem) {
        if (productItemMap.get(productItem) ==0) {
            return false;
        }
        productItemMap.put(productItem, productItemMap.get(productItem) -1);
        return true;
    }

    public ProductItem getProductInSlot(Slot slot) {
        return productItemLocation.get(slot);
    }
}
