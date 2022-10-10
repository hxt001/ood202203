package com.pivottech.states;

import com.pivottech.Coin;
import com.pivottech.VendingMachine;

public class WaitCoinsState implements VendingMachineState {

    private VendingMachine vendingMachine;

    public WaitCoinsState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }


    @Override
    public boolean insertCoin(Coin coin) {
        // verify coin
        vendingMachine.addBalance(coin.getValue());
        if (vendingMachine.getCurrentBalance()>= 2) {
            vendingMachine.setState(new WaitSelectionState(vendingMachine));
        }
        return false;
    }

    @Override
    public boolean selectItem(String itemNo) {
        System.out.println("still waiting for coin, in coin waiting state, can not select item");
        return false;
    }
}
