package com.pivottech.states;

import com.pivottech.*;

public class WaitSelectionState implements VendingMachineState{
    private VendingMachine vendingMachine;
    public WaitSelectionState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }
    @Override
    public boolean insertCoin(Coin coin) throws Exception {
        throw new Exception("wrong operation in WaitSelectionState");

    }

    @Override
    public boolean selectItem(String itemNo) {
        Slot slot = Slot.createFromString(itemNo);
        Inventory inventory = vendingMachine.getInventory();
        ProductItem productItem = inventory.getProductInSlot(slot);
        inventory.dispense(productItem);
        return false;
    }
}
