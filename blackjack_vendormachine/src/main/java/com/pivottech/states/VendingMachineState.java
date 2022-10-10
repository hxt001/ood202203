package com.pivottech.states;

import com.pivottech.Coin;

public interface VendingMachineState {
    boolean insertCoin(Coin coin) throws Exception;

    boolean selectItem(String itemNo);
}
