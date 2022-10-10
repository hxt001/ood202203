package com.pivottech;

public class VendingMachineFactory {
    public static VendingMachine createVendingMachine() { return new VendingMachine(new Inventory()); }

}
