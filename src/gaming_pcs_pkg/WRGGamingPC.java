/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gaming_pcs_pkg;

import gaming_pc_factories_pkg.GamingPCFactory;

/**
 *
 * @author yapt
 * Modified by Tai Nguyen
 * The `WRGGamingPC` class represents a gaming PC in the WRG series.
 * It extends the `GamingPC` class and is associated with a specific `GamingPCFactory`.
 * The `equipGamingPC` method is responsible for adding components to the WRG Gaming PC.
 */
public class WRGGamingPC extends GamingPC {

    GamingPCFactory theGamingPCFactory;
    /**
     * Constructs a WRG Gaming PC with the specified GamingPCFactory.
     *
     * @param theGamingPCFactory The factory providing components for the WRG Gaming PC.
     */
    public WRGGamingPC(GamingPCFactory theGamingPCFactory) {
        this.theGamingPCFactory = theGamingPCFactory;
    }
    /**
     * Adds components to the WRG Gaming PC using the associated GamingPCFactory.
     */
    public void equipGamingPC() {
        System.out.println("Adding components to WRG Gaming PC " + getName());

        this.cpu = theGamingPCFactory.createCPU();
        this.ram = theGamingPCFactory.createRAM();
        this.storage = theGamingPCFactory.createStorage();
        this.graphicsAdapter = theGamingPCFactory.createGraphicsAdapter();
    }
    
}
