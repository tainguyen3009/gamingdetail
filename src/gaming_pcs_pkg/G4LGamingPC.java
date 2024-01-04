/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gaming_pcs_pkg;

import gaming_pc_factories_pkg.GamingPCFactory;

/**
 *
 * @author yapt
 * Modified by Tai nguyen
 * The `G4LGamingPC` class represents a gaming PC in the G4L series.
 * It extends the `GamingPC` class and is associated with a specific `GamingPCFactory`.
 * The `equipGamingPC` method is responsible for adding components to the G4L Gaming PC.
 */
public class G4LGamingPC extends GamingPC {
    
    GamingPCFactory theGamingPCFactory;
    
    /**
     * Constructs a G4L Gaming PC with the specified GamingPCFactory.
     *
     * @param theGamingPCFactory The factory providing components for the G4L Gaming PC.
     */
    public G4LGamingPC(GamingPCFactory theGamingPCFactory) {
        this.theGamingPCFactory = theGamingPCFactory;
    }
    
    /**
     * Adds components to the G4L Gaming PC using the associated GamingPCFactory.
     */
    public void equipGamingPC() {
        System.out.println("Adding components to G4L Gaming PC " + getName());
        this.cpu = theGamingPCFactory.createCPU();
        this.ram = theGamingPCFactory.createRAM();
        this.storage = theGamingPCFactory.createStorage();
        this.graphicsAdapter = theGamingPCFactory.createGraphicsAdapter();

    }
    
}
