package com.pivottech;

import com.pivottech.states.VendingMachineState;

public class VendingMachine {
    private int currentBalance; //cents
    private Inventory inventory;
    private VendingMachineState state;

    public VendingMachine(Inventory inventory) {
        this.setInventory(inventory);
    }
    public void addBalance(int amount){
        setCurrentBalance(getCurrentBalance() + amount);
    };
    // this example implements Callable, so parsing, error handling and handling user
    // requests for usage help or version help can be done with one line of code.
    public static void main(String... args) {
        System.out.println("abc");
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void insertCoin(Coin coin) throws Exception {
        getState().insertCoin(coin);
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    public VendingMachineState getState() {
        return state;
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }
}